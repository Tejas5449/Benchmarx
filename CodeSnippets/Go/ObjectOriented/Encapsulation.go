// Go program to illustrate
// the concept of encapsulation
// using exported function
package main

import (
	"fmt"
	"runtime"
	"strings"
	"time"
)

func Encapsulation() {
	// Creating a slice of strings
	slc := []string{"GeeksforGeeks", "geeks", "gfg"}

	// Convert the case of the
	// elements of the given slice
	// Using ToUpper() function
	for x := 0; x < len(slc); x++ {

		// Exported Method
		res := strings.ToUpper(slc[x])

		// Exported Method
		fmt.Println(res)
	}

}
func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		Encapsulation()
		runtime.ReadMemStats(&m2)
		fmt.Println(time.Since(start))
		//Thread caching malloc
		fmt.Println("total:", m2.TotalAlloc-m1.TotalAlloc)
		fmt.Println("mallocs:", m2.Mallocs-m1.Mallocs)
	}
	PrintMemUsage()
}
func PrintMemUsage() {
	var m runtime.MemStats
	runtime.ReadMemStats(&m)
	fmt.Printf("Alloc = %v KB", bToMb(m.Alloc))
	fmt.Printf("\tTotalAlloc = %v KB", bToMb(m.TotalAlloc))
	fmt.Printf("\tSys = %v KB", bToMb(m.Sys))
	fmt.Printf("\tNumGC = %v\n", m.NumGC)
}
func bToMb(b uint64) uint64 {
	return b / 1024
}

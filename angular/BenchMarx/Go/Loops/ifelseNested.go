package main

import (
	"fmt"
	"runtime"
	"time"
)

func ifelseNestedLoop() {
	// taking a local variable
	var v1 int = 700

	// checking the condition
	if v1 == 100 {

		// if condition is true then
		// display the following */
		fmt.Printf("Value of v1 is 100\n")

	} else if v1 == 200 {

		fmt.Printf("Value of a is 20\n")

	} else if v1 == 300 {

		fmt.Printf("Value of a is 300\n")

	} else {

		// if none of the conditions is true
		fmt.Printf("None of the values is matching\n")
	}

}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		ifelseNestedLoop()
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

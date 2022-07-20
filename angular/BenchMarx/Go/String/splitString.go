package main

import (
	"fmt"
	"runtime"
	"strings"
	"time"
)

// Main method
func splitString() {

	str1 := "Welcome, to the, online portal, of GeeksforGeeks"
	str2 := "My dog name is Dollar"
	str3 := "I like to play Ludo"

	// Displaying strings
	fmt.Println("String 1: ", str1)
	fmt.Println("String 2: ", str2)
	fmt.Println("String 3: ", str3)

	// Splitting the given strings
	// Using Split() function
	res1 := strings.Split(str1, ",")
	res2 := strings.Split(str2, "")
	res3 := strings.Split(str3, "!")
	res4 := strings.Split("", "GeeksforGeeks, geeks")

	// Displaying the result

	fmt.Println("\nResult 1: ", res1)
	fmt.Println("Result 2: ", res2)
	fmt.Println("Result 3: ", res3)
	fmt.Println("Result 4: ", res4)
}
func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		splitString()
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

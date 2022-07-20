package main

import (
	"fmt"
	"runtime"
	"time"
)

func ifLoop() {
	var v int = 700

	// using if statement for
	// checking the condition
	if v < 1000 {
		for i := 0; i < 1000; i++ {
		}

		fmt.Printf("v is less than 1000\n")
	} else {
		for i := 0; i < 1000; i++ {
		}
		fmt.Printf("v is less than 100\n")

	}
	// print the following if
	// condition evaluates to true
	// fmt.Printf("v is less than 1000\n")
}

//	fmt.Printf("Value of v is : %d\n", v)

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		ifLoop()
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

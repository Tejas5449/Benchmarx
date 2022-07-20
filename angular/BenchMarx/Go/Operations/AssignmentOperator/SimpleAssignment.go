package main

import (
	"fmt"
	"runtime"
	"time"
)

func simpleassignment(p, q int) {
	p = q
	fmt.Println(p)

}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		simpleassignment(2002342342342340, 40234234234234000)
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

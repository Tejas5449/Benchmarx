package main

import (
	"fmt"
	"runtime"
	"time"
)

func switchLoop() {

forLoop:
	for number := 1; number < 10; number++ {
		fmt.Printf("%d", number)
		switch {
		case number == 1:
			fmt.Println("-- One")
		case number == 2:
			fmt.Println("-- Two")
		case number == 3:
			fmt.Println("-- Three")
		case number == 4:
			fmt.Println("-- Four")
		case number == 5:
			fmt.Println("-- Five")
		case number == 6:
			fmt.Println("-- Six")
		case number > 2:
			fmt.Println("-- Greater than two")
			break forLoop
		case number == 8:
			fmt.Println("-- Eight")
		case number == 9:
			fmt.Println("-- Nine")
		default:
			fmt.Println("-- Number not identified")
		}
	}
}
func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		switchLoop()
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

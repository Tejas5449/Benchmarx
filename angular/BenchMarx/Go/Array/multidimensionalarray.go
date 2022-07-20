package main

import (
	"fmt"
	"runtime"
	"time"
)

func multidimensionalarray() {
	arr := [3][3]string{{"C#", "C", "Python"},
		{"Java", "Scala", "Perl"},
		{"C++", "Go", "HTML"}}

	// Accessing the values of the
	// array Using for loop
	fmt.Println("Elements of Array 1")
	for x := 0; x < 3; x++ {
		for y := 0; y < 3; y++ {
			fmt.Println(arr[x][y])
		}
	}

	// Creating a 2-dimensional
	// array using var keyword
	// and initializing a multi
	// -dimensional array using index
	var arr1 [2][2]int
	arr1[0][0] = 100
	arr1[0][1] = 200
	arr1[1][0] = 300
	arr1[1][1] = 400

	// Accessing the values of the array
	fmt.Println("Elements of array 2")
	for p := 0; p < 2; p++ {
		for q := 0; q < 2; q++ {
			fmt.Println(arr1[p][q])

		}
	}

}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		multidimensionalarray()
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

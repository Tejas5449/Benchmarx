// Golang program to illustrate the
// concept of multiple inheritances
package main

import (
	"fmt"
	"runtime"
	"time"
)

// declaring first
// base struct
type first struct {

	// declaring struct variable
	base_one string
}

// declaring second
// base struct
type second struct {

	// declaring struct variable
	base_two string
}

// function to return
// first struct variable
func (f first) printBase1() string {

	// returns a string
	// of first struct
	return f.base_one
}

// function to return
// second struct variable
func (s second) printBase2() string {

	// returns a string
	// of first struct
	return s.base_two
}

// child struct which
// embeds both base structs
type child struct {

	// anonymous fields,
	// struct embedding
	// of multiple structs
	first
	second
}

func MultipleInheritance() {
	// declaring an instance
	// of child struct
	c1 := child{

		// child struct can directly
		// access base struct variables
		first{
			base_one: "In base struct 1.",
		},
		second{
			base_two: "\nIn base struct 2.\n",
		},
	}

	// child struct can directly
	// access base struct methods

	// printing base method
	// using instance of child struct
	fmt.Println(c1.printBase1())
	fmt.Println(c1.printBase2())

}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		MultipleInheritance()
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

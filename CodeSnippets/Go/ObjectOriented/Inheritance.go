// Go program to illustrate
// the concept of encapsulation
// using exported function
package main

import (
	"fmt"
	"runtime"
	"time"
)

type Comic struct {

	// declaring struct variable
	Universe string
}

// function to return the
// universe of the comic
func (comic Comic) ComicUniverse() string {

	// returns comic universe
	return comic.Universe
}

// declaring a struct
type Marvel struct {

	// anonymous field,
	// this is composition where
	// the struct is embedded
	Comic
}

// declaring a struct
type DC struct {

	// anonymous field
	Comic
}

func Inheritance() {
	// creating an instance
	c1 := Marvel{

		// child struct can directly
		// access base struct variables
		Comic{
			Universe: "MCU",
		},
	}

	// child struct can directly
	// access base struct methods

	// printing base method using child
	fmt.Println("Universe is:", c1.ComicUniverse())

	c2 := DC{
		Comic{
			Universe: "DC",
		},
	}

	// printing base method using child
	fmt.Println("Universe is:", c2.ComicUniverse())
}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		Inheritance()
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

// Go program to illustrate
// the concept of encapsulation
// using exported function
package main

import (
	"fmt"
	"runtime"
	"time"
)

// defining an interface
type Figure interface {
	Area() float64
}

// declaring a struct
type Rectangle struct {

	// declaring struct variables
	length float64
	width  float64
}

// declaring a struct
type Square struct {

	// declaring struct variable
	side float64
}

// function to calculate
// area of a rectangle
func (rect Rectangle) Area() float64 {

	// Area of rectangle = l * b
	area := rect.length * rect.width
	return area
}

// function to calculate
// area of a square
func (sq Square) Area() float64 {

	// Area of square = a * a
	area := sq.side * sq.side
	return area
}

func Interface() {
	// declaring a rectangle instance
	rectangle := Rectangle{

		length: 10.5,
		width:  12.25,
	}

	// declaring a square instance
	square := Square{

		side: 15.0,
	}

	// printing the calculated result
	fmt.Printf("Area of rectangle: %.3f unit sq.\n", rectangle.Area())
	fmt.Printf("Area of square: %.3f unit sq.\n", square.Area())
}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		Interface()
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

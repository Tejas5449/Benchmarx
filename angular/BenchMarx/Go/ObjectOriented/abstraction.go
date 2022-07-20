// Go program to illustrate
// the concept of encapsulation
// using exported function
package main

import (
	"fmt"
	"runtime"
	"time"
)

// Define a new data type "Triangle"
type Triangle struct {
	base, height float32
}

// Define a new data type "Square"
type Square struct {
	length float32
}

// Define a new data type "Rectangle"
type Rectangle struct {
	length, width float32
}

// Define a new data type "Circle"
type Circle struct {
	radius float32
}

// A method for type "Triangle"
func (t Triangle) Area() float32 {
	return 0.5 * t.base * t.height
}

// A method for type "Square"
func (l Square) Area() float32 {
	return l.length * l.length
}

// A method for type "Rectangle"
func (r Rectangle) Area() float32 {
	return r.length * r.width
}

// A method for type "Circle"
func (c Circle) Area() float32 {
	return 3.14 * (c.radius * c.radius)
}

// Define an interface as achieve abstraction
type Area interface {
	Area() float32
}

func Abstraction() {
	// Declare and assign values to varaibles
	t := Triangle{base: 15, height: 25}
	s := Square{length: 5}
	r := Rectangle{length: 5, width: 10}
	c := Circle{radius: 5}

	// Define a variable of type interface
	var a Area

	// Assign to the interface a variable of type "Triangle"
	a = t
	fmt.Println("Area of Triangle", a.Area())

	// Assign to the interface a variable of type "Square"
	a = s
	fmt.Println("Area of Square", a.Area())

	// Assign to the interface a variable of type "Rectangle"
	a = r
	fmt.Println("Area of Rectangle", a.Area())

	// Assign to the interface a variable of type "Circle"
	a = c
	fmt.Println("Area of Circle", a.Area())
}

func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		Abstraction()
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

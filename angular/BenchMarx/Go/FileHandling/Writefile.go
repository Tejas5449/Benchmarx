package main

import (
	"fmt"
	"io/ioutil"
	"runtime"
	"time"
)

func Writefile() {
	mydata := []byte("All the data I wish to write to a file")

	// the WriteFile method returns an error if unsuccessful
	err := ioutil.WriteFile("myfile.data", mydata, 0777)
	// handle this error
	if err != nil {
		// print it out
		fmt.Println(err)
	}

	data, err := ioutil.ReadFile("myfile.data")
	if err != nil {
		fmt.Println(err)
	}

	fmt.Print(string(data))

}
func main() {
	{
		start := time.Now()
		var m1, m2 runtime.MemStats
		runtime.GC()
		runtime.ReadMemStats(&m1)
		Writefile()
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

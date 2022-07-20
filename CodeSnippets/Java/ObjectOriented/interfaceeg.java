// Java program to demonstrate working of
// interface
  
import java.io.*;
  
// A simple interface
interface In1 {
    
    // public, static and final
    final int a = 10;
  
    // public and abstract
    void display();
}



 class interfaceeg implements In1{
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
      // Implementing the capabilities of
    // interface.
    public void display(){ 
        System.out.println("Geek"); 
      }
      public static void main(String[] args) {
        
        long startTime = System.nanoTime();

        interfaceeg t = new interfaceeg();
        t.display();
        System.out.println(a);

       
       
        
  
       
            
            Runtime runtime = Runtime.getRuntime();
            // Run the garbage collector
            runtime.gc();
            // Calculate the used memory
            long memory = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Used memory is bytes: " + memory);
            System.out.println("Used memory is megabytes: "
                    + bytesToMegabytes(memory));
           
          
        long endTime = System.nanoTime();
        long execution = (endTime - startTime);
        System.out.println("execution time: "+execution+"ns");
        
       

        } 
}
    


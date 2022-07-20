// Java program to demonstrate How Diamond Problem
// Is Handled in case of Default Methods
 
// Interface 1
interface GPI {
 
    // Default method
    default void show()
    {
 
        // Print statement
        System.out.println("Default GPI");
    }
}
 
// Interface 2
// Extending the above interface
interface PI1 extends GPI {
}
 
// Interface 3
// Extending the above interface
interface PI2 extends GPI {
}

 class MultipleInheritance implements PI1, PI2  {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static void main(String[] args)throws Exception {
        
        long startTime = System.nanoTime();

              // Creating object of this class
        // in main() method
        MultipleInheritance d = new MultipleInheritance();
 
        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();
       
       
        
  
       
           
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



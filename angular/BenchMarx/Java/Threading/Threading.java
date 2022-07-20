public class Threading extends Thread {
    
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    
   
        public void run()
    {
       // int i=1;
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
           // return i;
        }
    }

            
    
    public static void main(String[] args)throws Exception {
        
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
           Threading object
                = new Threading();
            object.start();
        }
    
        
            long startTime = System.nanoTime();

    
           
           
            
      
           
            Threading h=new Threading();
                System.out.println("Result : ");
              //  System.out.println(h.run());
                System.out.println();
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

public class Leftshift {
   
        private static final long MEGABYTE = 1024L * 1024L;
        
        public static long bytesToMegabytes(long bytes) {
            return bytes / MEGABYTE;
        }
        public int leftshift(){
           // Declaring variables
        int num1 = 8;
    
        
    
        // Displaying the assigned values
        System.out.println(" left shift: " + (num1 << 2));
        return num1;
         }
        
        public static void main(String[] args)throws Exception {
            
            long startTime = System.nanoTime();
    
    
           
           
            
      
           
            Leftshift   h=new  Leftshift  ();
                System.out.println("Result : ");
                System.out.println(h.leftshift());
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
    
    
      
    


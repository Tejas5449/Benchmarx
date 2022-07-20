public class SubtractionAssignment {
   
        private static final long MEGABYTE = 1024L * 1024L;
    
        public static long bytesToMegabytes(long bytes) {
            return bytes / MEGABYTE;
        }
        public int subAssignment(){
           // Declaring variables
        int num1 = 10, num2 = 20;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Adding & Assigning values
        num1 -= num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
        return num1;
         }
        
        public static void main(String[] args)throws Exception {
            
            long startTime = System.nanoTime();
    
    
           
           
            
      
           
           SubtractionAssignment h=new  SubtractionAssignment();
                System.out.println("Result : ");
                System.out.println(h.subAssignment());
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


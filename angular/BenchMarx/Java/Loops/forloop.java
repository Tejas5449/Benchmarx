public class forloop {
   private static final long MEGABYTE = 1024L * 1024L;
   
       public static long bytesToMegabytes(long bytes) {
           return bytes / MEGABYTE;
       }
       
       public long forloop(){
           long i;
        for ( i = 1; i <= 10000000; i++){

        }
          
    
            return i;   
       }
       public static void main(String[] args)throws Exception {
           
               long startTime = System.nanoTime();
   
       
              
              
               
         
              
                   forloop h=new forloop();
                   System.out.println("Result : ");
                   System.out.println(h.forloop());
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
   

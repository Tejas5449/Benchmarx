public class ifelsenested {
    private static final long MEGABYTE = 1024L * 1024L;
   
       public static long bytesToMegabytes(long bytes) {
           return bytes / MEGABYTE;
       }
       
       public int ifelsenested (){
           // initializing expression
        int i = 20;
 
        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");
 
        // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");
 
        // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");
 
        else
            System.out.println("i is not present\n");
 
        System.out.println("Outside if-else-if");
        return i;  
    }
    
            
       
       public static void main(String[] args)throws Exception {
           
               long startTime = System.nanoTime();
   
       
              
              
               
         
              
               ifelsenested h=new ifelsenested();
                   System.out.println("Result : ");
                   System.out.println(h.ifelsenested());
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
   
   
   
   


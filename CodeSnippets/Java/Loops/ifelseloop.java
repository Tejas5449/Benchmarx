public class ifelseloop {
   
        private static final long MEGABYTE = 1024L * 1024L;
   
       public static long bytesToMegabytes(long bytes) {
           return bytes / MEGABYTE;
       }
       
       public String ifelseloop (){
         String str = "geeksforgeeks";
 
        if (str == "geeks")
            System.out.println("Hello geek");
        else
            System.out.println("Welcome to GeeksforGeeks");
            return str;   
       }
       
       public static void main(String[] args)throws Exception {
           
               long startTime = System.nanoTime();
   
       
              
              
               
         
              
               ifelseloop h=new  ifelseloop();
                   System.out.println("Result : ");
                   System.out.println(h.ifelseloop());
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
    
   
   
   
   


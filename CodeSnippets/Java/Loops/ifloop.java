public class ifloop {
     private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    
    public int ifloop (){
       // String str = "GeeksforGeeks";
        int i = 1000;
 
        // if block
        if (i == 1000) {
            i++;
           // System.out.println(str);
        }
 
         return i;   
    }
    public static void main(String[] args)throws Exception {
        
            long startTime = System.nanoTime();

    
           
           
            
      
           
                ifloop h=new ifloop();
                System.out.println("Result : ");
                System.out.println(h.ifloop());
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




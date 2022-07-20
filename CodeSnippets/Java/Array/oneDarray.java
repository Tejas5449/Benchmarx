
public class oneDarray
{
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    
    public boolean array1(){
        int[] arr = new int[10000];     
        
 
        for (int i = 0; i <= arr.length; i++){

        }
        return false;
            
    }
    public static void main(String[] args)throws Exception {
        
            long startTime = System.nanoTime();

    
           
           
            
      
           
                oneDarray h=new oneDarray();
                System.out.println("Result : ");
                System.out.println(h.array1());
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


public class twoDarray {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public boolean TwoDArray(){

          
                int[][] arr = { { 1, 2 }, { 3, 4 } };
          
                System.out.println("arr[0][0] = " + arr[0][0]);
                return true;
            }
            public static void main(String[] args)throws Exception {
      
                long startTime = System.nanoTime();
        
               
                
          
               
                    twoDarray h=new twoDarray();
                     System.out.println(h.TwoDArray());
                    System.out.println();

                    Runtime runtime = Runtime.getRuntime();
                    // Run the garbage collector
                    runtime.gc();
                    // Calculate the used memory
                    long memory = runtime.totalMemory() - runtime.freeMemory();
                    System.out.println(runtime.totalMemory());
                    System.out.println(runtime.freeMemory());
                    System.out.println("Used memory is bytes: " + memory);
                    System.out.println("Used memory is megabytes: "
                            + bytesToMegabytes(memory));
                   
           
                   
                 long endTime = System.nanoTime();
                long execution = (endTime - startTime);
                System.out.println("execution time: "+execution+"ns");
                
               
        
                }   



        }

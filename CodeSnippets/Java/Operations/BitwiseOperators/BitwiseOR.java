public class BitwiseOR {
    private static final long MEGABYTE = 1024L * 1024L;
    
    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public int bitwiseOR(){
       // Declaring variables
    int num1 = 10, num2 = 20;

    

    // Displaying the assigned values
    System.out.println("num1|num2 = " + (num1 | num2));
    return num1|num2;
     }
    
    public static void main(String[] args)throws Exception {
        
        long startTime = System.nanoTime();


       
       
        
  
       
        BitwiseOR  h=new  BitwiseOR ();
            System.out.println("Result : ");
            System.out.println(h.bitwiseOR());
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


  




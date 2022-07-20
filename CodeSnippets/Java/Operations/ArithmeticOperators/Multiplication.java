import java.util.concurrent.TimeUnit;

public class Multiplication  {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public void mult(long a,long b){
        long c=a*b;
        System.out.println("Multiplication  is: "+c);

    }
    public static void main(String[] args){
        long startTime = System.nanoTime();

         
        
        Multiplication  a=new Multiplication ();
        a.mult(151245567,78455512);  
       
        
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
		System.out.println("execution  "+execution+"ns");
        
       }  
    }
    
  




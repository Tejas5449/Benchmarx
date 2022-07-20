public class splitstring {
   


    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public String splitString(){
       
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);
 
        for (String a : arrOfStr){}

        return str;
    }
    public static void main(String[] args){
        long startTime = System.nanoTime();

        
        
        splitstring a=new splitstring();
        a.splitString();  
       
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
    
  




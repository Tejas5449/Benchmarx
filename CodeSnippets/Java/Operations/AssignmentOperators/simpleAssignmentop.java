public class simpleAssignmentop {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public int simpleAssignment()
    {
        // Declaring variables
        int num;
        String name;
 
        // Assigning values
        num = 10;
        name = "GeeksforGeeks";
 
        // Displaying the assigned values
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);
        return num;
    }
    public static void main(String[] args)throws Exception {
        
        long startTime = System.nanoTime();


       
       
        
  
       
        simpleAssignmentop h=new simpleAssignmentop();
            System.out.println("Result : ");
            System.out.println(h.simpleAssignment());
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



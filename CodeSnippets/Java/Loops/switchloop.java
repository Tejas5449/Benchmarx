public class switchloop {
   
        private static final long MEGABYTE = 1024L * 1024L;
   
       public static long bytesToMegabytes(long bytes) {
           return bytes / MEGABYTE;
       }
       
       public String switchloop(){
        int day = 5;
        String dayString;
 
        // Switch statement with int data type
        switch (day) {
 
        // Case
        case 1:
            dayString = "Monday";
            break;
 
        // Case
        case 2:
            dayString = "Tuesday";
            break;
 
            // Case
        case 3:
            dayString = "Wednesday";
            break;
 
            // Case
        case 4:
            dayString = "Thursday";
            break;
 
        // Case
        case 5:
            dayString = "Friday";
            break;
 
            // Case
        case 6:
            dayString = "Saturday";
            break;
 
            // Case
        case 7:
            dayString = "Sunday";
            break;
 
        // Default case
        default:
            dayString = "Invalid day";
        }
       
        return dayString; 
    }
             
       
       public static void main(String[] args)throws Exception {
           
               long startTime = System.nanoTime();
   
       
              
              
               
         
              
               switchloop h=new switchloop();
                   System.out.println("Result : ");
                   System.out.println(h.switchloop());
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
   

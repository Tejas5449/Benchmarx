public class trimstring {
   
   


        private static final long MEGABYTE = 1024L * 1024L;
    
        public static long bytesToMegabytes(long bytes) {
            return bytes / MEGABYTE;
        }
    
        public String trimString(){
            String s = " geeks for geeks has all java functions to read  ";
            System.out.println(s.trim());
     
            // trims the leading spaces
            s = " Chetna loves reading books";
            System.out.println(s.trim());
            return s;
           
        }
        public static void main(String[] args){
            long startTime = System.nanoTime();
    
            
            
            trimstring a=new trimstring();
            a.trimString();  
           
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
        
      
    
    
    
    


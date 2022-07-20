public class EqualTo {
  
  
        private static final long MEGABYTE = 1024L * 1024L;
        
        public static long bytesToMegabytes(long bytes) {
            return bytes / MEGABYTE;
        }
        public int  Equalto(){
           // Initializing variables
        int var1 = 5, var2 = 10, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "
                           + (var1 == var2));
 
        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: "
                           + (var1 == var3));
        return var1;
    }
        
         
        
        public static void main(String[] args)throws Exception {
            
            long startTime = System.nanoTime();
    
    
           
           
            
      
           
            EqualTo  h=new   EqualTo();
                System.out.println("Result : ");
                System.out.println(h.  Equalto());
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
    

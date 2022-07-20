public class Logicaland {
  
        private static final long MEGABYTE = 1024L * 1024L;
        
        public static long bytesToMegabytes(long bytes) {
            return bytes / MEGABYTE;
        }
        public int LogicalAnd(){
            // initializing variables
            int a = 10, b = 20, c = 20, d = 0;
      
            // Displaying a, b, c
            System.out.println("Var1 = " + a);
            System.out.println("Var2 = " + b);
            System.out.println("Var3 = " + c);
      
            // using logical AND to verify
            // two constraints
            if ((a < b) && (b == c)) {
                d = a + b + c;
                System.out.println("The sum is: " + d);
                
            }
            else
                System.out.println("False conditions");
                return d;
        }
         
        
        public static void main(String[] args)throws Exception {
            
            long startTime = System.nanoTime();
    
    
           
           
            
      
           
            Logicaland  h=new   Logicaland ();
                System.out.println("Result : ");
                System.out.println(h. LogicalAnd());
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
    
    
      
    
    
    
    




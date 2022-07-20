class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
 
class two extends one {
    public void print_for() { System.out.println("for"); }
}

public class Inheritance {
    
        private static final long MEGABYTE = 1024L * 1024L;
        
            public static long bytesToMegabytes(long bytes) {
                return bytes / MEGABYTE;
            }
            
            
               
         
                
            public static void main(String[] args)throws Exception {
                
                    long startTime = System.nanoTime();
                    two g = new two();
                    g.print_geek();
                    g.print_for();
                    g.print_geek();
            
                   
                   
                    
              
                   
                        
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
        
     


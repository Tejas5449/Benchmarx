import java.io.File;
  
// Import this class for handling errors
import java.io.FileNotFoundException; 
  
// Import the Scanner class to read content from text files
import java.util.Scanner;

public class readfile {
    

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    
    public boolean Readfile(){
        try {
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        return true;
        
            
    }
    public static void main(String[] args)throws Exception {
        
            long startTime = System.nanoTime();

    
           
           
            
      
           
            readfile h=new readfile();
                System.out.println("Result : ");
                System.out.println(h.Readfile());
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




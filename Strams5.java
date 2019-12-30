import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
class Strams4
{
  public static void main(String[] args)
   {  
    
    try(FileWriter fos=new FileWriter("abc.dat"))
     {
        for(int i=97;i<=122;i++)
          fos.write(i);
      }
    catch(IOException  ex)
     {
      System.out.println(ex);
      }
     
     
     
     

    } 
} 
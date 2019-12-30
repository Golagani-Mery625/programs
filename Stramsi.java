import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;
class Stramsi
{
  public static void main(String[] args)
   { 
     
    try(FileInputStream fis=new FileInputStream("abc.dat");
          DataInputStream dis=new DataInputStream(fis);        
        )
    {
       int i=dis.readInt();
       float f=dis.readFloat();
       double d=dis.readDouble();
       System.out.println(i);
       System.out.println(f);
       System.out.println(d);

       
      }
    catch(IOException  ex)
     {
      System.out.println(ex);
      }
     
     
     
     

    } 
} 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Dserialization
{
  public static void main(String[] args)
   { 
   Employee e=null;
    try(FileInputStream fis=new FileInputStream("emp.dat");
         ObjectInputStream ois=new ObjectInputStream(fis);)
    {
      e =(Employee)ois.readObject();
      System.out.println(e.getEmpId()+"    "+e.getEname()+"  "+e.getSalary());
      
    }
   catch(IOException | ClassNotFoundException ex)
  {
     System.out.println(ex);
  }
    
     
     
     

    } 
} 
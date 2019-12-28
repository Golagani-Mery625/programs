import java.util.ArrayList;

class Student
{
 int stid;
 String stname;
public Student(int stid,String stname)
{
this.stid=stid;
this.stname=stname;
}
public void setIs(int stid)
 {
 this.stid=stid;

 }
public void setNm(String stname)
 {
 this.stname=stname;
 
  }
public int getIs()
  {
  return stid;
  }
public String getNm()
  {
  return stname;
  }
public void display()
{
  System.out.println(stid);
  System.out.println(stname);
}

}
class Training
{


    int tId;
    String tName;
ArrayList<Student> lst;
public Training(ArrayList<Student> lst,int tid, String tName)
{
this.lst=lst;
this.tId=tId;
this.tName=tName;
}
 public void setId(int tId)
 {
 this.tId=tId;

 }
 public void setName(String tName)
{
  this.tName=tName;
  
}
public int getId()
{
  return tId;
}
public String getName()
{
  return tName;
}
public void display()
{
ArrayList<Student> lst=this.lst;
for(int i=0;i<lst.size();i++)
  lst.get(i).display();
}
}
class Trans
{
public static void main(String[] args)
{
     ArrayList<Student> lst=new ArrayList<Student>();
     Training st=new Training(lst, 101,"manipal");
     System.out.println( "training id is:" +st.getId());
     System.out.println("training name is :" +st.getName());
     lst.add(new Student(1001,"mery"));
     lst.add(new Student(1002,"mercy"));
     lst.add(new Student(1003,"dancy"));
      st.display();
}
}







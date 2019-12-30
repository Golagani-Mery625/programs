import java.util.StringTokenizer;
class Strtoken
{
   public static void main(String args[])
    {
     String s="Something to,Written and shown, to the participants";
     StringTokenizer st=new StringTokenizer(s," ,");
     System.out.println(st.countTokens());
     while(st.hasMoreTokens())
     System.out.println(st.netToken());



     }

}
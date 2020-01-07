package com.deloitte.thirdmvn.hibthird.entity;
import java.sql.Date;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.thirdmvn.hibthird.entity.AadharCard;
import com.deloitte.thirdmvn.hibthird.entity.Person;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(Courses.class);
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Courses c=session.get(Courses.class, 7001);
        if(c!=null)
        {
        	System.out.println(c.getCname()+" "+c.getDuration());
        	for(Student s:c.getSlist())
         System.out.println(s.getSid()+" "+s.getSname()+" "+s.getAddress());		   
        }
        Student s=session.get(Student.class, 103);
        if(s!=null)
        {
        	System.out.println(s.getSname()+" "+s.getAddress());
        	for(Courses c1:s.getClist())
        		System.out.println(c1.getCid()+" "+c1.getCname()+" "+c1.getDuration());
        }
        session.close();
        factory.close();
        /*Department d=session.get(Department.class, 20);
        if(d!=null)
        {
        	System.out.println(d.getDname()+" "+d.getDeptno());
        	for(Employee e:d.getElist())
        		System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
        }*/
        
        
    }
}

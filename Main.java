package Medicine_App;

import java.util.*;
abstract class Medicine
{
 public void label(String CompanyName, String Address)
 {
 System.out.println("Company Name:"+CompanyName);
 System.out.println("Address:"+Address);
 }
}
class Ointment extends Medicine{
 public void label(String CompanyName, String Address)
 {
 System.out.println("Company Name:"+CompanyName);
 System.out.println("Company Address:"+Address);
 System.out.println("for external use only");
 }
}
class Syrup extends Medicine{
 public void label(String CompanyName,String Address)
 {
 System.out.println("Company Name:"+CompanyName);
 System.out.println("Company Address:"+Address);
 System.out.println("Store it in a dry place");
 }
}
class Tablet extends Medicine{
 public void label(String CompanyName,String Address)
 {
 System.out.println("Company Name:"+CompanyName);
 System.out.println("Company Address:"+Address);
 System.out.println("store in a cool dry place");
 }
}
public class Main
{
 public static void main(String[] args)
 {
 String CompanyName="Himalaya Syrup";
 String Address="Bangalore";
 Scanner sc=new Scanner(System.in);
 int choice=sc.nextInt();
 if(choice==3)
 {
 for(int i=0;i<4;i++)
 {
 Tablet t=new Tablet();
 t.label(CompanyName,Address);
 }
 }
 else if(choice==2)
 {
 for(int i=0;i<4;i++)
 {
 Ointment o=new Ointment();
 o.label(CompanyName,Address);
 }
 }
 else if(choice==1)
 {
 for(int i=0;i<4;i++)
 {
 Syrup s=new Syrup();
 s.label(CompanyName,Address);
 }
 }
 else {
 System.out.println("invalid input");
 }
 }
}


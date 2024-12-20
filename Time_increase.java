import java.util.*;
class Time 
{
    private int h,min,sec;
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours:");
        h=sc.nextInt();
        System.out.println("Enter minutes:");
        min=sc.nextInt();
        System.out.println("Enter seconds:");
        sec=sc.nextInt();
    }
public void showData()
{
    System.out.println("time is: "+h+ "hr" +min+ "min" +sec+ "sec");
}
public void increases()
{
    min++;
    if(min==60)
    {
        h=0;
        min++;
    }
    sec++;
    if(sec==60)
    {
        h=0;
        min=0;
        sec++;
    }
 }
}
public class Time_increase {
    public static void main(String[] args) {
    Time obj;
    obj=new Time();
    obj.getData();
    obj.showData();
    obj.increases();
    System.out.println("increased time is:");
    obj.showData();        
        
    }
    
}

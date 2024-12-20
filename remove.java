import java .util.*;
public class remove {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        StringBuffer str=new StringBuffer();
        System.out.println("enter the string");
        str.append(sc.nextLine());
        System.out.println("before deleting the string is " +str);
        str.delete(0,str.length());
        System.out.println("after deleting the string is"+str);
    }   
}

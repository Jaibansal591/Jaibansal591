import java.util.Scanner;

public class check {
        public static void main(String[] args)
         {
            Scanner sc =new Scanner(System.in);
            int n,i;
            System.out.println("enter how many numbers there:");
            n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("enter the set of numbers in an array:");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("entered array:");
            for(i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
            int l=a[0];
            for(i=0;i<n;i++)
            {
                if(a[i]>l)
                {
                    l=a[i];
                }
            }
            System.out.println("the largest value of an array" +l);
            int s=a[0];
            for(i=0;i<n;i++)
            {
                if(a[i]<s)
                {
                    s=a[i];
                }
            }
            System.out.println("the smallest value of an array" +s);
        }
    
}

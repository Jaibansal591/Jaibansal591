import java.util.Scanner;
public class average {

        public static void main(String[] args)
         {  
            Scanner sc =new Scanner(System.in);
            int n,i, t=0 ,avg=0;
            System.out.println("how many numbes are there:");
            n=sc.nextInt();
            int a[]= new int[n];
            System.out.println("enter the set of numbers in an array:");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("numbers entered are:");
            for(i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
            for(i=0;i<n;i++)
            {
                t=t+a[i];
            }
           avg=t/n;
            System.out.println("the sum of array elments:"+t);
           System.out.println("the mean of array elments:"+avg);

        }
    
        
    
}

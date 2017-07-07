import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String s="";
            for (int j = 2; j < Math.sqrt(n) ; j++) 
            {
                if (n % j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                s="This is a prime number";
            }
           else
                {
                    s="This is not a prime number";
                }
            
        
        System.out.print(s);
    }
}


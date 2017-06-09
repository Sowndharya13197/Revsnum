import java.io.*;
import java.util.Scanner;
public class Revnum {
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(n>0)
        {int m=n%10;
        n=n/10;
        
    
        System.out.print(m);
    }
    }
}

import java.util.Scanner;
public class Factorial {
    int fact(int n)
    {
    
        if(n==0)
        return 1;
        else
        return n*fact(n-1); 
    }  

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        int f = obj.fact(n);
        System.out.println("Factorial of given Number = " + f);


    }
}

import java.util.Scanner;
class Scan{
    public static void main (String[] args){
        Scanner obj1= new Scanner (System.in );
        int a= obj1.nextInt();
        int b= obj1.nextInt();
        int c = a+b;
        System.out.println("Addition = " +" " + c);
    }
}

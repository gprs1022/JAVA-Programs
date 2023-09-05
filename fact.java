public class fact {
    int factorial(int n)
    {
        if(n==0)
        return 1;
        else
        return n*factorial(n-1); 
    }

    public static void main (String[] args){

        fact obj = new fact();
         System.out.println(obj.factorial(5));
    }
}

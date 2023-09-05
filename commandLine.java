public class commandLine {
    
    public static void main(String[] args){
    double sum =0 , avg =0;
   
   // System.out.println(Integer.valueOf(s1)+ Integer.valueOf(s2));
   // System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
   //System.out.println(args.length); 
   for(int i=0; i<args.length;i++)
   {
      sum =sum+Double.valueOf(args[i]);
   }

   System.out.println(sum);
   avg = sum/args.length;
   System.out.println(avg);
    } 

    //valueOf 
    //parse(keyword)
};

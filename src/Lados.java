public class Lados {
    public static double a;
    public static double b;
    public static double c;


    public double area(){
        
        double p = (a+b+c)/2;
         return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
    
    }
}

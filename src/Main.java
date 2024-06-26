
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Lados x = new Lados();
    Lados y = new Lados();
    
    double area1 = 0, area2 = 0;
   Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor dos lados do triangulo");
     x.a= sc.nextDouble();
     x.b = sc.nextDouble();
     x.c = sc.nextDouble();
   
    area1 = x.area();
    System.out.println("Digite o valor dos lados do triangulo");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
    
    area2 = y.area();

    System.out.println("Area do triangulo 1 = " + area1);
    System.out.println("Area do triangulo 2 = " + area2);   

    if(area1 > area2){
        System.out.println("Triangulo 1 e maior");
    }else if(area1 < area2){
        System.out.println("Triangulo 2 e maior");
    }else{
        System.out.println("Os triangulos possuem a mesma area");
    }
        
   

        sc.close();
    }

    
}
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        Product[] vect = new Product[x];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.next();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        System.out.printf("AVERAGE PRICE = %.2f\n", sum / vect.length);
       



        sc.close();
    }
}

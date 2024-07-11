import java.util.Random;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Olá deseja abrir uma conta?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        int escolha = 0;
        escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("Qual o tipo de conta?");
            System.out.println("1 - Corrente");
            System.out.println("2 - Poupança");
            escolha = sc.nextInt();

            if (escolha == 1) {
                ContaCorrente contaCo = new ContaCorrente();
                System.out.println("Qual o nome do cliente?");
                contaCo.criarConta(sc.next(), rand.nextInt(1000), 0);
                System.out.println("Deseja depositar?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                escolha = sc.nextInt();
                if (escolha == 1) {
                    System.out.println("Qual o valor?");
                    contaCo.depositar(sc.nextDouble());
                    System.out.println("Agora seu saldo e: " + contaCo.getNome() + " " + contaCo.getConta() + " " + contaCo.getSaldo());
                }else{
                    System.out.println("Ate mais");
                    System.exit(0);
                }
                

            } else if (escolha == 2) {
              ContaPoupanca  contaPou = new ContaPoupanca();
              System.out.println("Qual o nome do cliente?");
              contaPou.criarConta(sc.next(), rand.nextInt(1000), 0);
              System.out.println("Deseja depositar?");
              System.out.println("1 - Sim");
              System.out.println("2 - Nao");
              escolha = sc.nextInt();
              if (escolha == 1) {
                  System.out.println("Qual o valor?");
                  contaPou.depositar(sc.nextDouble());
                System.out.println("Agora seu saldo e: " + contaPou.getNome() + " " + contaPou.getConta() + " " + contaPou.getSaldo());
              }else{
                  System.out.println("Ate mais");
                  System.exit(0);
              }
            }
        }else{
            System.out.println("Ate mais");
            System.exit(0);
        }



       
        sc.close();
    }

}

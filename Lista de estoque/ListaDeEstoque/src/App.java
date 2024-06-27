public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto();
        boolean sair = false;
       

       
        while (sair == false){ {
        System.out.println("Qual a operação que deseja realizar?");
       System.out.println("1 - Cadastrar um novo produto");
       System.out.println("2 - Listar todos os produtos");
       System.out.println("3 - Cadastrar quantidade de um produto");
       System.out.println("4 - Remover um produto");
       System.out.println("5 - Sair");
       int op = Integer.parseInt(System.console().readLine());    
       if(op == 1){
           System.out.println("Qual o nome do novo produto?");
           p1.setNome(System.console().readLine()); 
           System.out.println("Qual o preço do novo produto?");
           p1.setPreco(Double.parseDouble(System.console().readLine()));
           System.out.println("Quantas unidades deseja adicionar?");
           p1.quantidade += Integer.parseInt(System.console().readLine());
          
           
       }else if(op == 2){
           System.out.println(p1);
          
       }else if(op == 3){
           System.out.println("Qual o nome do produto?");
           p1.nome = System.console().readLine();
           System.out.println("Quantas unidades deseja adicionar?");
           p1.quantidade += Integer.parseInt(System.console().readLine());
          
       }else if(op == 4){
           System.out.println("Qual o nome do produto?");
           p1.nome = System.console().readLine();
           System.out.println("Quantas unidades deseja remover?");
           p1.quantidade -= Integer.parseInt(System.console().readLine());
          
       }else if(op == 5){
           System.out.println("Saindo...");
           sair = true;
           
       }

    }

    }
}
}
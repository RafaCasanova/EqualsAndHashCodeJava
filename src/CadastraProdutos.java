import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CadastraProdutos {
    public  static  void main(String[] args){
        Collection<Produto> produtos = new ArrayList<>();
        System.out.println( "Cadastro de novos Produtos");

        try(Scanner entrada = new Scanner(System.in)){
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)){
                System.out.println("Que tipo de é produto, bebida ou comida? ");
                String tipo = entrada.next();

                System.out.println("Qual o nome do produto?  ");
                String nome = entrada.next();

                System.out.println("Qual e o preço do produto? Exemplo de entrada 8.50 ou 8 :  ");
                Double preco = entrada.nextDouble();

                Produto produto = new Produto(tipo,nome,preco);
                if(produtos.contains(produto)){
                    System.err.println("Este produto já existe!");
                    System.err.flush();
                }else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado a lista.");
                }
                System.out.println("\nDeseja adicionar mais algum produto? s ou n");
                continuar = entrada.next();
            }
        }
        produtos.forEach(System.out::println);

    }
}

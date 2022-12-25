import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Lojinha {

    static float dinheiro;
    static Integer comprar;
    static String comprarDnv;

    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, String> produtos = new HashMap<>();
    static ArrayList<String> produtosComprados = new ArrayList<>();
    
    // static ArrayList<String> noCarrinho = new ArrayList<>();
    
    public static void listaProdutos(){

        // Mostra cada preço com seu produto
        for(Map.Entry<Integer, String> produto : produtos.entrySet()){

            System.out.println(produto.getKey() + " = " + produto.getValue());

        }
    }

    public static void comprando(){

        while(!(produtos.isEmpty())){
            System.out.print("\033[H\033[2J");
            System.out.println("Estes são os nossos produtos disponíveis!");
            listaProdutos();

            System.out.println("Qual deseja comprar?");
            comprar = scan.nextInt();

            produtosComprados.add(produtos.get(comprar)); // Adiciona o item escolhido no ArrayList de produtosComprados
            produtos.remove(comprar);
            
            System.out.print("\033[H\033[2J"); // Limpa console

            System.out.println("Comprar de novo? [S/N]: ");
            comprarDnv = scan.next(); // Use next, se não, não funciona
            
            System.out.print("\033[H\033[2J"); // Limpa console

            if(produtos.isEmpty()){
                System.out.println("Não há mais nada para comprar!");
                break;
            }
            if(comprarDnv.toUpperCase().substring(0,1).equals("S")){
                
                System.out.print("\033[H\033[2J");
                listaProdutos();

            }
            else if(comprarDnv.toUpperCase().substring(0,1).equals("N")){ break; }
        }
    }

    public static void main(String[] args) {

        // DecimalFormat df = new DecimalFormat("0.00");

        produtos.put(1, "Pão Francês - R$3.50");
        produtos.put(2, "Bolo de Rolo - R$15.90");
        produtos.put(3, "Queijo Coalho (500g)- R$15.60");
        produtos.put(4, "Presunto de Peru (1Kg) - R$25.99");

        System.out.println("Bem-vindo(a) à Loja!");
        System.out.print("Quanto você tem na carteira? R$");
        dinheiro = scan.nextFloat();

        if(dinheiro == 0.00){
            System.out.println("Se não tem dinheiro, não pode comprar. Até mais!");
        }
        else{ comprando(); }

        System.out.println("Seus produtos:");
        System.out.println(produtosComprados);
        System.out.println("Obrigado pela preferência!");
    }

}

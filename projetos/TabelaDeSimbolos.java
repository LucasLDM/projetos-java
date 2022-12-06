import java.util.Scanner;

public class TabelaDeSimbolos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int linhas;
        int colunas;
        String simbolo;

        System.out.print("Entre com o número de linhas: ");
        linhas = scan.nextInt();
        System.out.print("Entre com o número de colunas: ");
        colunas = scan.nextInt();
        System.out.print("Insira um símbolo: ");
        simbolo = scan.next();

        // Em resumo, o "i" irá criar a quantidade de linhas informado e o "j" irá criar as "colunas", com os símbolos informados que estarão lado a lado, dando a impressão de que é uma coluna. Atentar-se com o println e o print.
        for(int i = 1; i <= linhas; i++){
            System.out.println();
            for(int j = 1; j <= colunas; j++){
                System.out.print(simbolo);
            }
        }

        scan.close();
    }
}
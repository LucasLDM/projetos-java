import java.util.Scanner;

public class StringInversa {

    static Scanner scan = new Scanner(System.in);

    public static void inverterString(String s){

        System.out.println("Palavra/texto invertido(a): ");
        for(int i = s.length() - 1; i >= 0; i--){

            System.out.print(s.charAt(i));

        }
    }

    public static void main(String[] args) {

        
        System.out.println("--- STRING INVERSA ---");

        System.out.println("Digite uma palavra/texto: ");
        String str = scan.nextLine();

        inverterString(str);

    }
}

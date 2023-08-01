import java.util.Scanner;
public class Arrays2{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = leitor.nextLine();

        System.out.println("Tamanho do texto "  + palavra.length());

        int numero_de_vogais=0;
        for(int i =0; i< palavra.length(); i++){
            char letra = palavra.charAt(i);
            System.out.println(i +  " : " + letra);

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                numero_de_vogais++;
            }

            System.out.println(numero_de_vogais + "vogais");

        }

    }
}

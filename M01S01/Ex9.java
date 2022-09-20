/*
Escreva um programa em Java que pergunte ao usuário via linha de comando qual seu herói favorito.
Atribua a resposta em uma variável.
Imprima no console a frase: "Seu herói favorito é <nome do herói informado>".
*/
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        String heroi;
        System.out.println("Digite algo: ");
        Scanner teclado = new Scanner(System.in);
        heroi = teclado.nextLine();
        System.out.println("Seu herói favorito é o "+heroi+".");
        teclado.close();    
    }
}

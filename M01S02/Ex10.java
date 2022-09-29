/*
Um palíndrome (ou palíndromo), segundo o dicionário Houaiss, 
"diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa", como por exemplo:  osso, ana, radar. 
Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado. 

Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
*/
package M01S02;

import java.util.Scanner;

import javax.swing.text.PlainDocument;

public class Ex10 {
    public static void main(String[] args) {
        System.out.print("Digite a palavra para saber se é palímdrome: ");
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        int b = palavra.length()-1;
        Boolean palindrome = false;
        for (int i =0; i<palavra.length(); i++){
            if (palavra.charAt(b)!=palavra.charAt(i)){
                palindrome = false;
                break;
            } else {
                palindrome = true;
            }
            b--;
        }
        if (palindrome){
            System.out.println("É um palindrome!");
        } else{
            System.out.println("Não é um palindrome!");
        }
        scan.close();
    }    
}

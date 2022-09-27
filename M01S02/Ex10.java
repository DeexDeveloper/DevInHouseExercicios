/*
Um palíndrome (ou palíndromo), segundo o dicionário Houaiss, 
"diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa", como por exemplo:  osso, ana, radar. 
Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado. 

Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
*/
package M01S02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.print("Digite a palavra para saber se é palímdrome: ");
        Scanner scan = new Scanner(System.in);
        String palindrome = scan.nextLine();
        System.out.println(palindrome.chars());
        
        
    }    
}

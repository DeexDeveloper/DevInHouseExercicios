package M01S04.ex4;

/*
Escreva um código que pergunte ao usuário (pela linha de comando) sua idade.
Caso seja informado um valor negativo, zero ou maior que cem, lance uma exceção que seja capturada por um bloco de try-catch e imprima no console uma mensagem explicativa para o usuário, e a seguir repita a pergunta para o usuário até que seja informado um valor de idade válido.
Neste exercício é livre para se criar uma exceção própria ou usar alguma exceção já existente na linguagem.
Quando for informado uma idade válida, imprima no console a frase: "Olá, você tem xx anos de idade!"
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        Integer idade = scan.nextInt();

        try{
            if(idade<=0 || idade >100 ){
                throw new Exception("Número invalido");
            }
            System.out.printf("Olá, você tem %d anos de idade!",idade);
        }
        catch (Exception e){
            System.out.println("Número fora dos parametros");
        }



    }
}

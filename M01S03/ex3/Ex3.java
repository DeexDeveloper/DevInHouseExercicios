/*
a) Crie uma classe 'Contador'.
b) Crie um método estático (static) 'contarPalavras' que recebe uma frase (String) como argumento. 
c) Implemente o método imprimindo no console o número de palavras da frase recebida como parâmetro.
d) Crie um método main em outra classe para testar a implementação.
Dicas:
- Usar método split() da String ou classe StringTokenizer.
*/

package M01S03.ex3;

public class Ex3 {
    public static void main(String[] args) {
        String teste = "testando esse programa aqui";
        Contador.contarPalavras(teste);
    }
}



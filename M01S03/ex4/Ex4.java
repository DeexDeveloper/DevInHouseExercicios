/*
a) Crie uma classe 'Contador2'.
b) Crie um atributo privado 'frase' (String) nesta classe.
c) Implemente um construtor que receba uma frase como parâmetro, e inicialize o atributo criado com esta frase. 
d) Implemente um método (não static desta vez) 'contarPalavras' que retorna a quantidade de palavras da frase indicada no atributo da classe.
e) Crie um método main em outra classe para testar a implementação.
Dicas:
- Usar método split() da String ou classe StringTokenizer.
*/
package M01S03.ex4;

public class Ex4 {
    public static void main(String[] args) {
        String teste = "isso é um teste para testar o teste";
        Contador2 umTeste = new Contador2();
        System.out.println(umTeste.contarPalavras(teste));
        ;
    }
}

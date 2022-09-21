/*
 Percorra array com estrutura de repetição e faça operações com condicionais:


O array abaixo representa lançamentos na conta bancária do Luke. 
Os valores negativos são débitos e os valores positivos são créditos.

Implemente um código copiando o array abaixo, e depois imprima no console o que se pede:

int[] extrato = { 100, -35, -15, -5, 55, -20 };

a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;
b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);
c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero), 
imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor);
d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.
 */
package M01S02;

public class Ex3 {
    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
        for (int n=0; n<extrato.length; n++){
            System.out.println(extrato[n]);
        }
        for (int n = extrato.length-1; n>-1; n--) {
            System.out.println(extrato[n]);
        }
        Integer saldo = 0;
        for (int n = 0; n<extrato.length; n++){
            saldo+=extrato[n];
        }
        System.out.println("O saldo da conta ficou em "+saldo+".");
        if (saldo>0){
            System.out.println("Saldo positivo!");
        }
        else {
            System.out.println("Saldo negativo!");
        }
    }
}

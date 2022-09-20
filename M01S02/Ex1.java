/*
 Implemente um código copiando o array abaixo, e depois imprima no console o valor dos seguintes elementos:

int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };

a) Imprima o valor do primeiro elemento;
b) Imprima o valor do último elemento;
c) Imprima o valor do terceiro elemento;
 */


package M01S02;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };
        System.out.println("O primeiro elemento da lista é o "+arr[0]+".");
        System.out.println("O último elemento da lista é o "+arr[arr.length-1]+".");
        System.out.println("O terceiro elemento da lista é o "+arr[2]+".");
                
    }
}

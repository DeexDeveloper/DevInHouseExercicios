/*
Implemente um código copiando o array abaixo, e depois imprima no console o valor dos seguintes elementos:

double[][] notas = {
    {10, 8.5, 5.5, 9.5},
    {8.5, 7, 7.5, 6},
    {8, 9, 10, 7.5},
    {9, 9.5, 10, 8}
};
a) Imprima o valor da nota do primeiro elemento do terceiro array de notas.
b) Imprima o valor da nota do segundo elemento do quarto array de notas.
c) Imprima o valor da soma das quatro primeiras notas de cada array.
*/
package M01S02;

public class Ex2 {
    public static void main(String[] args) {
        double[][] notas = {
            {10, 8.5, 5.5, 9.5},
            {8.5, 7, 7.5, 6},
            {8, 9, 10, 7.5},
            {9, 9.5, 10, 8}
        };
        System.out.println(notas[2][0]);
        System.out.println(notas[3][1]);
        for (int i = 0; i<notas.length; i++){
            double somaNotas = 0;
            for ( int n = 0; n<notas[i].length; n++){
                somaNotas+=notas[i][n];
            }
            System.out.println("A soma no array "+i+" "+somaNotas+".");
        }
    }
}

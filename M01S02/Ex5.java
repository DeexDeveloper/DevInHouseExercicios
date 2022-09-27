/*
Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e identifique o maior e menor  valor do mesmo.
Imprima no console estes valores ou "Não é possível calcular" qdo não for possível.

 Teste a função com as seguintes entradas:

 - {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47}
 - {1}
 - {1, -1}
 - null
 - {-2,-2,-2,-2} 
 - {20,10, 30}

*/
package M01S02;

public class Ex5 {
    public static void main(String[] args) {
        Integer arr[][] = {
            {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
            {1},
            {1, -1},
            {null},
            {-2,-2,-2,-2},
            {20,10, 30}
        };
        Integer maior, menor;
        for (Integer linha = 0; linha<arr.length; linha++){
            maior=arr[linha][0];
            menor=arr[linha][0];
            for (Integer coluna = 0; coluna<arr[linha].length; coluna++){
                if (arr[linha][coluna]!=null){
                    if (arr[linha][coluna]>maior){
                        maior=arr[linha][coluna];
                    }
                    if (arr[linha][coluna]<menor){
                        menor=arr[linha][coluna];
                    }
                } else{
                    System.out.println("Não foi possível compilar!");
                    break;
                }
            }
            if (maior!=null){
                System.out.println("O maior número é o "+maior+" e o menor é o "+menor+".");
            }
        }
    }
}
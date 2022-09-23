/*
Mike tem um nro da sorte: 25.
Ele conseguiu uma listagem do histórico dos resultados da loteria conforme arrays abaixo.
Escreva um código para percorrer os elementos de nros sorteados e contabilizar quantas vezes 
o nro da sorte dele foi sorteado.
* Dica: Usar um for dentro do outro para percorrer os arrays internos.
```
int sorteados[][] = {
    { 1, 44,  6,  2, 45, 60},
    {10, 21, 55, 25, 34, 44},
    { 8, 18, 28, 29, 55, 59},
    {60, 25, 11, 34,  6,  9},
    {55, 43, 25, 12,  7, 11}
};
```
 */
package M01S02;

public class Ex4 {
    public static void main(String[] args) {
        int sorteados[][] = {
            { 1, 44,  6,  2, 45, 60},
            {10, 21, 55, 25, 34, 44},
            { 8, 18, 28, 29, 55, 59},
            {60, 25, 11, 34,  6,  9},
            {55, 43, 25, 12,  7, 11}
        };
        int somaSorte = 0;
        for  (int linha = 0; linha<sorteados.length; linha++){
            for (int coluna = 0; coluna<sorteados[linha].length; coluna++){
                if (sorteados[linha][coluna]==25){
                    somaSorte++;
                }
            }
       }
       System.out.println("O numero da sorte de Mike saiu "+somaSorte+" vezes.");
    }
}

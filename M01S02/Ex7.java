/*
 Dado a lista de nomes:
 
List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

a) Percorra a lista usando o operador 'for' clássico, usando uma variável para iterar pelos índices, e imprima no console os valores de cada nome;
b) Percorra a lista usando o operador 'for-each' usando a forma simplificada, e imprima no console os valores de cada nome;
c) Percorra a lista usando o operador 'while', e imprima no console os valores de cada nome;
 */

package M01S02;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        for (int a=0; a<nomes.size(); a++){
            System.out.println(nomes.get(a));
        }
        System.out.println();
        for (String a : nomes){
            System.out.println(a);
        }
        System.out.println();
        int a = 0;
        while (a<nomes.size()) {
            System.out.println(nomes.get(a));
            a++;
        }
    }    
}

/*
Dado a lista de números:

List<Integer> lista = Arrays.asList(1,2,3,4);

Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
 */

package M01S02;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> novaLista = new ArrayList<>();
        for (Integer i : lista){
            novaLista.add(i*3);
        }
        for (Integer i : novaLista){
            System.out.println(i);
        }
    }    
}

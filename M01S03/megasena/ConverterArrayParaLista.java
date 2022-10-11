package M01S03.megasena;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConverterArrayParaLista {
    public static List<Integer> converter(int arr[]) {
        List<Integer> lista = new ArrayList<>();
        for (int nro : arr){
            lista.add(nro);
        }
        return lista;
    }
    public static List<Integer> converterOrdenado(int arr[]){
        List<Integer> convertido = converter(arr);
        Collections.sort(convertido);
        return convertido;
    }
}

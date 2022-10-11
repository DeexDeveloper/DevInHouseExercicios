/*
Vamos criar uma funcionalidade de manipulação dos resultados de sorteios da mega-sena dividido em várias partes/exercícios.


A mega-sena trata-se de um sorteio de seis números de 1 a 60, e o grande ganhador é quem acertar estes seis números sorteados.

a) Primeiro crie uma classe 'Concurso' para representar um concurso/sorteio.
b) Nesta classe, crie os atributos privados abaixo e os respectivos métodos getters & setters:
    private Integer numero;
    private LocalDate data;
    private int[] sorteados;
c) Implemente também o método 'toString()' nesta classe.
d) Adicione o construtor padrão/default, e um construtor que receba parâmetros para inicializar cada atributo desta classe.
e) Crie uma classe 'Principal' com método 'main'. Neste método, implemente a leitura do arquivo em anexo contendo o resultados de sorteios 
da mega-sena, e para cada linha, instancie um objeto de 'Concurso' e armazene eles em um ArrayList para manipulação posterior.
f) Imprima esta lista de concursos carregadas a partir do arquivo no console.

_Dicas_: 
- Como é um arquivo csv, usar o método split() para separar os itens, e depois instanciar um objeto concurso para cada linha do arquivo, carregando os atributos com os valores.
- Para imprimir os itens de um array, pode-se usar o método utilitário 'Arrays.toString()'.
*/
package M01S03.megasena;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        List<String> lista = lerDoArquivo();
        List<Concurso> concursos = carregarConcursos(lista);
        MegaSena megasena = new MegaSena(concursos);
        //megasena.imprimir();//ex5
        megasena.imprimirOrdem();


    }

    private static List<String> lerDoArquivo() throws IOException {
        Path arquivo = Paths.get("megasena.txt");
        List<String> lista = Files.readAllLines(arquivo);
        return lista;
    }

    private static List<Concurso> carregarConcursos(List<String> lista) {
        List<Concurso> concursos = new ArrayList<>();
        DateTimeFormatter formatador =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (String linha : lista){
            String partes[] = linha.split(",");
            Integer numero = Integer.valueOf(partes[0]);
            String dataStr = partes[1];
            LocalDate data = LocalDate.parse(dataStr, formatador);
            int sorteados[] = new int[6];
            for (int i=2; i<=7; i++){
                sorteados[i-2] = Integer.parseInt(partes[i]);
            }
            Concurso concurso = new Concurso(numero,data,sorteados);
            concursos.add(concurso);

        }
        return concursos;
    }
}

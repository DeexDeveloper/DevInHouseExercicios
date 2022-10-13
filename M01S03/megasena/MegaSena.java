package M01S03.megasena;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MegaSena {
    private List<Concurso> concursos;
    public MegaSena (List <Concurso> concursos){
        this.concursos=concursos;
    }
    //Exercicio 5
    public void imprimir(){
        for (Concurso imprimir :concursos){
            System.out.println(imprimir);
        }
    }
    //Exercicio 6
    public void imprimirOrdem(){
        for (Concurso imprimir :concursos){
            System.out.println(imprimir.formatarNumSorteados());
        }
    }
    //Exercicio 7
    public void imprimirOrdemConcurso(){
        Collections.sort(concursos);
        for (Concurso imprimir :concursos){
            System.out.println(imprimir);               
        }
    }
    //Exercicio 8
    public void verificarSeTeveSorteio(){
        System.out.println("Digite a data em formato dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPesquisada = LocalDate.parse(input, formatter);
        int sorteadorNaData[] = null;
        Boolean houveSorteio = false;
        for (Concurso imprimir : concursos){
            if (imprimir.getData().equals(dataPesquisada)){
                sorteadorNaData=imprimir.getSorteados();
                houveSorteio=true;
                break;
            }
        }
        if (houveSorteio){
        System.out.println(Arrays.toString(sorteadorNaData));
        } else {
            System.out.println("Não houve sorteio na data em questão.");
        }
    }
    //Exercicio 9
    public void verificarNumeros(){
        System.out.println("Digite as 6 dezenas separadas por vírgula");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String split[] = input.split(",");
        int numeros[] = {Integer.parseInt(split[0].trim()),
                         Integer.parseInt(split[1].trim()),
                         Integer.parseInt(split[2].trim()),
                         Integer.parseInt(split[3].trim()),
                         Integer.parseInt(split[4].trim()),
                         Integer.parseInt(split[5].trim()),
        };
        List<Integer> listaNumeros = ConverterArrayParaLista.converterOrdenado(numeros);
        Boolean ehIgual = false;
        for(Concurso concurso : concursos){
            List<Integer> numOrd = ConverterArrayParaLista.converterOrdenado(concurso.getSorteados());
            if(numOrd.toString().equals(listaNumeros.toString())){
                ehIgual = true;
                
                break;
            }
        }
        if (ehIgual){
            System.out.println("É igual");                     
        } else {
            System.out.println("Não é igual");
        }
    }


}

package M01S03.megasena;
import java.util.List;

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
}

/*
O sistema de pontuação por partida no Campeonato Brasileiro de Futebol funciona assim:
	Vitória = 3 pontos
	Derrota = 0 pontos
	Empate  = 1 ponto
Dado que o time 'Tabajara F.C.' tem 12 vitórias, 2 derrotas e 6 empates, implemente um código em Java para calcular
a quantidade de pontos e de jogos deste time e imprimir no console a frase abaixo (preenchendo-a com os respectivos valores):
"O time <NOME_DO_TIME> acumulou <NRO_DE_PTOS> após jogar <NRO_PARTIDAS> partidas".
Dicas:
- Crie variáveis para guardar o valor de vitórias, derrotas e empates.
- Crie outra variável para guardar o número de partidas (soma de vitórias, derrotas e empates).
- Crie outra variável para receber o resultado do cálculo de pontos.
*/
public class Ex8 {
    public static void main(String[] args) {
        Integer pVit = 3;
        Integer pDer = 0;
        Integer pEmp = 1;
        Integer vitorias = 12;
        Integer derrotas = 2;
        Integer empates = 6;
        Integer pontos = pVit*vitorias+pDer*derrotas+pEmp*empates;
        System.out.println(pontos);
        System.out.println("O time Tabajara F.C. acumulou "+pontos+" pontos após jogar "+(vitorias+derrotas+empates)+" jogos.");
        
    }
}

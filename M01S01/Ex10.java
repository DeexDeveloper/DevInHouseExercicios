package M01S01;
/*
Escreva um programa em Java que pergunte ao usuário via linha de comando qual o ano de seu nascimento.
Com base no ano informado, imprima no console a idade calculada deste usuário.
Dicas:
- Atribua o ano informado a uma variável.
- Crie uma instância da data atual (LocalDate), e extraia o ano da data atual (pesquise sobre o método getYear() da classe LocalDate).
- Faça a conta da idade subtraindo o ano informado do ano atual.
 */

import java.util.Scanner;
import java.util.Calendar;

public class Ex10 {
    public static void main(String[] args) {
        Integer diaAtual, mesAtual, anoAtual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o dia do seu nascimento: ");
        Integer dia = teclado.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        Integer mes = teclado.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        Integer ano = teclado.nextInt();
        teclado.close();
        Calendar hoje = Calendar.getInstance();
        diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        mesAtual = (hoje.get(Calendar.MONTH))+1;
        anoAtual = hoje.get(Calendar.YEAR);
        Integer idade = anoAtual-ano;
        if (mesAtual<mes) {
            idade-=1;
        }
        if (mesAtual==mes && diaAtual<dia){
            idade-=1;
        }
        System.out.println(idade);
        System.out.println("Sua idade atual é "+idade);
        if (mes==mesAtual && dia==diaAtual){
            System.out.println("Parabéns pelo seu aniversário");
        }
    }
}

/*
b) Crie a classe Abstrata Conta com o atributo "saldo" (double) e um método protegido (protected) "ObterSaldoAtual()".
*/

package M01S04.ex1;

public abstract class Conta {
    private Boolean saldo;

    protected Boolean ObterSaldoAtual(){
        return this.saldo;
    }
}

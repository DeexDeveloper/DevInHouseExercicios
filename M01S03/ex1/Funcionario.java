/*
Crie uma classe 'Funcionario' para representar um empregado de uma empresa, contendo os atributos cpf, nome completo e salário.
Implemente também um método 'promover' que recebe como parâmetro um percentual (float), devendo o salário ser aumentado pelo percentual indicado no argumento do método.
Crie e utilize um objeto desta classe para testar a implementação.
*/
package M01S03.ex1;

public class Funcionario  {
    private Integer cpf;
    private Integer salario;
    private String nome;

    public Integer promover(Integer percentual){
        return this.salario*percentual/100;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}


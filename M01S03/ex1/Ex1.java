/*
Crie uma classe 'Funcionario' para representar um empregado de uma empresa, contendo os atributos cpf, nome completo e salário.
Implemente também um método 'promover' que recebe como parâmetro um percentual (float), devendo o salário ser aumentado pelo percentual indicado no argumento do método.
Crie e utilize um objeto desta classe para testar a implementação.
*/
package M01S03.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Deex Develper");
        funcionario.setCpf(1234567891);
        funcionario.setSalario(12000);
        Integer aumento = funcionario.promover(30);
        System.out.println(aumento);

        
    }    
}

/*
a) Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).
b) Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.
c) Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.
d) Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). Na implementação, some este valor ao 'salário'.
e) Implemente outro método público 'aumentar' que recebe como parâmetros um valor (Float) e uma commissão (Float). Na implementação, 
some ambos os valores ao 'salário'.
*/
package M01S03.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ronaldo");
        Funcionario funcionario2 = new Funcionario("Ronaldinho", 500f);
        funcionario2.Aumentar(200f,566f);
        System.out.println(funcionario2.getSalario());
        System.out.println(funcionario);
    }    
}

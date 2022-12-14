/*
va) Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).
vb) Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.
vc) Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.
d) Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). Na implementação, some este valor ao 'salário'.
e) Implemente outro método público 'aumentar' que recebe como parâmetros um valor (Float) e uma commissão (Float). Na implementação, 
some ambos os valores ao 'salário'.
*/package M01S03.ex2;

public class Funcionario {
    String nome;
    Float salario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getSalario() {
        return salario;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }
   
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void Aumentar(Float aumentar){
        this.salario+=aumentar;
    }
    public void Aumentar(Float aumentar, Float comissao){
        this.salario+=aumentar+comissao;
    }
}

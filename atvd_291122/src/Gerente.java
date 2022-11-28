public class Gerente extends Funcionario{

    private Integer senha;

    public Integer getSenha(){
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    @Override
    protected double getCusto(){
        return 1.0;
    }
    @Override
    public void imprimir() {
        System.out.println("olá me chamo: " + this.getNome() + "\nMeu salário é: " + this.getSalario() + " R$" + "\nEu necessito dessa senha" + this.getSenha() + " para logar no sistema.");
    }
}

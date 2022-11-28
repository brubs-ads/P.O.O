public class Secretaria  extends Funcionario{

    private Integer num_chamadas;

    public Integer getNum_chamadas() {
        return num_chamadas;
    }

    public void setNum_chamadas(Integer num_chamadas){
        this.num_chamadas = num_chamadas;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá me chamo: " + this.getNome() + "\nMeu salário é: " + this.getSalario() + " R$" + "\nEu atendo: " + this.getNum_chamadas() + " ligações por dia.");
    }
}

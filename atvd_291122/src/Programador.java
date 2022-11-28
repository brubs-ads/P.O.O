public class Programador extends Funcionario{

    private String Ling_Preferida;

    public String getLing_Preferida(){
        return Ling_Preferida;
    }

    public void setLing_Preferida(String ling_Preferida) {
        this.Ling_Preferida = ling_Preferida;
    }

    @Override
    public void imprimir() {
        System.out.println("Olá me chamo: " + this.getNome() + "\nMeu salário é: " + this.getSalario() + " R$" + "\nE eu tenho: " + this.getLing_Preferida() + ", Como linguagem de programação preferida.");
    }
}

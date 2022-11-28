public class Funcionario {

    private static final double PERCENTUAL_CUSTO = 1.8;
    private String nome;
    private double salario;
    private double custo;

    protected double getCusto() {
        return 1.8;
    }

    public double getSalario(){
        return salario;
    }

    public final void setSalario(double salario) {
        this.salario = salario;
        this.custo = salario * getCusto();
    }
    public void setAumento(double percentual){
        double multi = (100.0 + percentual)/100.0;
        this.setSalario(this.getSalario() * multi);
}

    public void setAumento(){
        this.setAumento(10.0);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    protected void imprimir(){
        System.out.println("Olá me chamo: " + this.nome +
                "\nrecebo " + this.salario + " R$!" +
                "\ntenho um custo de: " + this.custo + " R$ na empresa.");
    }
}


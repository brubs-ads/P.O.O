package atvd2_291122;

public class Gerente_1 extends Funcionario_1{
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
}


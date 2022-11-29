package atvd2_291122;

public class Application {
    public static void main(String[] args){
        Funcionario_1 funcionario_1 = new Funcionario_1();
        funcionario_1.setNome("bruna linda");
        funcionario_1.setSalario(2500);
        funcionario_1.setAumento();
        funcionario_1.imprimir();

        Programador_1 programador_1 = new Programador_1();
        programador_1.setNome("Selton Alves");
        programador_1.setSalario(2500);
        programador_1.setLing_Preferida("Python");
        programador_1.setAumento(15);
        programador_1.imprimir("cansado", "de", "programar");

        Gerente_1 gerente_1 = new Gerente_1();
        gerente_1.setNome("Lucas lindo");
        gerente_1.setSalario(2800);
        gerente_1.setSenha(12345);
        gerente_1.setAumento(2);
        gerente_1.imprimir("de", "fazer nada");

        Secretaria_1 secretaria_1 = new Secretaria_1();
        secretaria_1.setNome("Lidiane Cristine");
        secretaria_1.setSalario(2800);
        secretaria_1.setNum_chamadas(50);
        secretaria_1.setAumento();
        secretaria_1.imprimir("Devendo");


    }
    }


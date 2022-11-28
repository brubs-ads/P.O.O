public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("bruna linda");
        funcionario.setSalario(2500);
        funcionario.setAumento();
        funcionario.imprimir();

        Programador programador = new Programador();
        programador.setNome("Selton Alves");
        programador.setSalario(2500);
        programador.setLing_Preferida("Python");
        programador.setAumento(15);
        programador.imprimir();

        Gerente gerente = new Gerente();
        gerente.setNome("Lucas lindo");
        gerente.setSalario(2800);
        gerente.setSenha(12345);
        gerente.setAumento(2);
        gerente.imprimir();

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Lidiane Cristine");
        secretaria.setSalario(2800);
        secretaria.setNum_chamadas(50);
        secretaria.setAumento();
        secretaria.imprimir();




    }
}
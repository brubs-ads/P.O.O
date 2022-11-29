package atvd2_291122;

public class Funcionario_1 {

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

        public static void imprimir(){
            System.out.println("Texto: São as nossas escolhas, mais do que as nossas capacidades, que mostram quem realmente somos...\n" +
                    "--Alvo Dumbledore");
        }
         protected static void imprimir(String cabecalho) {
            System.out.println("Cabeçalho: " + cabecalho + " Texto: São as nossas escolhas, mais do que as nossas capacidades, que mostram quem realmente somos...\n--Alvo Dumbledore");
         }
         protected static void imprimir(String cabecalho, String txt , String rodape) {
            System.out.println("Cabeçalho: " + cabecalho + " Texto: "  + txt + " Rodapé: " + rodape);
        }
        protected static void imprimir(String txt , String rodape) {
            System.out.println(" Texto: "  + txt + " Rodapé: " + rodape);
        }


    }


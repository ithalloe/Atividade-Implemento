public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome) {
        super(nome);
    }
    public Double calcularSalario(){
      return (double) 1000;
   }
   @Override
   public String descrerResponsabilidades() {
        return "Desenvolver";
   } 
}

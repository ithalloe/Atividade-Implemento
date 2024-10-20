public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }
    
    public Double calcularSalario(){
      return (double) 5000;
   }
    @Override
    public String descrerResponsabilidades() {
        return "Gerenciar";
    }  

}

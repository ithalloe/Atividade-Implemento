public class SistemaRh {
    public static void main(String[] args) throws Exception {
       
        Gerente gerente1 = new Gerente("Pedro");
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Paulo");
        
         System.out.println("Nome: " + gerente1.getNome());
         System.out.println("Salário: " + gerente1.calcularSalario());
         System.out.println("Responsabilidades: " + gerente1.descrerResponsabilidades());
 
         System.out.println("Nome: " + desenvolvedor1.getNome());
         System.out.println("Salário: " + desenvolvedor1.calcularSalario());
         System.out.println("Responsabilidades: " + desenvolvedor1.descrerResponsabilidades());
     }
 }


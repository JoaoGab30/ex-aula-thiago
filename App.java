

public class App {
    public static void main(String[] args) throws Exception {
    Gerente gerente = new Gerente("Thiago");
    gerente.calcularSalario();
    gerente.descreverResponsabilidades();

    Desenvolvedor desenvolvedor = new Desenvolvedor("João");
    desenvolvedor.calcularSalario();
    desenvolvedor.descreverResponsabilidades();
    

    System.out.println(gerente.calcularSalario());
    System.out.println(gerente.descreverResponsabilidades());

    System.out.println(desenvolvedor.calcularSalario());
    System.out.println(desenvolvedor.descreverResponsabilidades());
    
    }
}

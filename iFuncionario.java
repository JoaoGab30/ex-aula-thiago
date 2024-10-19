public interface iFuncionario {

    public default double calcularSalario(){
        return 1;
    }

    public default String descreverResponsabilidades(){
        return "A";
    }
}

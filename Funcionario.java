abstract  class Funcionario implements iFuncionario {
    
    private String nome;

    public Funcionario(String nome){

        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}   

public class Gerente extends Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private int senha;

    public boolean autentica(int senha){
        boolean retorno=false;
        if(this.senha ==senha){
            retorno=true;           
        }else{
            retorno =false;

        }
        return retorno;
    }

     public void setSalario(double salario){
        this.salario=salario;
    }public double getSalario(){
        return this.salario;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome=nome;
    }public String getNome(){
        return this.nome;
    }

     public void setSenha(int senha){
        this.senha=senha;
    }public int getSenha(){
        return this.senha;
    }

    public double getBonificacao()){
        return this.salario*0.15;
    }
}
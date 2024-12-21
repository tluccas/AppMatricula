
public class Aluno{

    private String nome;
    private int matricula;
    private String cpf;
    private int idade;

    public Aluno(){
        this.nome = "SEM NOME";
        this.matricula = 0;
        this.cpf =   "000.000.000-00";
        this.idade = 0;
    }

    public Aluno(String nome, int matricula, String cpf, int idade){

        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
    }

    //get/set nome
    public String getNome(){

        return nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    //get/set matricula
    public int getMatricula(){

        return matricula;
    }
    
    public void setMatricula(int matricula){

        this.matricula = matricula;
    }

    //get/set CPF
    public String getCPF(){

        return cpf;
    }

    public void setCPF(String cpf){

        this.cpf = cpf;
    }

    //get/set idade
    public int getIdade(){

        return idade;
    }

    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else{
            System.out.println("IDADE INVÁLIDA");
        }
    }

    public String toString(){
        return "\nALUNO: "+
                "\nNome: " + nome +
                "\nMatricula: " + matricula + 
                "\nCPF: " + cpf +
                "\nIdade: " + idade;
    }


}
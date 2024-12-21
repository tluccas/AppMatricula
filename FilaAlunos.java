import java.util.Arrays;
public class FilaAlunos{

    private Aluno[] fila;
    private int tamanho;

    public FilaAlunos(){

        this.fila = new Aluno[5];
        this.tamanho = 0;

}

    public void addFim(Aluno aluno){
        if (tamanho >= fila.length){
            System.out.println("FILA CHEIA, AUMENTANDO TAMANHO...");
            aumentarTamanho();
        }
        fila[tamanho] = aluno;
        tamanho++;
        System.out.println("\nO ALUNO " + aluno.getNome().toUpperCase() + " ENTROU NA FILA COM SUCESSO!");

    }

    public void aumentarTamanho(){

        Aluno[] filaNova = new Aluno[fila.length * 2];
        for (int i = 0; i < fila.length; i++){
            filaNova[i] = fila[i];
        }

        fila = filaNova;
    }

    public Aluno removerInicio(){
        if (tamanho == 0){
            System.out.println("FILA VAZIA");
            return null;
        }
        Aluno removido = fila[0]; //para retornar o aluno que foi removido
            for (int i = 0; i < tamanho - 1; i++){ //tamanho - 1 pq esta considerando a quantidade de alunos após a remoção
                fila[i] = fila[i + 1];

        }
        tamanho--; //Atualiza a quantidade de alunos
        System.out.println("ALUNO REMOVIDO: " + removido.getNome());
        return removido;
    }

    public Aluno getAluno(String nome){ //buscar alunos por nome
        for(int i = 0; i < tamanho; i++){
            if(fila[i].getNome().equalsIgnoreCase(nome)){
                System.out.println("\nAluno encontrado: ");
                System.out.println(fila[i]);
                return fila[i];
            }

        }
        System.out.println("\nAluno não encontrado");
        return null;
    }

    public Aluno getAluno(int indice){ //buscar alunos por indice
        if(indice >= 0 && indice < tamanho){
            System.out.println("\nAluno encontrado: ");
            System.out.println(fila[indice]);
            return fila[indice];
        }
        else{
            System.out.println("\nAluno não encontrado");
            return null;
        }
    }

    public int getTamanho(){

        return tamanho;
    }

    public String toString() {
        if (tamanho == 0) {
            return "FILA VAZIA.";
        }

        StringBuilder sb = new StringBuilder("FILA DE ALUNOS:\n"); //Não iria usar SB porém pesquisei e vi que seria uma boa pratica, pois otimiza o toString p/ uma grande quant de dados
        for (int i = 0; i < tamanho; i++) {
            sb.append("\nPosição ").append(i + 1).append(":\n");
            sb.append(fila[i]).append("\n");
        }
        return sb.toString();
    }
}

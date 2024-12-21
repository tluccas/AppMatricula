import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        FilaAlunos fila = new FilaAlunos();
        Scanner in = new Scanner(System.in);
        while (true){

            System.out.println("===== SISTEMA DE MATRICULA E FILA DE ALUNOS =====");
            System.out.println("Escolha uma opção: \n1- Adicionar aluno\n2- Remover aluno\n3- Buscar aluno por nome " +
                    "\n4- Buscar aluno por indice\n5- Verificar tamanho da fila\n6- Imprimir fila\n7- Sair.: ");
            int opcao = in.nextInt();
            if (opcao == 1) {
                Aluno aluno = new Aluno();
                System.out.println("Digite o nome do aluno: ");
                aluno.setNome(in.next());
                System.out.println("Digite a matricula do aluno: ");
                aluno.setMatricula(in.nextInt());
                System.out.println("Digite o CPF do aluno: \nEx.: 000.000.000-00");
                aluno.setCPF(in.next());
                System.out.println("Digite a idade do aluno: ");
                aluno.setIdade(in.nextInt());
                System.out.println("Aluno registrado com sucesso!\n");
                System.out.println(aluno.toString());
                fila.addFim(aluno);
            }
            else if (opcao == 2) {
                    fila.removerInicio();
                    System.out.println("Aluno removido com sucesso!\n");
            }
            else if (opcao == 3) {
                System.out.println("Digite o nome do aluno para buscar: ");
                fila.getAluno(in.next());
            }
            else if (opcao == 4) {
                System.out.println("Digite o indice do aluno para buscar: ");
                fila.getAluno(in.nextInt());
            }
            else if (opcao == 5) {
                System.out.println("A fila de alunos tem " + fila.getTamanho() + " alunos!");
            }
            else if (opcao == 6) {
                System.out.println("IMPRIMINDO FILA: \n");
                System.out.println(fila.toString());
            }
            else if (opcao == 7) {
                break;
            }
        }
        System.out.println("PROGRAMA ENCERRADO");
    }
}

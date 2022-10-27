import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do Curso: ");
        String nomeCurso = scan.nextLine();

        System.out.print("Digite o horario do Curso: ");
        String horarioCurso = scan.nextLine();

        System.out.print("Digite o nome do Professor: ");
        String nomeProf = scan.nextLine();

        System.out.print("Digite o email do Professor: ");
        String emailProf = scan.nextLine();

        System.out.print("Digite o departamento do Professor: ");
        String depProf = scan.nextLine();

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setEmail(emailProf);
        professor.setDepartamento(depProf);

        System.out.println("----- Alunos -----");
        Aluno[] alunos = new Aluno[2];
        for(int i = 0; i < alunos.length; i++) {

            System.out.print("Digite o nome do Aluno " + (i+1) + ": ");
            String nomeAluno = scan.nextLine();

            System.out.print("Digite a matricula do Aluno: ");
            String matAluno = scan.nextLine();

            double[] notas = new double[4];
            for(int j = 0; j < notas.length; j++){
                System.out.print("Digite a nota " + (j+1) + ": ");
                notas[j] = scan.nextDouble();
            }
            System.out.println("------------------------------------");

            scan.nextLine();

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horarioCurso);
        curso.setProfessor(professor);
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
//        System.out.println(alunos.obterInfo());
     }
}
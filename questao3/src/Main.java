import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno a = new Aluno("Odlavir", "1", "Engenharia");

//        System.out.print("Digite o nome do aluno: ");
//        a.setNome(scan.nextLine());
//
//        System.out.print("Digite a matricula do aluno: ");
//        a.setMatricula(scan.nextLine());
//
//        System.out.print("Digite o curso: ");
//        a.setNomeCurso(scan.nextLine());

        for(int i = 0; i < a.getNomeDisciplinas().length; i++) {
            System.out.println("------------------------------------------");
            System.out.print("Digite o nome da " + (i + 1) + " disciplina: ");
            a.mudarNomeDisciplina(i, scan.nextLine());
            for(int j = 0; j < a.getNotasDisciplinas()[i].length; j++) {
                System.out.print("Digite a " + (j + 1) + " nota do aluno: ");
                a.mudarNotasDisciplina(i, j, scan.nextDouble());
            }
            scan.nextLine();
        }

        a.mostrarInfo();
    }
}
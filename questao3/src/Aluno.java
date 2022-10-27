import java.sql.SQLOutput;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo() {
        System.out.println("------------------------------------------");

        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Matricula do aluno: " + getMatricula());
        System.out.println("Nome do curso: " + getNomeCurso());

        System.out.println("------------------------------------------");

        double media = 0;

        for(int i = 0; i < getNomeDisciplinas().length; i++) {
            System.out.println("Disciplina de " + getNomeDisciplinas()[i] + ": ");
            for(int j = 0; j < getNotasDisciplinas()[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + getNotasDisciplinas()[i][j]);
                media += getNotasDisciplinas()[i][j];
            }
            media = media/getNotasDisciplinas()[i].length;
            System.out.println("-------------------- >>>> Media: " + media);
            if (media >= 7 && media <= 10) {
                System.out.println(" >>>> Aluno aprovado!! <<<<");
            } else {
                System.out.println(" >>>> Aluno reprovado!! <<<<");
            }
            System.out.println("------------------------------------------");

            media = 0;
        }

    }

    public void mudarNomeDisciplina(int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void mudarNotasDisciplina(int posI, int posJ, double notaDisciplina){
        this.notasDisciplinas[posI][posJ] = notaDisciplina;
    }



}

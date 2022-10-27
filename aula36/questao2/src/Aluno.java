public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {
        String nomeAluno = "Nome do aluno: " + this.nome;
        String matAluno = "\nMatricula do aluno: " + this.matricula;
        String notasAluno = "\nNotas: ";

        double soma = 0;
        for(double nota: this.notas) {
         notasAluno += nota + " ";
         soma += nota;
        }

        double media = soma/notas.length;
        String postMedia;
        if(media < 7 && media > 0) {
            postMedia = "\nMédia: " + media + ", aluno reprovado!";
        } else if(media >= 7 && media <= 10) {
            postMedia = "\nMédia: " + media + ", aluno aprovado!";
        } else{
            postMedia = "\nMédia: " + media + ", erro na conta!";
        }

        String info = nomeAluno + matAluno + notasAluno + postMedia;
        return info;
    }

    public double obterMedia() {
        double soma = 0;
        for(double nota: this.notas) {
            soma += nota;
        }
        return soma/ notas.length;
    }
}

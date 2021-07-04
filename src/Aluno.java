public class Aluno {

    private String nome;
    private String curso;
    double nota;

    Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String toString() {
        return this.nome;
    }
}

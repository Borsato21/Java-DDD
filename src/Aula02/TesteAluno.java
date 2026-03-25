package Aula02;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Godinho";
        aluno1.curso = "Engenharia de Software";
        aluno1.idade = 20;

        aluno2.nome = "Vitor";
        aluno2.curso = "Engenharia de Software";
        aluno2.idade = 19;

        aluno1.apresentar();
        System.out.println();
        aluno2.apresentar();
    }
}
package br.com.empiricus.aula06;

public class TestaAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "José";
        aluno.idade = 41;
        aluno.curso = "Java";

        System.out.println(aluno.nome);

        aluno.estudar();


    }
}

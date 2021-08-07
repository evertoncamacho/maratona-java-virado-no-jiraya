package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {

    public static void main(String[] args) {
        /*
         * Crie um sistema que gerencia seminários
         * O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
         *
         * Um aluno poderá estar em apenas um seminário
         * Um seminário poderá ter nenhum ou vários alunos
         * Um professor poderá ministrar vários seminários
         * Um seminário deve ter um local
         *
         * Campos básicos (excluindo relacionamento)
         * seminário: título
         * aluno: nome e idade
         * professor: nome, especialidade
         * local: endereço
         *
         * */

        Local local = new Local("Rua das laranjeiras");

        Aluno aluno = new Aluno("Luffy", 17);
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminarios = {seminario};

        Professor professor = new Professor("Barba Branca", "Pirata", seminarios);

        professor.imprime();
    }
}

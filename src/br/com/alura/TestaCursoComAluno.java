package br.com.alura;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso curso = new Curso("Java", "Paulo Silveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Joao", 12312234);
		Aluno a2 = new Aluno("Carlos", 2394792);
		Aluno a3 = new Aluno("Alberto", 29341);
		Aluno a4 = new Aluno("Leticia", 129345);
		Aluno a5 = new Aluno("Rodrigo Turini", 34672);
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		
		//curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		curso.matricula(a4);
		curso.matricula(a5);
						
//		curso.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
		
		System.out.println("O aluno " + a1.getNome() + " esta matriculado? ");
		System.out.println("Resposta: " + (curso.estaMatriculado(a1)? "Sim." : "Nao"));
		System.out.println("E esse Turini, está matriculado?");
		System.out.println("Resposta: " + (curso.estaMatriculado(turini)? "Sim." : "Nao"));
	}
}

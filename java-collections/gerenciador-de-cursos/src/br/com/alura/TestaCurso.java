package br.com.alura;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as col de Java", "Paullo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criado uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole", 22));
		
		System.out.println(javaColecoes.getAulas());
				
	}

}

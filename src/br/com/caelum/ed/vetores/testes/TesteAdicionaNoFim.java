package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {

		long initialTime = System.currentTimeMillis();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time in millisecond: " + (endTime - initialTime));
		
//		Saída:
//		[Rafael; Paulo]
		
	}

}

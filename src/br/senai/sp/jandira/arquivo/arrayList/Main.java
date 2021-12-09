package br.senai.sp.jandira.arquivo.arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DadosContato objDadosContato = new DadosContato();
		Arquivo objArquivo = new Arquivo();
		
		String caminho = "C:\\Users\\21276662\\Desktop\\Contato\\contatos.txt";
		
		//Objeto de Contato para Teste:
		Contato contato1 = new Contato("Ana da Silva","ana.silva@gmail.com","1111-2222","Jandira");
		Contato contato2 = new Contato("luiz Campos Rocha","luiz.campos@gmail.com","3344-8585","Itapevi");
		Contato contato3 = new Contato("Paula Fernandes","fernandes@gmail.com","8772-8596","Barueri");
		Contato contato4 = new Contato("João da Silva","joao.silva@gmail.com","4532-5564","Osasco");

		//Teste de Cadastro de Contatos:
		objDadosContato.cadastrarContato(contato1);
		objDadosContato.cadastrarContato(contato2);
		objDadosContato.cadastrarContato(contato3);
		objDadosContato.cadastrarContato(contato4);
		
		
		//Percorre o ArrayList e grava os dados no arquivo txt:
		
		//1° exemplo
		ArrayList<Contato> listagem = objDadosContato.listarContatos();
//		for (Contato contato : listagem) {
//			System.out.println( " NOME: " + contato.getNome() +
//								" E-MAIL: " + contato.getEmail() + 
//								" TELEFONE: " + contato.getTelefone() + 
//								" CIDADE: " + contato.getCidade());
//			
//		}
		
		System.out.println();
		
		//2° exemplo
		String texto = "";
		for (Contato contato : objDadosContato.listarContatos()) {
//			System.out.println(  contato.getNome() + ";" +
//								 contato.getEmail() + ";" +
//								 contato.getTelefone() + ";" +
//								 contato.getCidade());
			
			texto += contato.getNome() + ";" +
					 contato.getEmail() + ";" +
					 contato.getTelefone() + ";" +
					 contato.getCidade() + "\n";
			
		}
		
		System.out.println(texto);
		
		objArquivo.escrever(caminho, texto);
		
		System.out.println("TOTAL DE CONTATOS CADASTRADOS: " + objDadosContato.contarContatos());
		
	}

}

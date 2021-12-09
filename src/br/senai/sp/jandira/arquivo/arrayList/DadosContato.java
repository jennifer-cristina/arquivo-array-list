package br.senai.sp.jandira.arquivo.arrayList;

import java.util.ArrayList;

public class DadosContato {
	
	//Atributos
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	Contato contato = new Contato();
	
	
	//Métodos
	public void cadastrarContato(Contato c) {
		contatos.add(c);
	}
	
	public ArrayList<Contato> listarContatos(){
		return contatos;
	}
	
	public int contarContatos() {
		return contatos.size();
	}
}

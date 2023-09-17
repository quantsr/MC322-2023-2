package library;

import java.util.HashSet;
import java.util.Set;

public class CategoriasBiblioteca {

	public static void listaCategorias(String[] args) {
		Set<String> categorias = new HashSet<>();

		categorias.add("Ciencias");
		categorias.add("História");
		categorias.add("Geografia");
		categorias.add("Biologia");
		categorias.add("Quimica");
		categorias.add("Fisica");
		categorias.add("Matematica");
		categorias.add("Literatura e Lingua Portuguesa");
		categorias.add("Literatura e Lingua estrangeira");
		categorias.add("Ciencias Sociais");
		categorias.add("Filosofia");
		categorias.add("Computação");
		categorias.add("Fantasia");
		categorias.add("Romance");
		categorias.add("Cronica");
		categorias.add("Artigo Cientifico");
		categorias.add("Variedades");

		System.out.println("Categorias disponiveis na biblioteca:");
		for (String categoria : categorias) {
			System.out.println("Categoria: " + categoria);
		}

		String categoriaProcurada = "Fantasia";
		System.out.println("Fantasia é uma categoria disponivel? " + categorias.contains(categoriaProcurada));

		String categoriaRemover = "ISBN-54321";
		categorias.remove(categoriaRemover);
		System.out.println(categoriaRemover + " removido(a).");

		System.out.println("Quantidade de categorias: " + categorias.size());

	}
}
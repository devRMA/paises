package pacote;

public class Prints {
	public static void mostrarPaisesNaFronteira(Pais primeiroPais, Pais segundoPais) {
		if (primeiroPais.paisesNaFronteiras(segundoPais) != null) {
			System.out.println(primeiroPais.getNome() + " e " + segundoPais.getNome() + " fazem fronteiras com:");
			for (Pais i : primeiroPais.paisesNaFronteiras(segundoPais)) {
				System.out.println(i.getNome());
			}
		}
		System.out.println("");
	}
	public static void mostrarSePaisesSaoIguais(Pais primeiroPais, Pais segundoPais) {
		System.out.println(primeiroPais.getNome() + " e " + segundoPais.getNome() + " s�o iguais?");
		if(primeiroPais.equals(segundoPais)) {
			System.out.println("Sim!");
		}
		else {
			System.out.println("N�o!");
		}
		System.out.println("");
	}
	
	public static void mostrarTodasAsFronteiras(Pais pais) {
		System.out.println(pais.getNome() + " faz fronteira com:");
		for (Pais a : pais.fronteiras()) {
			System.out.println(a.getNome());
		}
		System.out.println("");
	}
}

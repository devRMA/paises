package pacote;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		Pais argentina = new Pais("Argentina", "Buenos Aires", " 2.791.810 km²");
		Pais bolivia = new Pais("Bolivia", "La Paz", " 1.098.580 km²");
		Pais brasil = new Pais("Brasil", "Brasilia", "8.515.767.049 km²");
		Pais chile = new Pais("Chile", "Santiago", "756.096 km²");
		Pais colombia = new Pais("Colômbia", "Colômbia", "1.141.750 km²");
		Pais equador = new Pais("Equador", "Quito", "256.370 km²");
		Pais guiana = new Pais("Guiana", "Georgetown", "214.970 km²");
		Pais paraguai = new Pais("Paraguai", "Assunção", "406.750 km²");
		Pais peru = new Pais("Peru", "Lima", "1.285.220 km²");
		Pais suriname = new Pais("Suriname", "Paramaribo", "163.820 km²");
		Pais uruguai = new Pais("Uruguai", "Montevidéu", "176.220 km²");
		Pais venezuela = new Pais("Venezuela", "Caracas", "912.050 km²");
		
		Pais[] fronteirasArgentina = {paraguai, bolivia, brasil, uruguai, chile, };
		Pais[] fronteirasBolivia = {argentina, chile, paraguai, brasil, peru};
		Pais[] fronteirasBrasil = {argentina, bolivia, colombia, guiana, paraguai, peru, suriname, uruguai, venezuela};
		Pais[] fronteirasChile = {argentina, bolivia, peru};
		Pais[] fronteirasColombia = {venezuela, brasil, equador, peru};
		Pais[] fronteirasEquador = {peru, colombia};
		Pais[] fronteirasGuiana = {venezuela, suriname, brasil};
		Pais[] fronteirasParaguai = {argentina, bolivia, brasil};
		Pais[] fronteirasPeru = {bolivia, brasil, chile, colombia, equador};
		Pais[] fronteirasSuriname = {brasil, guiana};
		Pais[] fronteirasUruguai = {brasil, argentina};
		Pais[] fronteirasVenezuela = {brasil, colombia, guiana};
		
		
		for (Pais i : fronteirasArgentina) {
			argentina.adicionarFronteira(i);
		}
		for (Pais i : fronteirasBolivia) {
			bolivia.adicionarFronteira(i);
		}
		for (Pais i : fronteirasBrasil) {
			brasil.adicionarFronteira(i);
		}
		for (Pais i : fronteirasChile) {
			chile.adicionarFronteira(i);
		}
		for (Pais i : fronteirasColombia) {
			colombia.adicionarFronteira(i);
		}
		for (Pais i : fronteirasEquador) {
			equador.adicionarFronteira(i);
		}
		for (Pais i : fronteirasGuiana) {
			guiana.adicionarFronteira(i);
		}
		for (Pais i : fronteirasParaguai) {
			paraguai.adicionarFronteira(i);
		}
		for (Pais i : fronteirasPeru) {
			peru.adicionarFronteira(i);
		}
		for (Pais i : fronteirasSuriname) {
			suriname.adicionarFronteira(i);
		}
		for (Pais i : fronteirasUruguai) {
			uruguai.adicionarFronteira(i);
		}
		for (Pais i : fronteirasVenezuela) {
			venezuela.adicionarFronteira(i);
		}
		
		Prints.mostrarPaisesNaFronteira(brasil, chile);
		Prints.mostrarPaisesNaFronteira(brasil, argentina);
		
		Prints.mostrarSePaisesSaoIguais(brasil, brasil);
		Prints.mostrarSePaisesSaoIguais(brasil, argentina);
		Prints.mostrarSePaisesSaoIguais(chile, uruguai);
		Prints.mostrarSePaisesSaoIguais(uruguai, uruguai);
		
		Prints.mostrarTodasAsFronteiras(suriname);
		Prints.mostrarTodasAsFronteiras(brasil);
		Prints.mostrarTodasAsFronteiras(venezuela);
		

	}

}

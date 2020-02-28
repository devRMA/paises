package pacote;

/**
 *
 * @author rafael
 */
import java.util.ArrayList;

public class Pais {
	private String nome;
	private String capital;
	private String dimensoes;
	private ArrayList<Pais> fronteiras;
	
	public Pais(String nome, String capital, String dimensoes) {
		this.nome = nome;
		this.capital = capital;
		this.dimensoes = dimensoes;
		this.fronteiras = new ArrayList<Pais>();
	}
	
	
	public boolean equals(Pais outro) {
		if(outro.nome.equals(this.nome) && outro.capital.equals(this.capital)) {
			return true;
		}
		return false;
	}
	
	public boolean adicionarFronteira(Pais pais) {
		if (this.equals(pais)) {
			return false;
		}
		this.fronteiras.add(pais);
		return true;
	}
	
	public ArrayList<Pais> fronteiras(){
		return this.fronteiras;
	}
	
	public ArrayList<Pais> paisesNaFronteiras(Pais outro){
		ArrayList<Pais> temp = new ArrayList<Pais>();
		for (Pais i : this.fronteiras) {
			for (Pais j : outro.fronteiras) {
				if (i.equals(j)) {
					temp.add(i);
				}
			}
		}
		return temp; 
	}
	
	public String getNome() {
		return nome;
	}
	public String getCapital() {
		return capital;
	}
	public String getDimensoes() {
		return dimensoes;
	}
}

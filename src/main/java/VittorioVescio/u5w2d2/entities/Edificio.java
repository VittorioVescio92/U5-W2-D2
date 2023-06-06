package VittorioVescio.u5w2d2.entities;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edificio {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private String nome;
	private String città;
	private String indirizzo;

	public Edificio(String nome, String città, String indirizzo) {
		super();
		this.nome = nome;
		this.città = città;
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nome=" + nome + ", città=" + città + ", indirizzo=" + indirizzo + "]";
	}

}

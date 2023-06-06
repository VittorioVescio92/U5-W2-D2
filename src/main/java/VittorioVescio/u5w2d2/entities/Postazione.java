package VittorioVescio.u5w2d2.entities;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postazione {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private String descrizione;
	private TipoPostazione tipo;
	private int numeroMaxOccupanti;
	private Edificio edificio;
	private boolean disponibile;

	public Postazione(String descrizione, TipoPostazione tipo, int numeroMaxOccupanti, Edificio edificio,
			boolean disponibile) {
		super();
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMaxOccupanti = numeroMaxOccupanti;
		this.edificio = edificio;
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "Postazione [id=" + id + ", descrizione=" + descrizione + ", tipo=" + tipo + ", numeroMaxOccupanti="
				+ numeroMaxOccupanti + ", edificio=" + edificio + ", disponibile=" + disponibile + "]";
	}
}

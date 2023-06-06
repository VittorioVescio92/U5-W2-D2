package VittorioVescio.u5w2d2.entities;

import java.time.LocalDate;
import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Prenotazione {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private Utente utente;
	private Postazione postazione;
	private LocalDate dataPrenotazione;
	private LocalDate dataScadenzaPrenotazione;

	public Prenotazione(Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
		super();
		this.utente = utente;
		this.postazione = postazione;
		this.dataPrenotazione = dataPrenotazione;
		this.dataScadenzaPrenotazione = dataPrenotazione.plusDays(1);
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", utente=" + utente + ", postazione=" + postazione + ", dataPrenotazione="
				+ dataPrenotazione + ", dataScadenzaPrenotazione=" + dataScadenzaPrenotazione + "]";
	}

}

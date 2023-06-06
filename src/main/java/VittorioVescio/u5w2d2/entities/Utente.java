package VittorioVescio.u5w2d2.entities;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Utente {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private String username;
	private String nomeCompleto;
	private String email;
//	private List<Prenotazione> prenotazioni;

	public Utente(String username, String nomeCompleto, String email) {
		super();
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
//		this.prenotazioni = prenotazioni;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", username=" + username + ", nomeCompleto=" + nomeCompleto + ", email=" + email
				+ "]";
	}

}

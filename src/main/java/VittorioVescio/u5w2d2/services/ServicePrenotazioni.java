package VittorioVescio.u5w2d2.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import VittorioVescio.u5w2d2.entities.Edificio;
import VittorioVescio.u5w2d2.entities.Postazione;
import VittorioVescio.u5w2d2.entities.Prenotazione;
import VittorioVescio.u5w2d2.entities.TipoPostazione;
import VittorioVescio.u5w2d2.entities.Utente;

@Service
public class ServicePrenotazioni {

	Edificio empireStateBuilding = new Edificio("Empire State Building", "via Roma", "Cosenza");
	Edificio meraviglioso = new Edificio("ASDASDASD", "via Tattia", "Roma");
	Edificio torreDiCosenza = new Edificio("TorrePendente", "via Panebianco", "Cosenza");

	Utente ajeje = new Utente("ajeje03", "Ajeje Brazorf", "ajejeBrazorf@agg.it");
	Utente rezzonico = new Utente("rezzonico", "Signor Rezzonico", "signorRezzonico@agg.it");
	Utente dracula = new Utente("dentoni82", "Conte Dracula", "draculaTerun@agg.it");

	Postazione posto1 = new Postazione("Meglio non soffrire di vertigini", TipoPostazione.OPENSPACE, 52,
			empireStateBuilding, false);
	Postazione posto2 = new Postazione("Meraviglioso!", TipoPostazione.PRIVATO, 30, meraviglioso, true);
	Postazione posto3 = new Postazione("Un'avventura per equilibristi", TipoPostazione.SALA_RIUNIONI, 75,
			torreDiCosenza, true);

	Prenotazione p1 = new Prenotazione(ajeje, posto1, LocalDate.now());
	Prenotazione p2 = new Prenotazione(rezzonico, posto2, LocalDate.now());
	Prenotazione p3 = new Prenotazione(dracula, posto3, LocalDate.of(2023, 6, 10));

	private List<Prenotazione> prenotazioni = new ArrayList<>(List.of(p1, p2, p3));

	public List<Prenotazione> getPrenotazioni() {
		return this.prenotazioni;
	}

	public void nuovaPrenotazione(Prenotazione prenotazione) throws Exception {
		if(prenotazione.getPostazione().isDisponibile()) {
			this.prenotazioni.add(prenotazione);
		}
	}else

	{

	}
}

package VittorioVescio.u5w2d2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import VittorioVescio.u5w2d2.entities.Prenotazione;
import VittorioVescio.u5w2d2.services.ServicePrenotazioni;

@RestController
@RequestMapping("/prenotazioni")
public class ControllerPrenotazioni {
	@Autowired
	ServicePrenotazioni servicePrenotazioni;

	@GetMapping("")
	public List<Prenotazione> prenotazioni() {
		return servicePrenotazioni.getPrenotazioni();
	}

	@GetMapping("/info")
	public String genericInfo() {
		return "Inserisci una lingua tra Italiano (ita) ed Inglese (eng)";
	}

	@GetMapping("/info/{lingua}")
	public String info(@PathVariable String lingua) {
		if (lingua.equals("ita")) {
			return "Benvenuto nel sistema di prenotazione di Epicode! Ogni prenotazione vale un solo giorno!";
		} else if (lingua.equals("eng")) {
			return "Welcome to Epicode Booking System! Every booking is worth one day!";
		} else {
			return "Inserisci una lingua tra Italiano (ita) ed Inglese (eng)";
		}
	}
}

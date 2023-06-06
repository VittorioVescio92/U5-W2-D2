package VittorioVescio.u5w2d2;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class GestionePrenotazioniTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldGetItalianInfos() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prenotazioni/info/ita")).andExpect(status().is2xxSuccessful());
	}

	@Test
	void shouldGetEnglishInfos() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prenotazioni/info/ita")).andExpect(status().is2xxSuccessful());
	}

	@Test
	void shouldGetError() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prenotazioni/info/ita/ss")).andExpect(status().is4xxClientError());
	}
}

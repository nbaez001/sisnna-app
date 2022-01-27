package pe.gob.mimp.sisnna.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.mimp.sisnna.dto.response.OutResponse;
import pe.gob.mimp.sisnna.dto.response.PersonaResponse;

@RestController
@RequestMapping("/home")
public class HomeController {

	Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/persona")
	public OutResponse<PersonaResponse> buscarPersona() {
		log.info("[BUSCAR PERSONA][CONTROLLER][INICIO]");
		OutResponse<PersonaResponse> out = new OutResponse<>();
		PersonaResponse per = new PersonaResponse();
		per.setId(1L);
		per.setNombre("NERIO");
		per.setApellidos("BAEZ DELGADO");
		per.setDni("47887880");

		out.setRCodigo(1);
		out.setRMensaje("Exito");
		out.setObjeto(per);

		log.info("[BUSCAR PERSONA][CONTROLLER][FIN]");
		return out;
	}
}

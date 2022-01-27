package pe.gob.mimp.sisnna.dto.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString
public class PersonaResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String apellidos;
	private String dni;
}

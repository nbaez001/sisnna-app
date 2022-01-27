package pe.gob.mimp.sisnna.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OutResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer rCodigo;
	private String rMensaje;
	private T objeto;
}

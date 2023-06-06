package VittorioVescio.u5w2d2.exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GenericErrorPayload {
	private String message;
	private Date timestamp;
	private int internalCode;
}

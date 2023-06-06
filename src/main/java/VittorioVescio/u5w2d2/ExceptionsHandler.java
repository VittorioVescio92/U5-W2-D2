package VittorioVescio.u5w2d2;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import VittorioVescio.u5w2d2.exceptions.GenericErrorPayload;
import VittorioVescio.u5w2d2.exceptions.NotFoundException;

@RestControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<GenericErrorPayload> handleNotFound(NotFoundException e) {
		GenericErrorPayload payload = new GenericErrorPayload(e.getMessage(), new Date(), 404);
		return new ResponseEntity<GenericErrorPayload>(payload, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<GenericErrorPayload> handleGenericErrors(Exception e) {
		System.out.println(e);
		GenericErrorPayload payload = new GenericErrorPayload("GENERIC SERVER ERROR! WE GONNA FIX IT ASAP!", new Date(),
				500);
		return new ResponseEntity<GenericErrorPayload>(payload, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

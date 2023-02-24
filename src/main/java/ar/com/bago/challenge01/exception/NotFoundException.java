package ar.com.bago.challenge01.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/* 
@ResponseStatus(value = HttpStatus.NOT_FOUND)
 public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
  */

 @ResponseStatus(value = HttpStatus.NOT_FOUND)
 public class NotFoundException extends RuntimeException {

 	private static final long serialVersionUID = 1L;

 	public NotFoundException(String message) {
 		super(message);
 	}

 }

package in.raj.advice;

import in.raj.error.DostNotFoundException;
import in.raj.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionHandlingWIthRestApplication {

    @ExceptionHandler(DostNotFoundException.class)
    public ResponseEntity<ErrorModel> handleDostNotFoundException(DostNotFoundException ex) {
        System.out.println("ExceptionHandlingWIthRestApplication.handleDostNotFoundException");
        ErrorModel details = new ErrorModel(LocalDateTime.now(),ex.getMessage(),"Resource Not Found",404);
        return new ResponseEntity<ErrorModel>(details, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorModel> handleException(Exception ex) {
        System.out.println("ExceptionHandlingWIthRestApplication.handleException");
        ErrorModel model = new ErrorModel(LocalDateTime.now(),ex.getMessage(),"Internal Error",500);
        return new ResponseEntity<>(model, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

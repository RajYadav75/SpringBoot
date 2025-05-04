package in.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorModel {
    private LocalDateTime dateTime;
    private  String msg;
    private  String status;
    private  Integer statusCode;
}

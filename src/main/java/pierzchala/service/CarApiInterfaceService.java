package pierzchala.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CarApiInterfaceService {

    String getCarString();

    String getCars();

    ResponseEntity<String> responseNumber(String number);

    String token(String token, String number);

    ResponseEntity<String> wordCounter(String words);

}

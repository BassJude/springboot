package pierzchala.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Qualifier("second")
public class CarApiServiceSecond implements CarApiInterfaceService {
    @Override
    public String getCarString() {
        return "Second";
    }

    @Override
    public String getCars() {
        return "Second";
    }

    @Override
    public ResponseEntity<String> responseNumber(String number) {
        return new ResponseEntity<>("Second", HttpStatus.OK);
    }

    @Override
    public String token(String token, String number) {
        return "Second";
    }

    @Override
    public ResponseEntity<String> wordCounter(String words) {
        return new ResponseEntity<>("Second", HttpStatus.OK);
    }
}

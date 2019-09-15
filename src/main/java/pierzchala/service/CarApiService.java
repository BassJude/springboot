package pierzchala.service;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pierzchala.model.Car;
import pierzchala.model.CarManager;

import java.util.List;

@Service
@Qualifier("first")
public class CarApiService implements CarApiInterfaceService {

    private CarManager carManager;  // wstrzykiwanie do pola

    @Autowired  // wstrzykiwanie do konstruktora, metoda zalecana, po za tym jeszcze jest do settera
    public CarApiService(CarManager carManager) {
        this.carManager = carManager;
    }


    @Override
    public String getCarString() {
        List<Car> carList = carManager.getCarList();
        String cars = "";
        for (Car c : carList) {
            cars += c.toString() + "\n";

        }
        return cars;
    }

    @Override
    public String getCars() {
        return new Gson().toJson(carManager.getCarList());
    }

    @Override
    public ResponseEntity<String> responseNumber(String number) {
        String body = "Podales liczbe " + number;
        return new ResponseEntity<>(body, HttpStatus.valueOf(200));
    }

    @Override
    public String token(String token, String number) {
        return token + " --- " + number;

    }

    @Override
    public ResponseEntity<String> wordCounter(String words) {
        String[] word = words.split(" ");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Counter", String.valueOf(word.length));

        String body = "Ilość słów w body wynosi: " + word.length;
        return new ResponseEntity<>(body, responseHeaders, HttpStatus.valueOf(400));
    }
}

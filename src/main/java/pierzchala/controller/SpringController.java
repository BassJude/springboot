package pierzchala.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pierzchala.model.Car;
import pierzchala.model.CarManager;
import pierzchala.service.CarApiInterfaceService;
import pierzchala.springbootfirst.SpringbootfirstApplication;
import pierzchala.springwakcji1.CompactDisc;
import pierzchala.watek.SimplyRunnableService;
import pierzchala.watek1.Watek1Runnable;
import pierzchala.watek1.Watek1Service;
import pierzchala.watek2spring.Watek2SpringService;

@RestController
public class SpringController {
    private static String[] args = SpringbootfirstApplication.getArgs();

    @Autowired
    private SimplyRunnableService simplyRunnableService;

    @Autowired
    private Watek2SpringService watek2SpringService;

    @Autowired
    private CompactDisc compactDisc;

    public final String qualifier = "first";


    //    @Autowired  jak do konstruktora, to kasujemy nad polem
    private CarManager carManager;  // wstrzykiwanie do pola
    private CarApiInterfaceService carApiInterfaceService;

    @Autowired  // wstrzykiwanie do konstruktora, metoda zalecana, po za tym jeszcze jest do settera
    public SpringController(CarManager carManager, @Qualifier(value = qualifier) CarApiInterfaceService carApiInterfaceService) {
        this.carManager = carManager;
        this.carApiInterfaceService = carApiInterfaceService;
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/getCarsString")
    public String getCarsString() {
        return carApiInterfaceService.getCarString();
    }

    @RequestMapping("/getCars")
    public String getCars() {

        return carApiInterfaceService.getCars();
    }

    @RequestMapping("/super")
    public String getThird() {
        return "Spring";
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car) {


        return carManager.addCar(car);
    }

    @RequestMapping("addCar/{mark}/{model}")
    public String addCarPath(@PathVariable("mark") String mark, @PathVariable("model") String model) {
        carManager.addCar(new Car(mark, model));
        return new Gson().toJson(carManager.getCarList());
    }

    @RequestMapping("/header")
    public String getHeader(@RequestHeader("User-Agent") String date) {
        System.out.println(date);

        return date;
    }

    @RequestMapping("/response")
    public ResponseEntity<String> response(@RequestBody Car[] cars, @RequestParam(defaultValue = "2") int number) {
        String json = new Gson().toJson(cars);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("typ0", "value0");
        responseHeaders.set("typ1", "value1");
        responseHeaders.set("typ2", "value2");
        responseHeaders.set("typ3", "value3");

        return new ResponseEntity<>(json, responseHeaders, HttpStatus.valueOf(200));
    }

    @RequestMapping("/response/{number}")
    public ResponseEntity<String> responseNumber(@PathVariable("number") String number) {
        return carApiInterfaceService.responseNumber(number);
    }

    @GetMapping("/response/{token}/{number}")
    public String token(@PathVariable String token, @PathVariable String number) {
        return carApiInterfaceService.token(token, number);
    }

    @RequestMapping("/wordCounter")
    public ResponseEntity<String> wordCounter(@RequestBody String words) {
        return carApiInterfaceService.wordCounter(words);
    }

    @RequestMapping("/watek1/{counter}")
    public ResponseEntity<String> watek1(@PathVariable int counter) throws InterruptedException {

        Watek1Runnable watek1Runnable = new Watek1Runnable();
        watek1Runnable.setCounter(counter);

        Watek1Service watek1Service = new Watek1Service();
        watek1Service.setWatek1Runnable(watek1Runnable);
        watek1Service.start();

        String body = "";

        return new ResponseEntity<>(body, HttpStatus.valueOf(200));
    }

    @RequestMapping("/watek")
    public ResponseEntity<String> watek() throws InterruptedException {

        simplyRunnableService.start();

        String body = "";

        return new ResponseEntity<>(body, HttpStatus.valueOf(200));
    }

    @RequestMapping("/watek2/{counter}")
    public ResponseEntity<String> watek2(@PathVariable int counter) throws InterruptedException {

        watek2SpringService.start();

        String body = "";

        return new ResponseEntity<>(body, HttpStatus.valueOf(200));
    }

    @RequestMapping("/bean")
    public ResponseEntity<String> bean(){

        String className = compactDisc.getClass().getName();

        return new ResponseEntity<>(className, HttpStatus.OK);

    }
}

package pierzchala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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


    @RequestMapping("/")
    public String home() {
        return "home";
    }



    @RequestMapping("/super")
    public String getThird() {
        return "Spring";
    }



    @RequestMapping("/header")
    public String getHeader(@RequestHeader("User-Agent") String date) {
        System.out.println(date);

        return date;
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

package pierzchala.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import pierzchala.model.Car;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("hej");
		String json = "[{\"mark\":\"Szybki\",\"model\":\"Bill\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"},{\"mark\":\"Volvo\",\"model\":\"XC60\"}]";
		System.out.println(json);
		Car[] cars = new Gson().fromJson(json, Car[].class);
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i].toString());
		}
		System.out.println("hej");
		
		 Type founderListType = new TypeToken<ArrayList<Car>>(){}.getType();
	        List<Car> founder3 = new Gson().fromJson(json, founderListType);
	        
	        for (Car c : founder3) {
	        	System.out.println(c);
	        }
	}

}

package com.exercise13oppstatic.app;
import com.exercise13oppstatic.model.Car;
public class CarApp{
	public static void main(String[] args) {
		Car gallosCar = new Car();
		gallosCar.setSerialNumber("1");
		gallosCar.setNumberDoors(4);
		gallosCar.setBrand("Volvo");
		System.out.println(gallosCar.ToString());
		
		Car alesCar = new Car();
		alesCar.setSerialNumber("2");
		alesCar.setNumberDoors(4);
		alesCar.setBrand("Honda");
		System.out.println(alesCar.ToString());
		
		Car jonasCar = new Car("Mustang",4);
		jonasCar.setSerialNumber("2");
		jonasCar.setNumberDoors(2);
		jonasCar.setBrand("Honda");
		System.out.println(alesCar.ToString());
		
		Car jorgesCar = new Car("Vocho",2);
		jorgesCar.setSerialNumber("2");
		jorgesCar.setNumberDoors(2);
		jorgesCar.setBrand("Honda");
		System.out.println(alesCar.ToString());
		
		Car ivansCar = new Car("Viper",4);
		ivansCar.setSerialNumber("2");
		ivansCar.setNumberDoors(2);
		ivansCar.setBrand("Honda");
		System.out.println(alesCar.ToString());
		
		Car carlosCar = new Car("Ferrari",2);
		carlosCar.setSerialNumber("2");
		carlosCar.setNumberDoors(2);
		carlosCar.setBrand("Honda");
		carlosCar.CarIsCoupe(true);
		
		System.out.println("--------");
		System.out.println(gallosCar.ToString());
		System.out.println(alesCar.ToString());
	}
}

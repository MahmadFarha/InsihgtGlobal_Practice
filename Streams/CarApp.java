package com.insight14.Streams;

import com.insight14.Streams.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CarApp {

	public static void main(String[] args) {
		Carservice c=new Carservice();
		Car cars[]= {
				new Car("Maruti","Swift Dezire",810000.00),
				new Car("Hyundai","Verna",1100000.00),
				new Car("Toyota","Innova",2450000.00),
				new Car("Audi","Q3",4500000.00)
		
		};
		List<Car> carList=new ArrayList<>(Arrays.asList(cars));
		try {
			double total=c.sumOfPrices(carList);
			System.out.println("total price"+total);
			
			List<String> carNames = c.getCarNames(carList);
            System.out.println("Car Names: " + carNames);
            
            Set<String> carMakers = c.getCarMakers(carList);
            System.out.println("Car Makers: " + carMakers);
            
            double highPrice = c.getHighPricedCar(carList);
            System.out.println("Highest Priced Car: " + highPrice);
            
            Car carWithLowPrice = c.getCarWithLowPricedCar(carList);
            System.out.println("Car with Lowest Price: " + carWithLowPrice);

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

package com.company;
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

                Driver driver=new Driver("Амброзевич Виктор",22);
                Engine engine=new Engine(10,"Мерс");
                Car car = new Car(110,"Мерс", "S",210,driver,engine);
                System.out.println(car.toString());
                car.start();
                car.turnLeft();
                car.stop();
            }
        }


    }
}
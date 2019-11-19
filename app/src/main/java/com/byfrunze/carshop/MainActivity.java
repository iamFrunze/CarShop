package com.byfrunze.carshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DataBaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);

        dataBaseHandler.addCar(new Car("Toyota", "3000RUB"));
        dataBaseHandler.addCar(new Car("Opel", "2000RUB"));
        dataBaseHandler.addCar(new Car("Merc", "30000RUB"));
        dataBaseHandler.addCar(new Car("KIA", "1000RUB"));

        List<Car> carList = dataBaseHandler.getAllCars();
        for(Car car : carList){
            Log.i("Car", car.getId() + " " + car.getName() + " " + car.getPrice());
        }
    }
}

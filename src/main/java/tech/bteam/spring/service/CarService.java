package tech.bteam.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.bteam.spring.model.Car;
import tech.bteam.spring.repository.CarRepository;

@Service
public class CarService {
    
    @Autowired
    CarRepository carRepository;
    
    @Transactional
    public List <Car> getCoches(){
        return carRepository.findAll();
    }
    @Transactional
	public void saveCar(Car car) {
		carRepository.save(car);
		
	}
	 @Transactional
	 public Car findCar(String matricula){
		 return carRepository.getCarByMatricula(matricula);
	 }
}
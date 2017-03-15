package tech.bteam.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.bteam.spring.model.Car;
public interface CarRepository extends JpaRepository<Car, String> {

}

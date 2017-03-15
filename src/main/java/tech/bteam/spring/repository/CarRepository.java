package tech.bteam.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.bteam.spring.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

}

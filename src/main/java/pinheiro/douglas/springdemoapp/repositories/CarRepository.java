package pinheiro.douglas.springdemoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import pinheiro.douglas.springdemoapp.model.Car;

public interface CarRepository extends CrudRepository<Car, Long>{

}

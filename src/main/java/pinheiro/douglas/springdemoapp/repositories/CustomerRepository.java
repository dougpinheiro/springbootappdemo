package pinheiro.douglas.springdemoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import pinheiro.douglas.springdemoapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}

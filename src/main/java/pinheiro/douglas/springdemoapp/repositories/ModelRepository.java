package pinheiro.douglas.springdemoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import pinheiro.douglas.springdemoapp.model.Model;

public interface ModelRepository extends CrudRepository<Model, Long>{

}

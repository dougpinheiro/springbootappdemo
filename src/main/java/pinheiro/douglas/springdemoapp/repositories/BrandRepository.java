package pinheiro.douglas.springdemoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import pinheiro.douglas.springdemoapp.model.Brand;

public interface BrandRepository extends CrudRepository<Brand, Long>{

}

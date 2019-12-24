package pinheiro.douglas.springdemoapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import pinheiro.douglas.springdemoapp.model.Brand;
import pinheiro.douglas.springdemoapp.model.Car;
import pinheiro.douglas.springdemoapp.model.Customer;
import pinheiro.douglas.springdemoapp.model.Model;
import pinheiro.douglas.springdemoapp.repositories.BrandRepository;
import pinheiro.douglas.springdemoapp.repositories.CarRepository;
import pinheiro.douglas.springdemoapp.repositories.CustomerRepository;
import pinheiro.douglas.springdemoapp.repositories.ModelRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private CustomerRepository customerRepository;
	private CarRepository carRepository;
	private BrandRepository brandRepository;
	private ModelRepository modelRepository;
	
	public DevBootstrap(CustomerRepository customerRepository, CarRepository carRepository, BrandRepository brandRepository, ModelRepository modelRepository) {
		this.customerRepository = customerRepository;
		this.carRepository = carRepository;
		this.brandRepository = brandRepository;
		this.modelRepository = modelRepository; 
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
	
	private void initData() {
		//Erick
		Customer erick = new Customer("Erick", "erick@gmail.com", "222222222");
		Brand honda = new Brand("Honda");
		Model civic = new Model("Civic",honda);
		Car erickCar = new Car(civic, "12-ID-99", new Short("1999"), new Byte("1"));
		erick.getCars().add(erickCar);
		erickCar.getCustomers().add(erick);
		
		brandRepository.save(honda);
		modelRepository.save(civic);
		customerRepository.save(erick);
		carRepository.save(erickCar);
		
		//Rod
		Customer rod = new Customer("Rod", "rod@gmail.com", "555555555");
		Brand rangeRover = new Brand("Range Rover");
		Model evoque = new Model("Evoque", rangeRover);
		Car rodCar = new Car(evoque, "34-XX-00", new Short("2017"), new Byte("12"));
		rod.getCars().add(rodCar);
		
		brandRepository.save(rangeRover);
		modelRepository.save(evoque);
		customerRepository.save(rod);
		carRepository.save(rodCar);
		
	}

}

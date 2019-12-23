package pinheiro.douglas.springdemoapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String brand;
	private String model;
	private String registration;
	private short year;
	private byte month;
	
	@ManyToMany
	@JoinTable(name="rentals", joinColumns=@JoinColumn(name="car_id"), inverseJoinColumns=@JoinColumn(name="customer_id"))
	private Set<Customer> customers = new HashSet<>();

	public Long getId() {
		return id;
	}

	public Car() {
		super();
	}
	
	public Car(Long id, String brand, String model, String registration, short year, byte month,
			Set<Customer> customers) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.registration = registration;
		this.year = year;
		this.month = month;
		this.customers = customers;
	}

	public Car(String brand, String model, String registration, short year, byte month,
			Set<Customer> customers) {
		super();
		this.brand = brand;
		this.model = model;
		this.registration = registration;
		this.year = year;
		this.month = month;
		this.customers = customers;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public byte getMonth() {
		return month;
	}

	public void setMonth(byte month) {
		this.month = month;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", registration=" + registration + ", year="
				+ year + ", month=" + month + ", customers=" + customers + "]";
	}
	
	
}
	
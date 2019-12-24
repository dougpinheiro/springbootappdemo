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
import javax.persistence.OneToOne;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Model model;
	
	private String registration;
	private Short year;
	private Byte month;
	
	@ManyToMany
	@JoinTable(name="rentals", joinColumns=@JoinColumn(name="car_id"), inverseJoinColumns=@JoinColumn(name="customer_id"))
	private Set<Customer> customers = new HashSet<>();


	public Car() {
		super();
	}
	
	public Car(Long id, Model model, String registration, Short year, Byte month,
			Set<Customer> customers) {
		super();
		this.id = id;
		this.model = model;
		this.registration = registration;
		this.year = year;
		this.month = month;
		this.customers = customers;
	}

	public Car(Model model, String registration, Short year, Byte month,
			Set<Customer> customers) {
		super();
		this.model = model;
		this.registration = registration;
		this.year = year;
		this.month = month;
		this.customers = customers;
	}
	
	public Car(Model model, String registration, Short year, Byte month) {
		super();
		this.model = model;
		this.registration = registration;
		this.year = year;
		this.month = month;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Short getYear() {
		return year;
	}

	public void setYear(Short year) {
		this.year = year;
	}

	public Byte getMonth() {
		return month;
	}

	public void setMonth(Byte month) {
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

	
	
	
}
	
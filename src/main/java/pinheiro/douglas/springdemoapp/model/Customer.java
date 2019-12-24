package pinheiro.douglas.springdemoapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String nif;
	
	@ManyToMany(mappedBy="customers")
	Set<Car> cars = new HashSet<>();
	
	public Customer() {
		super();
	}

	public Customer(Long id, String name, String email, String nif, Set<Car> cars) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.nif = nif;
		this.cars = cars;
	}
	
	public Customer(String name, String email, String nif, Set<Car> cars) {
		super();
		this.name = name;
		this.email = email;
		this.nif = nif;
		this.cars = cars;
	}
	
	public Customer(String name, String email, String nif) {
		super();
		this.name = name;
		this.email = email;
		this.nif = nif;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		Customer other = (Customer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", nif=" + nif + ", cars=" + cars + "]";
	}

}

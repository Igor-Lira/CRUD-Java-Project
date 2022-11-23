package igor.springdemo.dao;

import java.util.List;

import igor.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
}

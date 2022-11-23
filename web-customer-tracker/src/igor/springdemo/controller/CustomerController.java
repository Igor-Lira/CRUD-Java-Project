package igor.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import igor.service.CustomerService;
import igor.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService custumerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers = custumerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
}

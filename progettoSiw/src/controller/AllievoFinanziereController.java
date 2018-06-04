package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.spring.model.Customer;
import it.uniroma3.spring.service.CustomerService;


@Controller
public class AllievoFinanziereController  {

	@Autowired
	private CustomerService customerservice; 

	@Autowired
	private CustomerValidator validator; 


	@RequestMapping("/customers")
	public String customers(Model model) {
		model.addAttribute("customers", this.customerservice.findAll());
		return "customerList";
	}

	@RequestMapping("/addCustomer")
	public String addCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}

	@RequestMapping(value = "/customers/{id}", method = RequestMethod.POST)
	public String newCustomer(@Valid @ModelAttribute("customer") Customer customer, Model model, BindingResult bindngResult) {
		this.validator.validate(customer, bindingResult);
		if(this.customerservice.alreadyExists(customer)) {
			model.addAttribute("exists", "Customer already exists");
			return "customerForm";
		}
		else {
			if(!bindingResult.hasErrors()) {
				this.customerservice.save(customer);
				model.addAttribute("customers", this.customerservice.findAll());
				return "customerList";
			}
		}
		return "customerForm";
	}
}


	/*@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer(@PathVariable("id") Long id, Model model) {
		model.addAttribute("customer", this.customerservice.findById(id));
		return "showCustomer";
	}


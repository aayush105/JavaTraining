package com.bway.springproject.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.ConvertingComparator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.service.annotation.PutExchange;

import com.bway.springproject.model.Employee;
import com.bway.springproject.model.Product;
import com.bway.springproject.model.Rating;
import com.bway.springproject.repository.ProductRepository;
import com.bway.springproject.service.EmployeeService;

@RestController
public class EmployeeRestApi {

	@Autowired
	private EmployeeService empService;

	@Autowired
	private ProductRepository prodRepo;

	@GetMapping("/api/emp/list")
	public List<Employee> getAll() {

		return empService.getAllEmps();
	}

	@GetMapping("/api/emp/{id}")
	public Employee getOne(@PathVariable int id) {

		return empService.getEmpById(id);
	}

	@GetMapping("/api/emp/add")
	public String add(@RequestBody Employee emp) {

		empService.addEmp(emp);
		return "Success";
	}

	@PutMapping("/api/emp/update")
	public String update(@RequestBody Employee emp) {

		empService.updateEmp(emp);
		return "Update Success";
	}

	@GetMapping("/api/emp/delete/{id}")
	public String delete(@PathVariable int id) {

		empService.deleteEmp(id);
		return "Detele Success";
	}

//	Converting json to object

	@GetMapping("/api/emp/j2o")
	public String jsonToObject() {

		RestTemplate rtemp = new RestTemplate();
		Employee emp = rtemp.getForObject("http://localhost:8080/api/emp/1", Employee.class);

		return "fname=" + emp.getEmp_fname();
	}

//	converting json object to array object

	@GetMapping("/api/emp/ja2oa")
	public String jsonArrayToObjectArray() {
		RestTemplate temp = new RestTemplate();
		Employee[] emps = temp.getForObject("http://localhost:8080/api/emp/list", Employee[].class);

		return "firstName =" + emps[1].getEmp_fname();
	}

	@GetMapping("/api/emp/loadproduct")
	public String loadProduct() {
		RestTemplate temp = new RestTemplate();
		Product[] products = temp.getForObject("https://fakestoreapi.com/products", Product[].class);
		prodRepo.saveAll(Arrays.asList(products));
		
		return "success";
	}
	

}

package com.madhu.tmf.springboot.MyExpensesRestservices;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController annotation specifies that this class is a controller for RESTful API requests
//@RequestMapping annotation specifies the base URL for all requests handled by this controller

@RestController
@RequestMapping("/api/v1")
public class MyExpenseController {
	@PostMapping("/saveExp")
	@RequestMapping(value="/saveExp",method = RequestMethod.GET)
	public ResponseEntity<Expense> saveExpense(@RequestBody Expense exp){
		//@RequestBody is an annotation in Spring Framework used to bind the HTTP request body to a parameter in a controller method.
		
		//Expense exp = new Expense();
		return ResponseEntity.ok(exp); 
	}
	
	@GetMapping("/getExpences")
	public ResponseEntity<List<Expense>> getExpences(){
		List<Expense> expList = new ArrayList<Expense>();
		return ResponseEntity.ok(expList); 
	}
	
	@GetMapping("/getExpencesByDate")
	public ResponseEntity<List<Expense>> getExpencesByDate(@RequestParam(name="expDate") Date expDate){
		List<Expense> expList = new ArrayList<Expense>();
		return ResponseEntity.ok(expList); 
	}
	
	@GetMapping("/getExpencesByCategory/{expCatName}")
	public ResponseEntity<List<Expense>> getExpencesByCategory(@PathVariable(name="expCatName") String expCatName){
		List<Expense> expList = new ArrayList<Expense>();
		return ResponseEntity.ok(expList); 
	}
	
	@GetMapping("/getExpenceById")
	public @ResponseBody Expense getExpenceById(@RequestParam(name="expId") String expId){
		Expense e = new Expense();
		return e;
	}
	
	
	

}

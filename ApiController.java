package com.example.demo;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ApiController {
	@Autowired
	Apirepository serviceRepository;
	@Autowired
	ApiService service; 
	@GetMapping("/getval")
	List<Job> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/postval")
	public Job create (@RequestBody Job d) {
		return serviceRepository.save( d);
	}
	@GetMapping("/getvalues/{id}")
	public Optional<Job> getByid(@PathVariable int id){
		return service.getTasks(id);
	}
	@PutMapping("/updateval")
	public String update(@RequestBody Job d) {
		return service.updatejob(d);
	}
	@DeleteMapping("/deleteval")
	public String delete(@RequestParam int sl_no) {
		return service.deletejob(sl_no);
	}
}
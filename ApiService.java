package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ApiService {
@Autowired
Apirepository repository;

public Optional<Job> getTasks(int id){
	return repository.findById( id);
}
public String updatejob(Job d) {
	repository.save( d);
	return "updated";
}
public String deletejob(int id) {
	repository.deleteById( id);
	return "ID DELETED";
}
public List<Job> setPages(@PathVariable int offset,@PathVariable int pageSize){
	Page<Job> page=repository.findAll(PageRequest.of(offset, pageSize));
	return page.getContent();
}
public List<Job> getSort(String field){
	return repository.findAll(Sort.by(Sort.Direction.DESC,field));
}
public Page<Job>dosortandPage(int offset,int PageSize,String field){
	Pageable pageable=PageRequest.of(offset, PageSize,Sort.by(Direction.ASC,field));
	return repository.findAll(pageable);
}
}
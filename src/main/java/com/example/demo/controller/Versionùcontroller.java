package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Version;
import com.example.demo.service.VersionService;

@RestController

@RequestMapping("/Version")
public class Versionùcontroller {

	@Autowired
	VersionService vs;
	
	@PostMapping("/add")
	@ResponseBody
	public void add(@RequestBody Version v) {
		vs.add(v);
	}
	@DeleteMapping("/del/{id}")
	 
	public void del(@PathVariable("id") Long id) {
		vs.delete(id);
	}
	@PutMapping("/mod/{id}") 
	public void mod(@RequestBody Version v, @PathVariable("id") Long id) {
		vs.modifier(v,id);
	}
	@GetMapping("/get")
	@ResponseBody
	public List<Version> all() {
		return vs.getall();
	}
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Version;
import com.example.demo.repo.VersionRepo;

@Service
public class VersionService {
	@Autowired
	VersionRepo vr;
	
	public void add(Version v) {
		vr.save(v);
	}
	public void delete(Long id) {
		vr.deleteById(id);
	}
public void modifier(Version v , Long id) {
	Version vv = vr.findById(id).orElse(null);
	vv.setDate(v.getDate());
	vv.setDescription(v.getDescription());
	vv.setEtat(v.getEtat());
	vv.setNumero(v.getNumero());
	vr.save(vv);
}
	public List<Version> getall(){
		return vr.findAll();
	}
}

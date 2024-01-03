package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Version;

@Repository
public interface VersionRepo extends JpaRepository<Version,Long> {

}

package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
    List<Distillery> findByRegion(String region);
    List<Distillery> findDistilleryByWhiskiesAge(Integer age);

}

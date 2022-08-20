package com.example.finalprojectbackend.Repositry;

import com.example.finalprojectbackend.model.PlaceOner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface onerRepositry extends JpaRepository<PlaceOner,String> {
}

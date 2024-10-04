package com.example.todoapp.repositories;

import com.example.todoapp.entites.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface TacheRepo extends JpaRepository<Tache, Long> {
}

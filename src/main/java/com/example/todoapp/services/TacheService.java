package com.example.todoapp.services;

import com.example.todoapp.entites.Tache;
import com.example.todoapp.repositories.TacheRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TacheService {

    private final TacheRepo tacheRepo;

    public Tache addTache(Tache tache){
        return tacheRepo.save(tache);
    }
    public Optional<Tache> findOneTache(Long tacheId){
        return tacheRepo.findById(tacheId);
    }

    public List<Tache> findAllTaches(){
        return tacheRepo.findAll();
    }
}

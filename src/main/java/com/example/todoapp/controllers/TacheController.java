package com.example.todoapp.controllers;

import com.example.todoapp.entites.Tache;
import com.example.todoapp.services.TacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("taches")
@RequiredArgsConstructor
public class TacheController {

    private final TacheService tacheService;

    @PostMapping("add-tache")
    public ResponseEntity<Tache> addTache(@RequestBody Tache tache){
        return ResponseEntity.ok(tacheService.addTache(tache));
    }

    @GetMapping("all-taches")
    public ResponseEntity<List<Tache>> getAllTaches(){
        return ResponseEntity.ok(tacheService.findAllTaches());
    }

    @GetMapping("tache")
    public ResponseEntity<Optional<Tache>> getOnTache(@RequestParam("tacheId") Long tacheId){
        return ResponseEntity.ok(tacheService.findOneTache(tacheId));
    }


}

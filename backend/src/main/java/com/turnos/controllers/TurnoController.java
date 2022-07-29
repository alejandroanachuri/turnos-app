package com.turnos.controllers;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>Controlador de turnos</p>
 * @date 2022-07-29 16:11
 **/

import com.turnos.domains.Turno;
import com.turnos.repositories.TurnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0")
public class TurnoController {
    @Autowired
    TurnosRepository turnosRepository;

    @GetMapping("/turnos")
    public ResponseEntity<List<Turno>> getAllTurnos(){
        List<Turno> turnos = new ArrayList<>();
        turnosRepository.findAll().forEach(turnos::add);
        return new ResponseEntity<>(turnos, HttpStatus.OK);
    }

    @PostMapping("/turnos")
    public ResponseEntity<Turno> createTurno(@RequestBody Turno turno){
        Turno newTurno = turnosRepository.save(turno);
        return new ResponseEntity<>(newTurno, HttpStatus.CREATED);
    }
}

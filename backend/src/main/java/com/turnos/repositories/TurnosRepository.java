package com.turnos.repositories;

import com.turnos.domains.Turno;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>Repositorio de turnos</p>
 * @date 2022-07-29 16:05
 **/
public interface TurnosRepository extends MongoRepository<Turno, String> {
}

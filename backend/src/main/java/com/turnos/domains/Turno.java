package com.turnos.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>Dominio de turnos</p>
 * @date 2022-07-29 16:02
 **/
@Document(collection = "turnos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turno {
    @Id
    private String id;
    private String requestedName;
}

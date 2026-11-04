package mx.edu.utez.MT09_Cristian_Gomez_CA2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="curso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private enum estado{ACTIVO, EN_CURSO, FINALIZADO};

}

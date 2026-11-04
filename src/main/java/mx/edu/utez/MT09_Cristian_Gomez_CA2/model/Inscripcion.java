package mx.edu.utez.MT09_Cristian_Gomez_CA2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="incripcion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private int edad;
    private String correo;
    private LocalDate fecha_inscripcion;
     private enum estatus{ACTIVA, CANCELADA, COMPLETADA};
     private double calificacion=0.0;


     @ManyToOne
     @JoinColumn(name="curso_id")
     private Curso curso_id;



}

package mx.edu.utez.MT09_Cristian_Gomez_CA2.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO{
    @NotBlank(message = "el nombre del curso no puede esatr vacio")
    private String nombre_curso;

    @NotBlank(message = "blablablablablablablablablablablablablalablablablablablablablablablablablablablablablalbalbblblablablalablalablkabalabalabalbalabalabalabalabalabalbalbabalabalbalabalabalabalbalabalbalbalbalbalbalbalblabalblablabalbalbalbalbabalblbalbabalbablablablbalbalba")
    private LocalDate fecha_inicio;


}

/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NombreDTO {
    @NotBlank(message = "mensaje de error")
    private String texto;
    @NotNull(message = "mensaje de error")
    private Long otroId;
    @Min(value = 1, message = "mensaje de error")
    private int numero;
}
ANOTACIONES DE VALIDACIÓN
@NotBlank -> String: no vacío ni solo espacios
@NotNull -> Long u objeto: no puede ser null
@Min(1) -> número: valor mínimo (@Max para el máximo)
@Size(min = 3, max = 50) -> largo de un String
@Email -> formato de correo

 */
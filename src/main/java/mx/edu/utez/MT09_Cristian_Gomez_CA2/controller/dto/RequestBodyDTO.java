package mx.edu.utez.MT09_Cristian_Gomez_CA2.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestBodyDTO {
    @NotBlank(message="el nombre no puede estar vacio")
    private String nombre;

}

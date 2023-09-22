package med.voll.api.paciente;

import med.voll.api.direccion.*;

public record DatosRespuestaPaciente(Long id, String nombre, String documento, String email, String telefono,
                                     DatosDireccion direccion) {
}

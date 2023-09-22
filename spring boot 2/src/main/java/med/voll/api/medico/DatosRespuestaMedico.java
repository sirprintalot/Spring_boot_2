package med.voll.api.medico;

import med.voll.api.direccion.*;

public record DatosRespuestaMedico(Long id, String nombre, String documento, String email, String telefono,
                                   Especialidad especialidad,
                                   DatosDireccion direccion){
}

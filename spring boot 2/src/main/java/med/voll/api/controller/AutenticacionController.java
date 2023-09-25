package med.voll.api.controller;

import jakarta.validation.*;
import med.voll.api.domain.usuarios.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager manager;

    

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid  DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication token = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave());

//        var token = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
//                datosAutenticacionUsuario.clave());
         manager.authenticate(token);

        return ResponseEntity.ok().build();

    }
    
}

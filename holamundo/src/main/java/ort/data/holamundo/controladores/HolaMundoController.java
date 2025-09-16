package ort.data.holamundo.controladores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class HolaMundoController {

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Hola Mundo con Spring Boot!";
    }

    @GetMapping("/saludar2")
    public String gege() {
        return "¡Hola Mundo con Spring Boot! 222";
    }

}
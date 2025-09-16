package ort.da.ejemplocliente.controladores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ort.da.ejemplocliente.modelo.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping("/crear")
    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        return cliente;
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestParam long cedula, @RequestParam String nombre) {
        Cliente cliente = new Cliente(cedula, nombre);
        return cliente;
    }
}

package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.serviceinterfaces.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private IPedidoService pService;

    @GetMapping
    public List<Pedido> listar() {
        return pService.list();
    }

    @PostMapping
    public void registrar(@RequestBody Pedido p) {
        pService.insert(p);
    }

    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }
}

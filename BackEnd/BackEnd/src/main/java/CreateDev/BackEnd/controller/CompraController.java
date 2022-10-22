package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Compra;
import org.springframework.web.bind.annotation.*;
import CreateDev.BackEnd.serviceinterfaces.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    private ICompraService cService;

    @GetMapping
    public List<Compra> listar(){return cService.list();}

    @PostMapping
    public void registrar(@RequestBody Compra c){cService.insert(c);}

    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){cService.delete(id);}

}

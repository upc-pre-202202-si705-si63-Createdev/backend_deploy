package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Compra;
import org.springframework.web.bind.annotation.*;
import CreateDev.BackEnd.serviceinterfaces.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private ICompraService cService;

    @GetMapping
    public List<Compra> listar(){return cService.list();}

}

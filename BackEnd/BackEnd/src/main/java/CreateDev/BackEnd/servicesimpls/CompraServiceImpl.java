package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Compra;
import CreateDev.BackEnd.repositories.ICompraRepository;
import org.springframework.stereotype.Service;
import CreateDev.BackEnd.serviceinterfaces.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompraServiceImpl implements ICompraService {
    @Autowired
    private ICompraRepository cR;


    @Override
    public List<Compra> list(){return cR.findAll();}

}

package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Compra;
import CreateDev.BackEnd.repositories.ICompraRepository;
import org.springframework.stereotype.Service;
import CreateDev.BackEnd.serviceinterfaces.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CompraServiceImpl implements ICompraService {
    @Autowired
    private ICompraRepository cR;

    @Override
    public void insert(Compra compra) {
        cR.save(compra);
    }
    @Override
    public List<Compra> list(){return cR.findAll();}

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }


}

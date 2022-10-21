package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compra;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICompraService {

    public void insert(Compra compra);
    public List<Compra> list();
}

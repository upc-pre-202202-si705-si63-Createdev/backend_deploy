package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICompraService {


    List<Compra> list();
}

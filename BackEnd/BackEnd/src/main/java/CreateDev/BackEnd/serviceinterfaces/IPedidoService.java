package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPedidoService {

    public void insert(Pedido pedido);
    public List<Pedido> list();
}

package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {


}

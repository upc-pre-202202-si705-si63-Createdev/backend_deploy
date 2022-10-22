package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICompraRepository extends JpaRepository<Compra,Integer> {
    @Query("FROM Compra c WHERE c.nombre_usuario LIKE %:nombre_usuario%")
    List<Compra> buscarNombre(@Param("nombre_usuario") String nombre_usuario);
}

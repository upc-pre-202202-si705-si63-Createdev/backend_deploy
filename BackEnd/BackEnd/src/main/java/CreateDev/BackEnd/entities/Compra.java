package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "Compra")
public class Compra {

    public Compra(){

    }

    public Compra(int idCompra,String nombreUsuario, int cantidad,float precio_total,float peso_total,
                  int tipo_comprobante, String fecha_cancelacion){
        this.id = idCompra;
        this.nombre = nombreUsuario;


    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre",length = 45,nullable = false)
    private String nombre;
}

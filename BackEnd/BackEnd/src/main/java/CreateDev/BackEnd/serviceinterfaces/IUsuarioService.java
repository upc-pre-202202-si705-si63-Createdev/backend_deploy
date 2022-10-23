package CreateDev.BackEnd.serviceinterfaces;


import CreateDev.BackEnd.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
	
	public void insert(Usuario usuario);

    List<Usuario> list();

    public void delete(int id);

    List<Usuario> search(String nameUsuarios);
}

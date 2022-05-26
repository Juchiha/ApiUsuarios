package curso.java.curso.DAO;

import curso.java.curso.models.Usuario;

import java.util.List;

public interface UsuarioDAO {
    //Este concepto de interfaces, Es un clases donde indicamos que metodos deberia tener una clase
    //obligamos a una clase a tener estos metodos y si no los implementa no compila.
    List<Usuario> getUsuarios();

    void eliminar(int id);
}

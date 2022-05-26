package curso.java.curso.controllers;

import curso.java.curso.DAO.UsuarioDAO;
import curso.java.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDAO usuarioDAO;

    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("Kiwi", "Banana", "Manazana", "Panela");
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario user = new Usuario();
        user.setApellido("Giron");
        user.setNombre("Jose David");
        user.setEmail("Jgiron9001@gmail.com");
        user.setTelefono("3114673616");
        user.setId(id);
        return user;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDAO.getUsuarios();
    }

    public Usuario editar(){
        Usuario user = new Usuario();
        user.setApellido("Giron");
        user.setNombre("Jose David");
        user.setEmail("Jgiron9001@gmail.com");
        user.setTelefono("3114673616");
        return user;
    }
    @RequestMapping(value = "api/eliminarUsuario/{id}", method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable int id){
        usuarioDAO.eliminar(id);
    }

    public Usuario buscar(){
        Usuario user = new Usuario();
        user.setApellido("Giron");
        user.setNombre("Jose David");
        user.setEmail("Jgiron9001@gmail.com");
        user.setTelefono("3114673616");
        return user;
    }

}

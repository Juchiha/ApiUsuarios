package curso.java.curso.DAO;

import curso.java.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository //para acceder a la base de datos
@Transactional //como ejhecutar y organizar las consultas SQL
public class UsuarioDaoImp implements UsuarioDAO{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String Lsql = "FROM Usuario";
        return entityManager.createQuery(Lsql).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }
}

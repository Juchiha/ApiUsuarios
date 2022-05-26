package curso.java.curso.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*Asi funciona una tabla Hibernate*/
@Entity
@Table(name = "usuarios")
public class Usuario {
    //Los getters y setter vienen con projectlombok

    @Getter @Setter @Column(name="nombre")
    private String nombre;

    @Getter @Setter @Column(name="apellido")
    private String apellido;

    @Getter @Setter @Column(name="email")
    private String email;

    @Getter @Setter @Column(name="telefono")
    private String telefono;

    @Getter @Setter @Column(name="password")
    private String password;

    @Getter @Setter @Column(name="id") @Id
    private int id;

}

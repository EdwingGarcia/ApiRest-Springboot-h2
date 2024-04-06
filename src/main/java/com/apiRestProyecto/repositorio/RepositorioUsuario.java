package com.apiRestProyecto.repositorio;
import com.apiRestProyecto.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario,Long> {
    //recibe 2 tipos de datos (clase que voy a extender los metodos jpa,tipo de datos al que se va a aplicar, en este caso ID)

}

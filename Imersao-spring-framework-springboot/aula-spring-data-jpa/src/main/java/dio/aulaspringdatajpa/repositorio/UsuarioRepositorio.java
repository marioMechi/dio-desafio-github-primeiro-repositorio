package dio.aulaspringdatajpa.repositorio;


import dio.aulaspringdatajpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}

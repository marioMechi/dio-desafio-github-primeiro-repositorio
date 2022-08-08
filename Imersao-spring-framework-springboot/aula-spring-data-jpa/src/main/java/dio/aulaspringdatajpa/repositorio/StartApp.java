package dio.aulaspringdatajpa.repositorio;

import dio.aulaspringdatajpa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UsuarioRepositorio repositorio;
    @Override
    public void run(String... args) throws Exception {
        Usuario user = new Usuario();
        user.setNome("MARIO");
        user.setNomeusuario("mario");
        user.setSenha("dio123");

        repositorio.save(user);

        for (Usuario u: repositorio.findAll()){
            System.out.println(u);
        }
    }
}

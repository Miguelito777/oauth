package gt.com.init.oauth.manager;

import gt.com.init.oauth.model.TcUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioManager extends JpaRepository<TcUsuario, Long> {

}

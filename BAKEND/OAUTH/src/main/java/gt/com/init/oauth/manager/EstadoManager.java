package gt.com.init.oauth.manager;

import gt.com.init.oauth.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoManager extends JpaRepository<Estado, Long> {

}

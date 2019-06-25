package gt.com.init.oauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

import gt.com.init.oauth.exception.UsuarioNotFoundException; 
import gt.com.init.oauth.model.TcUsuario;
import gt.com.init.oauth.manager.UsuarioManager;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {
	@Autowired
	UsuarioManager manager;
	
	
	// Get All 
    @GetMapping("All")
    public List<TcUsuario> getAll() {
        return manager.findAll();
    }
 // Create a new 
    @PostMapping("New")
    public TcUsuario create(@Valid @RequestBody TcUsuario item) {
        return manager.save(item);
    }
 // Get a Single 
    @GetMapping("{id}")
    public TcUsuario getById(@PathVariable(value = "id") Long id) throws UsuarioNotFoundException {
        return manager.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
    }
 // Update 
    @PutMapping("{id}")
    public TcUsuario updateById(@PathVariable(value = "id") Long id, @Valid @RequestBody TcUsuario item) throws UsuarioNotFoundException {
    	TcUsuario obj = manager.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
    	obj.setUsuario(item.getUsuario());
    	obj.setObservaciones(item.getObservaciones());
    	obj.setFecha_creacion(item.getFecha_creacion());
    	TcUsuario updatedBook = manager.save(obj);
    	return updatedBook;
    }
 // Delete a 
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable(value = "id") Long id) throws UsuarioNotFoundException {
        TcUsuario obj = manager.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
        manager.delete(obj);
        return ResponseEntity.ok().build();
    }
}

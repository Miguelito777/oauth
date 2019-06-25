package gt.com.init.oauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

import gt.com.init.oauth.exception.EstadoNotFoundException; 
import gt.com.init.oauth.model.Estado;
import gt.com.init.oauth.manager.EstadoManager;

@RestController
@RequestMapping("Estado")
public class EstadoController {
	@Autowired
	EstadoManager manager;
	
	
	// Get All 
    @GetMapping("All")
    public List<Estado> getAll() {
        return manager.findAll();
    }
 // Create a new 
    @PostMapping("New")
    public Estado create(@Valid @RequestBody Estado item) {
        return manager.save(item);
    }
 // Get a Single 
    @GetMapping("{id}")
    public Estado getById(@PathVariable(value = "id") Long id) throws EstadoNotFoundException {
        return manager.findById(id).orElseThrow(() -> new EstadoNotFoundException(id));
    }
 // Update 
    @PutMapping("{id}")
    public Estado updateById(@PathVariable(value = "id") Long id, @Valid @RequestBody Estado item) throws EstadoNotFoundException {
    	Estado obj = manager.findById(id).orElseThrow(() -> new EstadoNotFoundException(id));
    	obj.setEstado(item.getEstado());
    	obj.setObservaciones(item.getObservaciones());
    	obj.setFecha_creacion(item.getFecha_creacion());
    	Estado updatedBook = manager.save(obj);
    	return updatedBook;
    }
 // Delete a 
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable(value = "id") Long id) throws EstadoNotFoundException {
        Estado obj = manager.findById(id).orElseThrow(() -> new EstadoNotFoundException(id));
        manager.delete(obj);
        return ResponseEntity.ok().build();
    }
}

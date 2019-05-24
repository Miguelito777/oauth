package gt.com.init.oauth.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TS_ESTADO")

public class Estado {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String estado;
    private String observaciones;
    private Date fecha_creacion;
    public Estado(){
        super();
    }
    public Estado(Long id, String estado, String observaciones, Date fecha_creacion) {
        super();
        this.id = id;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	} 
}

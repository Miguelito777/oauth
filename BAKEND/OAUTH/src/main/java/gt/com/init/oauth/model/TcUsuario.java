package gt.com.init.oauth.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TC_USUARIO")

public class TcUsuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String password;
    private String observaciones;
    private Date fecha_creacion;
    @ManyToOne//(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_tc_usuario_ref_ts_estado", nullable = false)
    //@OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Estado estado;
	public TcUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TcUsuario(Long id, String usuario, String password, String observaciones, Date fecha_creacion,
			Estado estado) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.observaciones = observaciones;
		this.fecha_creacion = fecha_creacion;
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}


}

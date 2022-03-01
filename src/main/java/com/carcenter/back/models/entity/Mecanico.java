package com.carcenter.back.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MECANICOS")
public class Mecanico implements Serializable {
	
		
	@Id
	private Integer documento; 
	@Column (name="TIPO_DOCUMENTO")
	private String tipoDocumento;
	@Column (name="PRIMER_NOMBRE")
    private String primerNombre;
	@Column (name="SEGUNDO_NOMBRE")
    private String segundoNombre;
	@Column (name="PRIMER_APELLIDO")
    private String primerApellido;
	@Column (name="SEGUNDO_APELLIDO")
    private String segundoApellido;
	@Column (name="CELULAR")
    private String celular;
	@Column (name="DIRECCION")
    private String direccion;
	@Column (name="EMAIL")
    private String email;
    
    
    public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

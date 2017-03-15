package tech.bteam.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the coches database table.
 * 
 */
@Entity
@Table(name="coches")
@NamedQuery(name="Car.findAll", query="SELECT c FROM Car c")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String matricula;

	@Temporal(TemporalType.DATE)
	private Date fechaMatriculacion;

	private int km;

	private String modelo;

	private BigDecimal precio;

	public Car() {
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getFechaMatriculacion() {
		return this.fechaMatriculacion;
	}

	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public int getKm() {
		return this.km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
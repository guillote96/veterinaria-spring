package dominioAplicacion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configuracionpublica")

public class ConfiguracionPublica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idConfiguracion")
	private int idConfiguracion;
	@Column(name = "nombre")
	private Boolean nombre;
	@Column(name = "fecha_nac")
	private Boolean fecha_nac;
	@Column(name = "especie")
	private Boolean especie;
	@Column(name = "raza")
	private Boolean raza;
	@Column(name = "sexo")
	private Boolean sexo;
	@Column(name = "color")
	private Boolean color;
	@Column(name = "foto")
	private Boolean foto;
	

	public ConfiguracionPublica() {
		// TODO Auto-generated constructor stub
	}
	
	public ConfiguracionPublica(int idConfiguracionPublica, Boolean nombre, Boolean fecha_nac, Boolean especie,
			Boolean raza, Boolean sexo, Boolean color, Boolean foto) {
		this.idConfiguracion = idConfiguracionPublica;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.foto = foto;
	}
	
	public ConfiguracionPublica(Boolean nombre, Boolean fecha_nac, Boolean especie, Boolean raza, Boolean sexo,
			Boolean color, Boolean foto) {
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.foto = foto;
	}
	
	public int getIdConfiguracionPublica() {
		return idConfiguracion;
	}


	public void setIdConfiguracionPublica(int idConfiguracionPublica) {
		this.idConfiguracion = idConfiguracionPublica;
	}




	public Boolean getNombre() {
		return nombre;
	}


	public void setNombre(Boolean nombre) {
		this.nombre = nombre;
	}


	public Boolean getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(Boolean fecha_nac) {
		this.fecha_nac = fecha_nac;
	}


	public Boolean getEspecie() {
		return especie;
	}


	public void setEspecie(Boolean especie) {
		this.especie = especie;
	}


	public Boolean getSexo() {
		return sexo;
	}


	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}


	public Boolean getRaza() {
		return raza;
	}


	public void setRaza(Boolean raza) {
		this.raza = raza;
	}


	public Boolean getColor() {
		return color;
	}


	public void setColor(Boolean color) {
		this.color = color;
	}


	public Boolean getFoto() {
		return foto;
	}


	public void setFoto(Boolean foto) {
		this.foto = foto;
	}

}

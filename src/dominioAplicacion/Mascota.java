package dominioAplicacion;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMascota")
	private int idMascota;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_nac")
	private Date fecha_nac;
	@Column(name = "especie")
	private String especie;
	@Column(name = "raza")
	private String raza;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "color")
	private String color;
	@Column(name = "señas_part")
	private String señas_part;
	
	@ManyToOne (cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "idDueño")
	@JsonIgnore
	private Dueño dueño;
	
	@OneToOne (cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@JoinColumn(name="idVeterinario")
	@JsonIgnore
	private Veterinario veterinario;
	
	
    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    @JsonIgnore
	private List<Evento> eventos= new ArrayList<Evento>();
	
    
    
    
    


	public Mascota() {
		
	}
	
	public Mascota(String nombre, Date fecha_nac, String especie, String raza, String sexo, String color,
			String señas_part, Dueño dueño) {

		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.señas_part = señas_part;
		this.dueño = dueño;
	}
	
	public Mascota(String nombre, Date fecha_nac, String especie, String raza, String sexo, String color,
			String señas_part, Dueño dueño, Veterinario veterinario) {
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.señas_part = señas_part;
		this.dueño = dueño;
		this.veterinario = veterinario;
	}
	
	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	

	
	
	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public Dueño getDueño() {
		return dueño;
	}

	public void setDueño(Dueño dueño) {
		this.dueño = dueño;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSeñas_part() {
		return señas_part;
	}
	public void setSeñas_part(String señas_part) {
		this.señas_part = señas_part;
	}

		public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", fecha_nac=" + fecha_nac + ", especie="
				+ especie + ", raza=" + raza + ", sexo=" + sexo + ", color=" + color + ", señas_part=" + señas_part
				+ ", dueño=" + dueño.getIdDueño() +"]";
	}

	

}

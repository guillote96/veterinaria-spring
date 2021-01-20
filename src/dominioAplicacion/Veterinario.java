package dominioAplicacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "veterinario")
public class Veterinario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVeterinario")
	private int idVeterinario;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "domicilio_clinica")
	private String domicilio_clinica;
	@Column(name = "habilitado")
	private Boolean habilitado;
	@OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL)
	private List <Mascota> mascotas= new ArrayList<Mascota>();
	

	
	public Veterinario() {
		
	}
	
	public Veterinario(String nombre, String apellido, String telefono, String email, String password,
			String domicilio_clinica, Boolean habilitado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.domicilio_clinica = domicilio_clinica;
		this.habilitado = habilitado;
	}
	
	public Veterinario(int idVeterinario, String nombre, String apellido, String telefono, String email,
			String password, String domicilio_clinica, Boolean habilitado) {
		this.idVeterinario = idVeterinario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.domicilio_clinica = domicilio_clinica;
		this.habilitado = habilitado;
	}
	
    public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDomicilio_clinica() {
		return domicilio_clinica;
	}
	public void setDomicilio_clinica(String domicilio_clinica) {
		this.domicilio_clinica = domicilio_clinica;
	}
	public Boolean getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	@Override
	public String toString() {
		return "Veterinario [idVeterinario=" + idVeterinario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", email=" + email + ", password=" + password + ", domicilio_clinica="
				+ domicilio_clinica + ", habilitado=" + habilitado + "]";
	}

}

package dominioAplicacion;




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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table(name = "dueño")
public class Dueño {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDueño")
	private int idDueño;
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
	
	
	@OneToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name="idConfiguracion")
	@JsonIgnore
	private ConfiguracionPublica configuracion;
	
    @OneToMany(mappedBy = "dueño", cascade = CascadeType.ALL)
	@JsonIgnore
	private List <Mascota> mascotas= new ArrayList<Mascota>();

	public Dueño() {
		// TODO Auto-generated constructor stub
	}
	
	public Dueño(String nombre, String apellido, String telefono, String email, String password,
			ConfiguracionPublica configuracion) {
		this.idDueño = idDueño;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.configuracion = configuracion;

	}

	
	public int getIdDueño() {
		return idDueño;
	}

	public void setIdDueño(int idDueño) {
		this.idDueño = idDueño;
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

	public ConfiguracionPublica getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(ConfiguracionPublica configuracion) {
		this.configuracion = configuracion;
	}
	
	@Override
	public String toString() {
		return "Dueño [idDueño=" + idDueño + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", email=" + email + ", password=" + password + ", configuracion=" + configuracion.getIdConfiguracionPublica() +  "]";
	}


}

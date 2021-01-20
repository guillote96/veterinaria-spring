package dominioAplicacion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "administrador")

public class Administrador {
	@Id
	@Column(name = "idAdministrador")
	private int idAdministrador;
	@Column (name = "username")
	private String username;
	@Column (name = "password")
	private String password;
	public Administrador() {
		
	}
	
	public Administrador(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	public Administrador(int idAdministrador, String username, String password) {
		this.idAdministrador = idAdministrador;
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	
	@Override
	public String toString() {
		return "Administrador [idAdministrador=" + idAdministrador + ", username=" + username + ", password=" + password
				+ "]";
	}

}

package dominioAplicacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	@Id
	
	@Column(name = "idEvento")
	private int idEvento;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "descripcion")
	private String descripcion; // Motivo, diagnostico, indicaciones , droga , resultado
	
	@OneToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name="idVeterinario")
	private Veterinario veterinario;
	
	@Column(name = "nroCachorro")
	private int nroCachorro;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "idMascota")
	private Mascota mascota;


	@JoinTable(
	        name = "evento_tipo",
	        joinColumns = @JoinColumn(
	                name = "idEvento"

	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "idTipo"
	        )
	)
	@OneToMany
	private List<Tipo> tipos=new ArrayList<Tipo>();
	
	public Evento() {
		
	}
	public Evento(Date fecha, String descripcion, Veterinario veterinario, int nroCachorro) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.veterinario = veterinario;
		this.nroCachorro = nroCachorro;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	public int getNroCachorro() {
		return nroCachorro;
	}
	public void setNroCachorro(int nroCachorro) {
		this.nroCachorro = nroCachorro;
	}
	
	
	
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	public List<Tipo> getTipos() {
		return tipos;
	}
	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}
	
	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", fecha=" + fecha + ", descripcion=" + descripcion + ", veterinario="
				+ veterinario + ", nroCachorro=" + nroCachorro + ", mascota="+mascota.toString()+"]";
	}

}

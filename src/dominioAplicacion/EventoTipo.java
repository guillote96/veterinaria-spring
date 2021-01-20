package dominioAplicacion;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evento_tipo")

public class EventoTipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEventoTipo")
	private int idEventoTipo;
	
	@OneToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name="idEvento")
	private Evento evento;
	

	@OneToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name="idTipo")
	private Tipo tipo;
	
	public EventoTipo() {
		
	}
	
	public EventoTipo(Evento evento, Tipo tipo) {


		this.evento = evento;
		this.tipo = tipo;
	}
	
	
	public int getIdEventoTipo() {
		return idEventoTipo;
	}
	public void setIdEventoTipo(int idEventoTipo) {
		this.idEventoTipo = idEventoTipo;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "EventoTipo [idEventoTipo=" + idEventoTipo + ", evento=" + evento.getIdEvento() + ", tipo=" + tipo.getIdTipo() + "]";
	}



}

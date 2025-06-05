package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_especialidad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EspecialidadJuanMR {

	@Id
	@Column(name = "id_especialidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private int idEspecialidad;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Override
	public String toString() {
		return titulo;
	}
	
	
	
}

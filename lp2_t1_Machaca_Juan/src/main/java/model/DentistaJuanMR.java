package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_dentista")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class DentistaJuanMR {

	@Id
	@Column(name = "id_dentista")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private int idDentista;

	@Column(name = "cop", nullable = false)
	private String cop;

	@Column(name = "nombre_completo", nullable = false)
	private String nombre;

	@Column(name = "fecha_inicio_contrato", nullable = false)
	private LocalDate fechaInicio;

	@Column(name = "turno", nullable = false)
	private String turno;

	@Column(name = "correo", nullable = false)
	private String correo;
	
	@ManyToOne
	@JoinColumn(name="id_especialidad")
	private EspecialidadJuanMR especialidad;

	@Override
	public String toString() {
		return nombre;
	}
	
	
}

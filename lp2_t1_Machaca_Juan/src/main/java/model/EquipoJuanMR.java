package model;

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
@Table(name = "tbl_equipo_dental")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class EquipoJuanMR {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    @EqualsAndHashCode.Include
    private int nroEquipo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "fecha_adquisicion", nullable = true)
    private LocalDateTime fechaAdquisicion;

    @Column(name = "estado", nullable = false)
    private String estado;
    
    @ManyToOne
    @JoinColumn(name="id_dentista")
    private DentistaJuanMR dentista;

}

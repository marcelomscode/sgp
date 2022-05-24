package com.sgp.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="valores")
@Getter @Setter @NoArgsConstructor
public class QuadrosValores {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String descricao;
	public BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name="quadrosValores_id")
	public Quadros quadros;
	
	
}

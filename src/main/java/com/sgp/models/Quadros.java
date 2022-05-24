package com.sgp.models;

import java.util.List;

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
@Table(name="quadros")
@Getter @Setter @NoArgsConstructor
public class Quadros {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String nome;
	
	@OneToMany(mappedBy = "quadros")
	public List<QuadrosValores> quadroValores;
	
	
}

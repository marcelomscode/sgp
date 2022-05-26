package com.sgp.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="valores")
@Getter @Setter @NoArgsConstructor @Data
public class QuadrosValores {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String descricao;
	public Date vencimento;
	public Date data;
	public BigDecimal valor;
	public boolean pago;
	
	@ManyToOne
	@JoinColumn(name="quadrosValores_id")
	public Quadros quadros;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	
}

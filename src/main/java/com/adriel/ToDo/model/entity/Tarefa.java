package com.adriel.ToDo.model.entity;

//import java.time.LocalDate;

import javax.persistence.Column;
//import javax.persistence.Convert;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.convert.Jsr310Converters;

//import com.adriel.ToDo.model.enums.StatusTarefa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tarefa", schema = "tarefa")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	//@Column(name = "status")
	//@Enumerated(value = EnumType.STRING)
	//private StatusTarefa status;
	
	@Column(name = "observacoes")
	private String observacoes;
	
	//@Column(name = "data_criacao")
	//@Convert(converter = Jsr310Converters.DateToLocalDateConverter.class)
	//private LocalDate dataCriacao;
	
	//@Column(name = "data_atualizacao")
	//@Convert(converter = Jsr310Converters.DateToLocalDateConverter.class)
	//private LocalDate dataAtualizacao;

}

package com.ocean.direct.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Getter @Setter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Board extends OwnAuditable{
	private static final long serialVersionUID = 187976125156105037L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true, nullable = false, length = 50)
	private String title;

	private String content;

	private Double price;
	
	@Column(nullable = false)
	private Double latitude;
	
	@Column(nullable = false)
	private Double longitude;

}
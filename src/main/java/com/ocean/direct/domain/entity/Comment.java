package com.ocean.direct.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Getter @Setter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Comment extends OwnAuditable {
	private static final long serialVersionUID = -3581767852095691852L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String comment;
	
	@ManyToOne
	private Board board;
}
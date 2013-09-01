package com.ocean.direct.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Getter
@Setter
@Entity
@ToString(of={"id", "title"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Board implements Serializable {
	private static final long serialVersionUID = 8927305759850568385L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;

	public Board() {}
	
	public Board(Long id) {
		this.id = id;
	}
}

package com.ocean.direct.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Getter @Setter
@Entity
@ToString(of={"id"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class BoardContentDetail implements Serializable {
	private static final long serialVersionUID = 4952966612299017429L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition="TEXT")
	private String content;
	
}

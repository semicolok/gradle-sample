package com.ocean.direct.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Getter @Setter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User implements Serializable {
	private static final long serialVersionUID = -3581767852095691852L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true, nullable = false, length = 50)
	private String email;

	@Column(nullable = false, length = 100)
	private String userPassword;

	@Column(nullable = false, length = 15)
	private String name;

	@Column(nullable = false, length = 15)
	private String phoneNumber;
	
	@Column(nullable = false)
	private Double latitude;
	
	@Column(nullable = false)
	private Double longitude;
	
	@Column(nullable = false, columnDefinition="int default 1")
	private boolean enabled;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;
}
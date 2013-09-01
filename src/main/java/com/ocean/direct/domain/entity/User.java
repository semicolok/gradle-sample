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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Getter @Setter
@Entity
@ToString(of={"id", "email", "name", "enabled"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User implements Serializable {
	private static final long serialVersionUID = 6627239276873585397L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true, nullable = false, length = 50)
	private String email;

	@Getter(AccessLevel.PRIVATE)
	@Column(nullable = false, length = 100)
	private String userPassword;

	@Column(nullable = false, length = 15)
	private String name;

	@Column(nullable = false, length = 15)
	private String mobileNumber;
	
	@Column(nullable = false, length = 15)
	private String phoneNumber;
	
	@Column(nullable = false, columnDefinition="int default 1")
	private boolean enabled;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	private Date updatedTime;
}

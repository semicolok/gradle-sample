package com.ocean.direct.domain.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.common.collect.Sets;

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

	@Column(nullable = false)
	private Double latitude;
	
	@Column(nullable = false)
	private Double longitude;
	
	@OneToMany(mappedBy = "baord", targetEntity = Comment.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private Set<Comment> comments=Sets.newHashSet();
	
	@OneToMany(mappedBy = "baord", targetEntity = Comment.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private Set<UploadedFile> udd=Sets.newHashSet();

}
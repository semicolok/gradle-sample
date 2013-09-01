package com.ocean.direct.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Getter
@Setter
@Entity
@Table(name = "BoardContent")
@ToString(of = { "id", "title" })
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class BoardContent implements Serializable {
	private static final long serialVersionUID = -3239191768664682009L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private Double latitude;
	private Double longitude;
	
	@Column(nullable = false, columnDefinition = "int default 0")
	private boolean headline;
	
	@Column(nullable = false, columnDefinition = "int default 1")
	private boolean repliable;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private BoardContentDetail boardContentDetail;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Board board;

	@PrePersist
	protected void onCreate() {
		updatedTime = registTime = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		updatedTime = new Date();
	}

	@JsonIgnore
	public Map<String, Object> getValueMap(){
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("id", this.getId());
		map.put("title", this.getTitle());
		map.put("headline", this.isHeadline());
		map.put("repliable", this.isRepliable());
		map.put("updatedTime", this.getUpdatedTime().getTime());
		map.put("registTime", this.getRegistTime().getTime());
		return map;
	}

	@JsonIgnore
	public Map<String, Object> getDetailValueMap(){
		Map<String, Object> map = getValueMap();
		map.put("boardContentDetail", this.getBoardContentDetail());
		return map;
	}
	
//	public void modify(BoardContentDto content) {
//		BoardContentDetail boardContentDetail = this.getBoardContentDetail();
//		boardContentDetail.setContent(content.getContent());
//		this.setTitle(content.getTitle());
//	}
}

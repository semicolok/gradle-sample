package com.ocean.direct.domain.entity;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;

@MappedSuperclass
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public abstract class OwnAuditable implements Auditable<User, Long> {
	private static final long serialVersionUID = -938188195630007089L;

	@ManyToOne(fetch = FetchType.LAZY)
	private User createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	private User lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
	
	@Override
	public User getCreatedBy() {
		return createdBy;
	}

	@Override
	public DateTime getCreatedDate() {
		return createdDate == null ? null : new DateTime(createdDate);
	}

	@Override
	public User getLastModifiedBy() {
		return lastModifiedBy;
	}

	@Override
	public DateTime getLastModifiedDate() {
		return lastModifiedDate == null ? null : new DateTime(lastModifiedDate);
	}

	@Override
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate != null ? createdDate.toDate() :null;
	}

	@Override
	public void setLastModifiedBy(User lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;

	}

	@Override
	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate != null ? lastModifiedDate.toDate() :null;
	}

	@Override
	public boolean isNew() {
		return getId() == null;
	}

	@Override
	public int hashCode() {
		int hashCode = 19;
		hashCode += null == getId() ? 0 : getId().hashCode() * 31;
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;

		OwnAuditable that = (OwnAuditable) obj;
		return this.getId() != null && this.getId().equals(that.getId());
	}
}

package com.ocean.direct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ocean.direct.domain.entity.UploadedFile;

public interface UploadedFileRepository extends JpaRepository<UploadedFile, Long>, QueryDslPredicateExecutor<UploadedFile> {
	
}
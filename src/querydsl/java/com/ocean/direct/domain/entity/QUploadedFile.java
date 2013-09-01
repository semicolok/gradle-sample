package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUploadedFile is a Querydsl query type for UploadedFile
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUploadedFile extends EntityPathBase<UploadedFile> {

    private static final long serialVersionUID = -1819585307;

    public static final QUploadedFile uploadedFile = new QUploadedFile("uploadedFile");

    public final StringPath fileName = createString("fileName");

    public final StringPath filePath = createString("filePath");

    public final StringPath fileSize = createString("fileSize");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QUploadedFile(String variable) {
        super(UploadedFile.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QUploadedFile(Path<? extends UploadedFile> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QUploadedFile(PathMetadata<?> metadata) {
        super(UploadedFile.class, metadata);
    }

}


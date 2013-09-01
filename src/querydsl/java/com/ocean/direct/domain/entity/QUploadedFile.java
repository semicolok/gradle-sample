package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUploadedFile is a Querydsl query type for UploadedFile
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUploadedFile extends EntityPathBase<UploadedFile> {

    private static final long serialVersionUID = -1819585307;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QUploadedFile uploadedFile = new QUploadedFile("uploadedFile");

    public final QBoardContentDetail boardContentDetail;

    public final StringPath fileName = createString("fileName");

    public final StringPath filePath = createString("filePath");

    public final StringPath fileSize = createString("fileSize");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QUploadedFile(String variable) {
        this(UploadedFile.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QUploadedFile(Path<? extends UploadedFile> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUploadedFile(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUploadedFile(PathMetadata<?> metadata, PathInits inits) {
        this(UploadedFile.class, metadata, inits);
    }

    public QUploadedFile(Class<? extends UploadedFile> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boardContentDetail = inits.isInitialized("boardContentDetail") ? new QBoardContentDetail(forProperty("boardContentDetail")) : null;
    }

}


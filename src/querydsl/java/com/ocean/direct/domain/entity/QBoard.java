package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -576440803;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QBoard board = new QBoard("board");

    public final QOwnAuditable _super;

    public final SetPath<Comment, QComment> comments = this.<Comment, QComment>createSet("comments", Comment.class, QComment.class, PathInits.DIRECT);

    public final StringPath content = createString("content");

    // inherited
    public final QUser createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    // inherited
    public final QUser lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate;

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final StringPath title = createString("title");

    public final SetPath<UploadedFile, QUploadedFile> udd = this.<UploadedFile, QUploadedFile>createSet("udd", UploadedFile.class, QUploadedFile.class, PathInits.DIRECT);

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QBoard(Path<? extends Board> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBoard(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBoard(PathMetadata<?> metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QOwnAuditable(type, metadata, inits);
        this.createdBy = _super.createdBy;
        this.createdDate = _super.createdDate;
        this.lastModifiedBy = _super.lastModifiedBy;
        this.lastModifiedDate = _super.lastModifiedDate;
    }

}


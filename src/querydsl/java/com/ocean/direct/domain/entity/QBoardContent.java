package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBoardContent is a Querydsl query type for BoardContent
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBoardContent extends EntityPathBase<BoardContent> {

    private static final long serialVersionUID = 566553500;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QBoardContent boardContent = new QBoardContent("boardContent");

    public final QBoard board;

    public final QBoardContentDetail boardContentDetail;

    public final BooleanPath headline = createBoolean("headline");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final BooleanPath repliable = createBoolean("repliable");

    public final StringPath title = createString("title");

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public final QUser user;

    public QBoardContent(String variable) {
        this(BoardContent.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QBoardContent(Path<? extends BoardContent> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBoardContent(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBoardContent(PathMetadata<?> metadata, PathInits inits) {
        this(BoardContent.class, metadata, inits);
    }

    public QBoardContent(Class<? extends BoardContent> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
        this.boardContentDetail = inits.isInitialized("boardContentDetail") ? new QBoardContentDetail(forProperty("boardContentDetail")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}


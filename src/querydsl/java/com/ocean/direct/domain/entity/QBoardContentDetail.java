package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBoardContentDetail is a Querydsl query type for BoardContentDetail
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBoardContentDetail extends EntityPathBase<BoardContentDetail> {

    private static final long serialVersionUID = -851195123;

    public static final QBoardContentDetail boardContentDetail = new QBoardContentDetail("boardContentDetail");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QBoardContentDetail(String variable) {
        super(BoardContentDetail.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QBoardContentDetail(Path<? extends BoardContentDetail> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QBoardContentDetail(PathMetadata<?> metadata) {
        super(BoardContentDetail.class, metadata);
    }

}


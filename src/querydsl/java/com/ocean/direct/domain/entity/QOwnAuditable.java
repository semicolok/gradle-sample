package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOwnAuditable is a Querydsl query type for OwnAuditable
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QOwnAuditable extends EntityPathBase<OwnAuditable> {

    private static final long serialVersionUID = -515780680;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOwnAuditable ownAuditable = new QOwnAuditable("ownAuditable");

    public final QUser createdBy;

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final QUser lastModifiedBy;

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public QOwnAuditable(String variable) {
        this(OwnAuditable.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QOwnAuditable(Path<? extends OwnAuditable> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOwnAuditable(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOwnAuditable(PathMetadata<?> metadata, PathInits inits) {
        this(OwnAuditable.class, metadata, inits);
    }

    public QOwnAuditable(Class<? extends OwnAuditable> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.createdBy = inits.isInitialized("createdBy") ? new QUser(forProperty("createdBy")) : null;
        this.lastModifiedBy = inits.isInitialized("lastModifiedBy") ? new QUser(forProperty("lastModifiedBy")) : null;
    }

}


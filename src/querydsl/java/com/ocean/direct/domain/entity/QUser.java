package com.ocean.direct.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1264950860;

    public static final QUser user = new QUser("user");

    public final StringPath email = createString("email");

    public final BooleanPath enabled = createBoolean("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mobileNumber = createString("mobileNumber");

    public final StringPath name = createString("name");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public final StringPath userPassword = createString("userPassword");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QUser(Path<? extends User> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata<?> metadata) {
        super(User.class, metadata);
    }

}


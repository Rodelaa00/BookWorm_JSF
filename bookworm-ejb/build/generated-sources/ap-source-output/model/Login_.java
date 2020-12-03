package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Bookshelf;
import model.Profile;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T23:50:49")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, String> password;
    public static volatile SingularAttribute<Login, Profile> profile;
    public static volatile ListAttribute<Login, Bookshelf> bookshelfList;
    public static volatile SingularAttribute<Login, String> userName;
    public static volatile SingularAttribute<Login, BigDecimal> userId;

}
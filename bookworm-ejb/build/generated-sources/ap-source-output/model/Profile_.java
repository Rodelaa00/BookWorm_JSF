package model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Login;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T23:50:49")
@StaticMetamodel(Profile.class)
public class Profile_ { 

    public static volatile SingularAttribute<Profile, String> firstName;
    public static volatile SingularAttribute<Profile, String> lastName;
    public static volatile SingularAttribute<Profile, String> gender;
    public static volatile SingularAttribute<Profile, Login> login;
    public static volatile SingularAttribute<Profile, BigDecimal> userId;
    public static volatile SingularAttribute<Profile, BigInteger> age;
    public static volatile SingularAttribute<Profile, String> email;

}
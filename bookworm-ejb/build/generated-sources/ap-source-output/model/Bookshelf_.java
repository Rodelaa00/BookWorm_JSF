package model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Book;
import model.BookshelfPK;
import model.Login;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T23:50:49")
@StaticMetamodel(Bookshelf.class)
public class Bookshelf_ { 

    public static volatile SingularAttribute<Bookshelf, BigInteger> bookRate;
    public static volatile SingularAttribute<Bookshelf, Book> book;
    public static volatile SingularAttribute<Bookshelf, BookshelfPK> bookshelfPK;
    public static volatile SingularAttribute<Bookshelf, String> bookReview;
    public static volatile SingularAttribute<Bookshelf, Login> login;
    public static volatile SingularAttribute<Bookshelf, String> bookMark;

}
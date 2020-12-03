package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Bookshelf;
import model.Genre;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T23:50:49")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Date> releaseDate;
    public static volatile SingularAttribute<Book, String> authorName;
    public static volatile SingularAttribute<Book, String> description;
    public static volatile ListAttribute<Book, Genre> genreList;
    public static volatile ListAttribute<Book, Bookshelf> bookshelfList;
    public static volatile SingularAttribute<Book, String> bookName;
    public static volatile SingularAttribute<Book, BigDecimal> bookId;

}
package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T23:50:49")
@StaticMetamodel(Genre.class)
public class Genre_ { 

    public static volatile SingularAttribute<Genre, BigDecimal> genreId;
    public static volatile SingularAttribute<Genre, String> genreName;
    public static volatile ListAttribute<Genre, Book> bookList;

}
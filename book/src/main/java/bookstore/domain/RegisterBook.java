package bookstore.domain;

import bookstore.domain.*;
import bookstore.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RegisterBook extends AbstractEvent {

    private Long id;
    private String title;
    private String subTitle;
    private String author;
    private String status;
    private String publi;

    public RegisterBook(Book aggregate) {
        super(aggregate);
    }

    public RegisterBook() {
        super();
    }
}
//>>> DDD / Domain Event

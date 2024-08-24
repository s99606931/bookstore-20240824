package bookstore.domain;

import bookstore.domain.*;
import bookstore.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BorrowedBook extends AbstractEvent {

    private Long id;
    private Long bookId;
    private Long customerId;
    private Date borrowDate;
}

package bookstore.infra;

import bookstore.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BorrowHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Borrow>> {

    @Override
    public EntityModel<Borrow> process(EntityModel<Borrow> model) {
        return model;
    }
}

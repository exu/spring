package context_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("assMessage")
public class Dupa implements MessageService {
    @Override
    public String getMessage() {
        return "Duppaaaa!!!";
    }
}

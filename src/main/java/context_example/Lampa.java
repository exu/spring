package context_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lampMessage")
public class Lampa implements MessageService {
    @Override
    public String getMessage() {
        return "LAMPaaaaaa!!!";
    }
}

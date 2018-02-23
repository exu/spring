package context_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private MessageService service;

    // we're choosing valid autowired instance when there is
    // conflict with two @Components which implementing same interface
    // @Qualifier("assMessage") is for "instance" not "definintion"
    @Autowired
    public MessagePrinter(@Qualifier("lampMessage") MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
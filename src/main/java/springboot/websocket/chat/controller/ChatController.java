package springboot.websocket.chat.controller;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import springboot.websocket.chat.model.Message;
import springboot.websocket.chat.model.OutputMessage;

@Controller
public class ChatController {
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public OutputMessage greeting(Message message) throws Exception {
        return new OutputMessage(message.getName() + ": "
               + message.getText() + " " + LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
    }
}

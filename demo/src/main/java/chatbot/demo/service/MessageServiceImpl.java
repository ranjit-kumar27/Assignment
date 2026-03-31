package chatbot.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
    @Override
    public String answer(String message) {
        String text=message.trim().toLowerCase();
        return switch (text) {
            case "hi" -> "Hello";
            case "bye" -> "Goodbye";
            default -> "How may I help you?";
        };
    }
}

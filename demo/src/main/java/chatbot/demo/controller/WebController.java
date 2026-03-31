package chatbot.demo.controller;

import chatbot.demo.dto.Message;
import chatbot.demo.dto.MessageResponse;
import chatbot.demo.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
@RequiredArgsConstructor
@Slf4j
public class WebController {
    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<MessageResponse> webhook(@RequestBody Message message) {
            log.info("user message: {}", message.getText());
        String response=messageService.answer(message.getText());
       return ResponseEntity.ok(new MessageResponse(message.getText(),response));
    }
}

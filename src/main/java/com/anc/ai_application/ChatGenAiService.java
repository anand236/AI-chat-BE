package com.anc.ai_application;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatGenAiService {
    private final ChatModel chatModel;

    public ChatGenAiService(ChatModel chatModel){
        this.chatModel = chatModel;
    }

    public String askAi(String prompt){
        return this.chatModel.call(prompt);
    };
}

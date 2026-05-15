package com.anc.ai_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/")
public class ChatGenAiController {

    @Autowired
    ChatGenAiService chatGenAiService;

    @GetMapping("ask-ai")
    public Map getResponse(@RequestParam String prompt){
        String resp =  chatGenAiService.askAi(prompt);
        return Map.of("resp",resp);
    }

}

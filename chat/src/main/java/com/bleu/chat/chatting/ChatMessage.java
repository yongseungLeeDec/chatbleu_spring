package com.bleu.chat.chatting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.StringTokenizer;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

}
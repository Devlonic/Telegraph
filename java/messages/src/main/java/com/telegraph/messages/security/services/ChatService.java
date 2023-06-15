package com.telegraph.messages.security.services;


import com.telegraph.messages.models.Channel;
import com.telegraph.messages.rep.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public Channel getChannelByName(String name) {
        return chatRepository.findByName(name);
    }

    public Optional<Channel> getChannelById(int id) {
        return chatRepository.findById(Long.valueOf(id));
    }


    public Channel saveChannel(Channel channel) {
        return chatRepository.save(channel);
    }

    public void deleteChannel(Long id) {
        chatRepository.deleteById(id);
    }
}

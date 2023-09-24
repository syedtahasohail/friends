package com.example.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.friends.models.Friend;
import com.example.friends.repository.FriendsRepository;
import com.example.friends.service.IFriend;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("friends")
public class FriendsController {

    private IFriend<Friend> repo;

    public FriendsController() {
        repo = new FriendsRepository();

    }

    @GetMapping(value = "/")
    public Collection<Friend> getFriend() {
        return repo.getFriends();
    }

}

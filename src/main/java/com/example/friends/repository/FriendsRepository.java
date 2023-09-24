package com.example.friends.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.friends.models.Friend;
import com.example.friends.service.IFriend;

public class FriendsRepository implements IFriend<Friend> {

    private HashMap<Integer, Friend> repo;

    public FriendsRepository() {
        repo = new HashMap<>();
        Friend friend = new Friend();
        friend.setName("John Doe");
        friend.setProfession("Freelancer");
        friend.setAge(25);

        repo.put(repo.size() + 1, friend);

        friend = new Friend();

        friend.setName("Barry Allen");
        friend.setProfession("Speedster");
        friend.setAge(22);
        repo.put(repo.size() + 1, friend);

    }

    @Override
    public Collection<Friend> getFriends() {
        return repo.values();

    }

}

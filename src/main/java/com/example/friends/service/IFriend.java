package com.example.friends.service;

import java.util.Collection;

public interface IFriend<T> {
    public Collection<T> getFriends();
}

package com.lnt.boyfriends.repo;

import com.lnt.boyfriends.model.BoyFriendsList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

@Repository
public interface BoyFriendRepo extends MongoRepository<BoyFriendsList,Integer> {

    public void deleteByBoyFriendsId(Integer BoyFriendsId);




}

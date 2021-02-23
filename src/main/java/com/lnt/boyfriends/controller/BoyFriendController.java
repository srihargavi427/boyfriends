package com.lnt.boyfriends.controller;

import com.lnt.boyfriends.repo.BoyFriendRepo;
import com.lnt.boyfriends.model.BoyFriendsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Boyfriends")
public class BoyFriendController {

    @Autowired
    BoyFriendRepo boyFriendRepo;

    @PostMapping("/create")
    public void createBoyFriendController(@RequestBody BoyFriendsList c) {
        boyFriendRepo.save(c);
    }
    @GetMapping("/allBoyFriends")
    public List<BoyFriendsList>getAllBoyFriendsList(){
        List<BoyFriendsList>all=boyFriendRepo.findAll();
        return all;

    }

    @DeleteMapping("/delete/{name}")
    public void deleteRecord(@PathVariable Integer BoyFriendsId) {
        boyFriendRepo.deleteByBoyFriendsId(BoyFriendsId);

    }
}

package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){

        User user1 = new Millenials("Tuvela");
        User user2 = new YGeneration("User1989");
        User user3 = new ZGeneration("Pervesa");

        String user1SharePost = user1.sharePost();
        System.out.println(user1SharePost);
        String user2SharePost = user2.sharePost();
        System.out.println(user2SharePost);
        String user3SharePost = user3.sharePost();
        System.out.println(user1SharePost);

        assertEquals("Post opublikowano na: Facebook", user1SharePost);
        assertEquals("Post opublikowano na: Twitter", user2SharePost);
        assertEquals("Post opublikowano na: Snapchat", user3SharePost);
    }
    @Test
    void testIndividualSharingStrategy(){
        User user = new ZGeneration("Tuvela");
        String userSharePost = user.sharePost();
        System.out.println(userSharePost);
        user.setSocialPublisher(new FacebookPublisher());
        userSharePost = user.sharePost();

        assertEquals("Post opublikowano na: Facebook", userSharePost);

    }
}

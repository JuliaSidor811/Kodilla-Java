package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= LocalDateTime.now().getYear()-20)
                .filter(forumUser -> forumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+entry.getValue())
                .forEach(System.out::println);

        int[] numbers = {12,3,3,31,1};
        IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);




    }
}

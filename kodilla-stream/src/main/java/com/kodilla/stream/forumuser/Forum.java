package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.*;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1,"tuvela",'F', LocalDate.parse("1999-11-08"),2));
        forumUserList.add(new ForumUser(2,"jurek_ch",'M', LocalDate.parse("1996-10-10"),8));
        forumUserList.add(new ForumUser(3,"zofiachrom",'F', LocalDate.parse("1998-02-04"),1));
        forumUserList.add(new ForumUser(4,"majqel",'M', LocalDate.parse("2003-03-16"),10));
        forumUserList.add(new ForumUser(5,"kawitwi",'M', LocalDate.parse("1997-02-20"),3));
        forumUserList.add(new ForumUser(6,"staramsieok",'M', LocalDate.parse("1987-08-28"),5));
        forumUserList.add(new ForumUser(7,"haneek",'F', LocalDate.parse("1978-03-07"),12));
        forumUserList.add(new ForumUser(8,"ver.ziel",'F', LocalDate.parse("1997-11-03"),3));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}

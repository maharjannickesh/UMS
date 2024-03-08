package com.usermanagement.todolist;

import com.usermanagement.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoList {

    private int id;

    private String title;

    private Date createdDate;

    private boolean completed;

    private User user;



}

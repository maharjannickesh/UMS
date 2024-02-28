package com.usermanagement.todolist;


import com.usermanagement.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "todolist")
public class TodoListEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name="createdDate")
    private Date createdDate;

    @Column(name = "completed")
    private boolean completed = false;

    @Column(name="userId")
    private User user;
}

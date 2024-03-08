package com.usermanagement.todolist;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoListController {

    @GetMapping
    public TodoList getAllList(){

        return  new TodoList();
    }

    @PostMapping
    public TodoList addList(@RequestBody TodoList todoList){

        return new TodoList();
    }

    @PutMapping
    public TodoList updateList(@RequestBody TodoList todoList){

        return  new TodoList();
    }

    @DeleteMapping
    public String deleteList(@RequestBody TodoList todoList){
        return "Delete user Successful";
    }


}

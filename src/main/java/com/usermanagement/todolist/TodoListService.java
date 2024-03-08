package com.usermanagement.todolist;

public interface TodoListService {

    public TodoList getAllList();

    public TodoList addList(TodoList todoList);

    public  TodoList updateList(TodoList todoList);

    public TodoList deleteList(TodoList todoList);

}

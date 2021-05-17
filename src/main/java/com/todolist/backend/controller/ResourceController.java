package com.todolist.backend.controller;

import com.todolist.backend.model.TodoList;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/backend")
public class ResourceController {
    @GetMapping("/todolist")
    public ArrayList<TodoList> getTodoList() {
        ArrayList<TodoList> todoList = new ArrayList<>();
        todoList.add(TodoList
                .builder().title("wash car").checked(false).status("ACTIVE").todoDate(1618615255648L).build());
        todoList.add(TodoList.builder().title("collect package").checked(false).status("ACTIVE").todoDate(1618615433559L).build());

        return todoList;
    }
    @GetMapping("/")
    public @ResponseBody String getDashboard() {
        return "This is a dashboard";
    }
    @GetMapping("/error")
    public @ResponseBody String getErrorPage() {
        return "This is a error page";
    }
}

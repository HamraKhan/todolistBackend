package com.todolist.backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoList {
    String title;
    boolean checked;
    String status;
    long todoDate;

}

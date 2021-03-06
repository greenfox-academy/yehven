package com.greenfoxacademy.exercise1.services;

import com.greenfoxacademy.exercise1.models.Todo;
import com.greenfoxacademy.exercise1.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceDBImp implements TodoService{

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> getAlltodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public Todo getTodo(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void modifyTitle(Todo title) {
    todoRepository.save(title);
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(int id) {
    todoRepository.delete(id);
  }
}

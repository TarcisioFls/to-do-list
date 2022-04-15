package br.com.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.todolist.entity.Task;
import br.com.todolist.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;

	public void save(Task task) {
		this.taskRepository.save(task);
		
	}
	
}

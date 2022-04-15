package br.com.todolist.service;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.todolist.entity.Task;
import br.com.todolist.enums.Status;
import br.com.todolist.repository.TaskRepository;

@SpringBootTest
public class TaskServiceTest {
	
	@InjectMocks
	TaskService taskService;
	
	@Mock
	TaskRepository taskRepository;
	
	@Test
	void saveTaskSuccess() {
		
		Task task = Task.builder()
			.name("Comprar Pão")
			.description("Ir até a padaria e comprar pão")
			.status(Status.TODO).build();
		task.setUpdatedAt(new Date());
		
		taskService.save(task);
	}

}

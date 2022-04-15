package br.com.todolist.entity;

import javax.persistence.Entity;

import br.com.todolist.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Builder

@Entity
public class Task extends BaseEntity {
	
	private String name;
	private String description;
	private Status status;

}

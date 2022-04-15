package br.com.todolist.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Fortaleza")
	@Column(name = "created_at")
	private Date createdAt;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Fortaleza")
	@Column(name = "updated_at")
	private Date updatedAt;

}

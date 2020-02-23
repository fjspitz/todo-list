package ar.com.fjs.todolist.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Task {
	private Integer id;
	private String description;
	private LocalDateTime due;
}

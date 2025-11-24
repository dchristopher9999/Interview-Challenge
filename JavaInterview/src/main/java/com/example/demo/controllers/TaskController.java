package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@GetMapping
	public ResponseEntity<List<Object>> getTasks() {
		// Placeholder: return empty list
		return ResponseEntity.ok(Collections.emptyList());
	}

	@PostMapping
	public ResponseEntity<Object> createTask() {
		// Placeholder: return the received task
		return ResponseEntity.ok(task);
	}

	@PutMapping
	public ResponseEntity<Object> updateTask() {
		// Placeholder: return the received task with id
		return ResponseEntity.ok(task);
	}
}

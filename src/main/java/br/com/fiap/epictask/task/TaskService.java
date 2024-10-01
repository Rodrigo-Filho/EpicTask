package br.com.fiap.epictask.task;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void create(Task task) {
        taskRepository.save(task);
    }

}

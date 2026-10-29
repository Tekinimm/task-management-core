package service;

import model.Priority;
import model.Task;
import model.TaskStatus;
import model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryTaskServiceImpl implements TaskService {

    private final Map<String, Task> taskDatabase = new HashMap<>();

    @Override
    public Task createTask(String title, String description, Priority priority) {
        Task newTask = new Task(title, description, priority);
        taskDatabase.put(newTask.getId(), newTask);
        return newTask;
    }

    @Override
    public void assignTask(String taskId, User user) {
        Task task = getTaskById(taskId);
        task.assignTo(user);
    }

    @Override
    public void updateTaskStatus(String taskId, TaskStatus status) {
        Task task = getTaskById(taskId);
        task.changeStatus(status);
    }

    @Override
    public List<Task> getTasksByStatus(TaskStatus status) {
        return taskDatabase.values().stream()
                .filter(task -> task.getStatus() == status)
                .collect(Collectors.toList());
    }

    private Task getTaskById(String taskId) {
        Task task = taskDatabase.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Görev bulunamadı: " + taskId);
        }
        return task;
    }
}
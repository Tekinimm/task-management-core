package service;

import model.Priority;
import model.Task;
import model.TaskStatus;
import model.User;
import java.util.List;

public interface TaskService {
    Task createTask(String title, String description, Priority priority);
    void assignTask(String taskId, User user);
    void updateTaskStatus(String taskId, TaskStatus status);
    List<Task> getTasksByStatus(TaskStatus status);
}
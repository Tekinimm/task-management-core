package model;

import java.util.Optional;

public class Task extends BaseEntity {
    private String title;
    private String description;
    private TaskStatus status;
    private Priority priority;
    private User assignee;

    public Task(String title, String description, Priority priority) {
        super();
        this.title = title;
        this.description = description;
        this.status = TaskStatus.TODO;
        this.priority = priority;
    }

    public void assignTo(User user) {
        this.assignee = user;
        updateTimestamp();
    }

    public void changeStatus(TaskStatus newStatus) {
        this.status = newStatus;
        updateTimestamp();
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public TaskStatus getStatus() { return status; }
    public Priority getPriority() { return priority; }

    public Optional<User> getAssignee() {
        return Optional.ofNullable(assignee);
    }
}
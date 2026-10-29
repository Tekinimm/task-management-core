package model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEntity {
    private final String id;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }

    protected void updateTimestamp() {
        this.updatedAt = LocalDateTime.now();
    }
}
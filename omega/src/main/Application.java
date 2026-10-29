package main;

import model.Priority;
import model.Task;
import model.TaskStatus;
import model.User;
import service.InMemoryTaskServiceImpl;
import service.TaskService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. Sistemi başlatalım (Polimorfizm)
        TaskService taskService = new InMemoryTaskServiceImpl();

        // 2. Kullanıcıları oluşturalım
        User dev = new User("ahmet", "ahmet@gmail.com");

        // 3. Görev oluşturalım
        Task task1 = taskService.createTask("API Yazılacak", "Banka API entegrasyonu", Priority.URGENT);
        System.out.println("Yeni Görev ID'si: " + task1.getId());

        // 4. Görevi atayalım ve durumunu değiştirelim
        taskService.assignTask(task1.getId(), dev);
        taskService.updateTaskStatus(task1.getId(), TaskStatus.IN_PROGRESS);

        // 5. Durumu 'IN_PROGRESS' (Yapım Aşamasında) olanları getirelim
        List<Task> activeTasks = taskService.getTasksByStatus(TaskStatus.IN_PROGRESS);

        System.out.println("--- AKTİF GÖREVLER ---");
        for (Task t : activeTasks) {
            System.out.println("Başlık: " + t.getTitle());
            System.out.println("Sahibi: " + t.getAssignee().get().getUsername());
            System.out.println("Durum: " + t.getStatus());
            System.out.println("Oluşturulma: " + t.getCreatedAt());
        }
    }
}
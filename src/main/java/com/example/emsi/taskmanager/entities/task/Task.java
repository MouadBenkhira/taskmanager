package com.example.emsi.taskmanager.entities.task;


import com.example.emsi.taskmanager.entities.material.Material;
import com.example.emsi.taskmanager.entities.member.Member;
import com.example.emsi.taskmanager.entities.notification.Notification;
import com.example.emsi.taskmanager.entities.objective.Objective;
import com.example.emsi.taskmanager.entities.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    int priority;
    List<Material>materials;
    List<Notification>notifications;
    LocalDate startDate;
    List<Member>members;
    LocalDate endDate;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;


}

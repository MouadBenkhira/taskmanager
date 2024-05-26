package com.example.emsi.taskmanager.entities.member;

import com.example.emsi.taskmanager.entities.task.Task;
import com.example.emsi.taskmanager.entities.user.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Member extends User {
private List<Task>tasks;
}

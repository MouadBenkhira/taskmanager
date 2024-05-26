package com.example.emsi.taskmanager.entities.manager;

import com.example.emsi.taskmanager.entities.material.Material;
import com.example.emsi.taskmanager.entities.project.Project;
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
public class Manager extends User {
    List<Project> projects;
    List<Material> materials;
}

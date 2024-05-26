package com.example.emsi.taskmanager.entities.material;

import com.example.emsi.taskmanager.entities.task.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Material {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long materialid;
   private List<Task>tasks;
   private String name;
   private String type;


}

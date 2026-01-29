package com.todo.Service;

import com.todo.Dto.TaskRequestDTO;
import com.todo.Dto.TaskResponseDTO;
import com.todo.Entity.Task;
import com.todo.Mapper.TaskMapper;
import com.todo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskResponseDTO create(TaskRequestDTO dto){
        Task task = TaskMapper.toEntity(dto);
        Task savedTask = taskRepository.save(task);

        return TaskMapper.toDTO(savedTask);
    }

}

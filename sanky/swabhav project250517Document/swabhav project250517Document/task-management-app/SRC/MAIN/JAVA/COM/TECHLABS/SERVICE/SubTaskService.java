package com.techlabs.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.techlabs.dao.SubTaskDao;
import com.techlabs.dao.TaskDao;
import com.techlabs.dto.SubTaskDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;

@Service
public class SubTaskService {
	@Autowired
	private SubTaskDao subtaskDao;
	@Autowired
	private TaskDao taskDao;
	List<SubTask> taskDtos = new ArrayList<SubTask>();

	public SubTaskService() {
	}

	@Transactional
	public void addSubTask(SubTaskDto subTaskDto, int task_id)
			throws ParseException {
		Task task = taskDao.getTask(task_id);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");

		SubTask subTask = new SubTask(subTaskDto.getSubTaskname(),
				dateFormatter.parse(subTaskDto.getStartDate()),
				dateFormatter.parse(subTaskDto.getEndDate()), task);
		subtaskDao.save(subTask);
	}

	@Transactional
	public void update(SubTaskDto subTaskDto) throws ParseException {
		SubTask subTask = subtaskDao.getSubTask(subTaskDto.getSubTaskno());
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		subTask.setSubtask_name(subTaskDto.getSubTaskname());
		subTask.setStartDate(dateFormatter.parse(subTaskDto.getStartDate()));
		subTask.setEndDate(dateFormatter.parse(subTaskDto.getEndDate()));
		subtaskDao.update(subTask);

	}

	@Transactional
	public void delete(int subTaskId) {
		subtaskDao.delete(subTaskId);
	}
	@Transactional
	public List<SubTaskDto> getSubTasksByTaskId(int taskId) {
		List<SubTaskDto> subTaskDtoList = new ArrayList<SubTaskDto>();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		List<SubTask> subTasks = subtaskDao.getSubTasks(taskId);
		System.out.println(subTasks);
		for (SubTask subtask : subTasks) {
			SubTaskDto subTaskdto = new SubTaskDto();
			subTaskdto.setSubTaskno(subtask.getSubtask_id());
			subTaskdto.setSubTaskname(subtask.getSubtask_name());
			subTaskdto
					.setStartDate(dateFormatter.format(subtask.getStartDate()));
			if (subtask.getEndDate() == null) {
				subTaskdto.setEndDate("0000/00/00");
			} else {
				subTaskdto
						.setEndDate(dateFormatter.format(subtask.getEndDate()));
			}
			subTaskDtoList.add(subTaskdto);
		}

		return subTaskDtoList;
	}
	@Transactional
	public SubTaskDto getSubTasksById(int subtaskId) {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		SubTask subtask = subtaskDao.getSubTask(subtaskId);
		SubTaskDto subtaskDto = new SubTaskDto();
		subtaskDto.setSubTaskno(subtask.getSubtask_id());
		subtaskDto.setSubTaskname(subtask.getSubtask_name());
		subtaskDto.setStartDate(dateFormatter.format(subtask.getStartDate()));
		subtaskDto.setEndDate(dateFormatter.format(subtask.getEndDate()));
		return subtaskDto;
	}
}

angular
		.module('taskapp')
		.service(
				'taskService',
				[
						'$http',
						function($http) {
							var generalUrl = 'http://localhost:8080/task-application/api';
							this.getSubTasks = function(taskId, callback) {
								$http(
										{
											method : 'GET',
											url : generalUrl + '/task/'
													+ taskId + '/subtasks'
										}).then(function(response) {
									callback(response);
								});
							};
							this.newSubTask = function(taskId, newSubTask,
									callback) {
								$http(
										{
											method : 'POST',
											url : generalUrl + '/task/'
													+ taskId + '/addsubtask',
											data : newSubTask
										}).then(function(response) {
									callback(response);
								});
							};

							this.updateSubTask = function(taskId, subtaskId,
									updateSubTask, callback) {
								$http(
										{
											method : 'PUT',
											url : generalUrl + '/task/'
													+ taskId
													+ '/updatesubtask/'
													+ subtaskId,
											data : updateSubTask
										}).then(function(response) {
									callback(response);
								});
							};

							this.deleteSubTask = function(taskId, subtaskId,
									callback) {
								$http(
										{
											method : 'DELETE',
											url : generalUrl + '/task/'
													+ taskId
													+ '/deletesubtask/'
													+ subtaskId
										}).then(function(response) {
									callback(response);
								});
							};

						} ]);
this.getSubTaskById = function(taskId, subtaskId, callback) {
	$http({
		method : 'GET',
		url : generalUrl + '/task/' + taskId + '/subtask/' + subtaskId
	}).then(function(response) {
		console.log(response);
		callback(response);
	});
};
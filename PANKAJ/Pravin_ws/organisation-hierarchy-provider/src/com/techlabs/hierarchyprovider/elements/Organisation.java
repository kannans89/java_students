package com.techlabs.hierarchyprovider.elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.hierarchyprovider.dto.EmployeeDTO;

public class Organisation {

	private Map<Integer, Employee> employees;
	private Employee ceo;

	public Organisation(List<EmployeeDTO> listOfDTO) {
		employees = new HashMap<Integer, Employee>();
		buildHierarchy(listOfDTO);
	}

	public Employee getCEO() {
		return ceo;
	}

	void setCEO(Employee ceo) {
		this.ceo = ceo;
	}

	void buildHierarchy(List<EmployeeDTO> listOfDTO) {
		Employee manager, reportee;

		for (EmployeeDTO empDTO : listOfDTO) {
			if (employees.containsKey(empDTO.getId())) {
				reportee = employees.get(empDTO.getId());
				reportee.setName(empDTO.getName());
				reportee.setManagerId(empDTO.getManagerId());

			} else {
				reportee = new Employee(empDTO.getId(), empDTO.getName(),
						empDTO.getManagerId());
				employees.put(reportee.getId(), reportee);
			}
			if (employees.containsKey(empDTO.getManagerId())) {
				employees.get(empDTO.getManagerId()).addReportee(reportee);

			} else {
				manager = new Employee(empDTO.getManagerId());
				employees.put(manager.getId(), manager);
				manager.addReportee(reportee);
			}
			if (empDTO.getManagerId() == -1) {
				setCEO(employees.get(empDTO.getId()));
			}
		}
	}
}
package com.techlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techlabs.entity.Employee;
import com.techlabs.hibernate.util.HibernateUtil;

public class EmployeeDao {

	public boolean addEmployee(Employee employee) {

		Session session = HibernateUtil.openSession();
		if (isEmployeeExists(employee.getEmpId()))
			return false;

		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.save(employee);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}

		return true;
	}

	public boolean isEmployeeExists(int deptId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Employee empResult = (Employee) session.get(Employee.class, deptId);
			if (empResult != null)
				result = true;
			tx.commit();
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	public List<Employee> getEmpList() {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		List<Employee> empList = new ArrayList<Employee>();
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createSQLQuery("select * from Employees")
					.addEntity(Employee.class);
			empList = query.list();
			tx.commit();

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return empList;
	}

	public boolean deleteEmployeeById(int empId) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			Employee empResult = (Employee) session.get(Employee.class, empId);

			if (empResult != null) {

				session.delete(empResult);
				result = true;
			} else
				result = false;
			tx.commit();

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	public Employee getEmployeeById(int empId) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		Employee empResult = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			empResult = (Employee) session.get(Employee.class, empId);

			tx.commit();

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return empResult;
	}

	public boolean editEmployee(Employee editEmp) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.update(editEmp);
			tx.commit();
			result = true;
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}
		return result;
	}

}

package com.techlabs.dao;

public interface IRepository<T> {

	T get(int id);

	void save(T t);

	void update(T t);

	void delete(T t);
}

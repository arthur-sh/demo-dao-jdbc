package db.model.dao;

import db.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteByID(Integer obj);
    Department findByID(Integer obj);
    List<Department> findAll();
}

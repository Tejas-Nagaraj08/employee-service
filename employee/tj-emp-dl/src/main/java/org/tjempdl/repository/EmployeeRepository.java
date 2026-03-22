package org.tjempdl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tjempdl.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}

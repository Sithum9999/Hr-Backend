package org.icet.learn.repository;

import org.icet.learn.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeEntity,Long> {
    boolean existsByEmail(String email);
}

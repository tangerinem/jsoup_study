package com.springboot.database.data.repository;

import com.springboot.database.data.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}

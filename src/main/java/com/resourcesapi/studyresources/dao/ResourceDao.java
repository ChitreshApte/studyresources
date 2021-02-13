package com.resourcesapi.studyresources.dao;

import com.resourcesapi.studyresources.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceDao extends JpaRepository<Resource, Long> {
}

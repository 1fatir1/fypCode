package com.api.cpms.dao;

import com.api.cpms.entities.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags,Integer> {
}

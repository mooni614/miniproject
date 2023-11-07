package com.miniproject.mytowncafe.cafemap.repository;

import com.miniproject.mytowncafe.cafemap.model.entity.CateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CateRepository extends JpaRepository<CateEntity, Long> {
}

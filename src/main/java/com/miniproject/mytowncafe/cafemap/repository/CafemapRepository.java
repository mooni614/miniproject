package com.miniproject.mytowncafe.cafemap.repository;


import com.miniproject.mytowncafe.cafemap.model.entity.CafemapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafemapRepository extends JpaRepository<CafemapEntity, Long> {
}

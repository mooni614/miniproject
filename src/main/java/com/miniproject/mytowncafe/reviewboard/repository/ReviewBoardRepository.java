package com.miniproject.mytowncafe.reviewboard.repository;


import com.miniproject.mytowncafe.reviewboard.model.Entity.ReviewBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewBoardRepository extends JpaRepository<ReviewBoardEntity, Long> {
}

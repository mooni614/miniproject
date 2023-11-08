package com.miniproject.mytowncafe.reviewboard.repository;


import com.miniproject.mytowncafe.reviewboard.model.Entity.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {
}

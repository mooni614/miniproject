package com.miniproject.mytowncafe.reviewboard.model.dto;


import com.miniproject.mytowncafe.reviewboard.model.Entity.ReviewBoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewBoardDTO {


    private Long review_id;
    private String review_title;
    private String review_content;
    private String review_picture;
    private LocalDateTime review_date;
    private double review_count;
    private Long user_id;
    private int review_grade;
    private String review_hashtag;


    public static ReviewBoardDTO fromEntity(ReviewBoardEntity entity) {

        return new ReviewBoardDTO(
                entity.getReview_id(),
                entity.getReview_title(),
                entity.getReview_content(),
                entity.getReview_picture(),
                entity.getReview_date(),
                entity.getReview_count(),
                entity.getUser_id(),
                entity.getReview_grade(),
                entity.getReview_hashtag()
        );

    }
}

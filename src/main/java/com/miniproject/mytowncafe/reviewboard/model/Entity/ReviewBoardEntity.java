package com.miniproject.mytowncafe.reviewboard.model.Entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReviewBoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="review_id")
    private Long review_id;
    @Column
    private String review_title;
    @Column
    private String review_content;
    @Column
    private String review_picture;
    @Column
    private LocalDateTime review_date;
    @Column
    private double review_count;
    @Column
    private Long user_id;
    @Column
    private int review_grade;
    @Column
    private String review_hashtag;

}

package com.miniproject.mytowncafe.reviewboard.model.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReplyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reply_id")
    private Long reply_id;

    @Column
    private String reply_content;


    @Column
    private LocalDateTime reply_date;

    @Column
    @JoinColumn(name = "user_id")
    private Long user_id;

    @Column
    @JoinColumn(name = "review_id")
    private Long review_id;

}

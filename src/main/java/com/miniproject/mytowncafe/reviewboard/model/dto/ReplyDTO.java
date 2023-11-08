package com.miniproject.mytowncafe.reviewboard.model.dto;


import com.miniproject.mytowncafe.reviewboard.model.Entity.ReplyEntity;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {

    private Long reply_id;
    private String reply_content;
    private LocalDateTime reply_date;
    private Long user_id;
    private Long review_id;


    public static ReplyDTO fromEntity(ReplyEntity entity){

        return new ReplyDTO(
                entity.getReply_id(),
                entity.getReply_content(),
                entity.getReply_date(),
                entity.getUser_id(),
                entity.getReview_id()

        );

    }

}

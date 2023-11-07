package com.miniproject.mytowncafe.cafemap.model.dto;


import com.miniproject.mytowncafe.cafemap.model.entity.CateEntity;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CateDTO {

    private Long cate_id;
    private String cate_name;
    private Long user_id;


    public static CateDTO fromEntity(CateEntity entity){

        return new CateDTO(

                entity.getCate_id(),
                entity.getCate_name(),
                entity.getUser_id()

        );

    }

}

package com.miniproject.mytowncafe.cafemap.model.dto;


import com.miniproject.mytowncafe.cafemap.model.entity.CafemapEntity;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CafemapDTO {

    private Long bm_id;
    private String bm_storename;
    private String bm_memo;
    private Long user_id;
    private String bm_address;
    private double bmx;
    private double bmy;
    private Long cate_id;


    public static CafemapDTO fromEntity(CafemapEntity entity) {

        return new CafemapDTO(

                entity.getBm_id(),
                entity.getBm_storename(),
                entity.getBm_memo(),
                entity.getUser_id(),
                entity.getBm_address(),
                entity.getBmx(),
                entity.getBmy(),
                entity.getCate_id()

        );


    }


}
package com.miniproject.mytowncafe.cafemap.model.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CafemapEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bm_id")
    private Long bm_id;
    @Column
    private String bm_storename;
    @Column
    private String bm_memo;
    @Column
    @JoinColumn(name = "user_id")
    private Long user_id;
    @Column
    private String bm_address;
    @Column
    private double bmx;
    @Column
    private double bmy;
    @Column
    @JoinColumn(name = "cate_id")
    private Long cate_id;
}

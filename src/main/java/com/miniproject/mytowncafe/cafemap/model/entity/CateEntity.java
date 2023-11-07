package com.miniproject.mytowncafe.cafemap.model.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CateEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cate_id")
    private Long cate_id;
    @Column
    private String cate_name;
    @Column
    private Long user_id;
}

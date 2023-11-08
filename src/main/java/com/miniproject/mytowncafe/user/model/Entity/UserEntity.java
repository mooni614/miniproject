package com.miniproject.mytowncafe.user.model.Entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long user_id;
    @Column
    private String id;
    @Column
    private String user_name;
    @Column
    private String user_password;
    @Column
    private String user_gender;
    @Column
    private String user_phone;
    @Column
    private String user_email;


}

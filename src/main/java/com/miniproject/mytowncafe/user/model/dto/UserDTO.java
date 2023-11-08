package com.miniproject.mytowncafe.user.model.dto;


import com.miniproject.mytowncafe.user.model.Entity.UserEntity;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private Long user_id;
    private String id;
    private String user_name;
    private String user_password;
    private String user_gender;
    private String user_phone;
    private String user_email;


    public static UserDTO fromEntity(UserEntity entity){

        return new UserDTO(
                entity.getUser_id(),
                entity.getId(),
                entity.getUser_name(),
                entity.getUser_password(),
                entity.getUser_gender(),
                entity.getUser_phone(),
                entity.getUser_email()

        );
    }
}

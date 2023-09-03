package com.liukai.mvc.pojo;

import lombok.*;

/**
 * @author liukai
 * @version 1.0
 * @date 2023/9/3 12:20
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Integer id;
    private String username;
    private String password;
    private String sex;
    private String age;
    private String email;


}

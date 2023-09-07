package com.liukai.mvc.pojo;

import lombok.*;

/**
 * @Author：liukai
 * @Date：2023/9/6 10:18
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
}

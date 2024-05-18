package com.springboot.database.data.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class RequestBabyLionDto {
    private String name;
    private String email;
    private String number;
    private String password;
    private String profile;
}

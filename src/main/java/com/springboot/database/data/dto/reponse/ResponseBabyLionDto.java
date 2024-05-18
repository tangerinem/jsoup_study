package com.springboot.database.data.dto.reponse;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class ResponseBabyLionDto {
    private Long pid;
    private String name;
    private String email;
    private String number;
    private String password;
    private String profile;
}

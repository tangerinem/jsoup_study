package com.springboot.database.data.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class ChangeNameRequestDto {
    private String email;
    public String name;
}

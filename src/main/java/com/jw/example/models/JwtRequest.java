package com.jw.example.models;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtRequest {
    private String email;
    private String password;

}

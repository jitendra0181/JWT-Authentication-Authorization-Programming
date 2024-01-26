package com.jw.example.models;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {
    private String username;
    private String jwtToken;

}

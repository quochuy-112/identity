package com.example.demo.dto.response;

import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldNameConstants(level = AccessLevel.PRIVATE)
public class UserRespone {
    String userId;
    String userName;
    String password;
    String firstName;
    String lastName;
    LocalDate birthDate;
}

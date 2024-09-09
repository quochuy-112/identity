package com.example.demo.mapper;

import com.example.demo.dto.response.UserRespone;
import com.example.demo.dto.resquest.UserCreationRequest;
import com.example.demo.dto.resquest.UserUpdateRequest;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserRespone toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

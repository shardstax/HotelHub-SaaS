package com.shardx.hotelManagement.airBnb.service;

import com.shardx.hotelManagement.airBnb.dto.ProfileUpdateRequestDto;
import com.shardx.hotelManagement.airBnb.dto.UserDto;
import com.shardx.hotelManagement.airBnb.entity.User;

public interface UserService {
    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}

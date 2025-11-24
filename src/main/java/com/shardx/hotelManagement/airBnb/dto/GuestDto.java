package com.shardx.hotelManagement.airBnb.dto;

import com.shardx.hotelManagement.airBnb.entity.User;
import com.shardx.hotelManagement.airBnb.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}

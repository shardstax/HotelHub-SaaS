package com.shardx.hotelManagement.airBnb.util;

import com.shardx.hotelManagement.airBnb.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class AppUtils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}

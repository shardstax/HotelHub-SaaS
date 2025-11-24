package com.shardx.hotelManagement.airBnb.repository;

import com.shardx.hotelManagement.airBnb.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}

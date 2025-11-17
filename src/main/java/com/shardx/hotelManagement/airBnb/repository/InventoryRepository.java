package com.shardx.hotelManagement.airBnb.repository;

import com.shardx.hotelManagement.airBnb.entity.Inventory;
import com.shardx.hotelManagement.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    void deleteByRoom(Room room);
}

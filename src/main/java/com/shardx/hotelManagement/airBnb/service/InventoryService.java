package com.shardx.hotelManagement.airBnb.service;

import com.shardx.hotelManagement.airBnb.dto.HotelDto;
import com.shardx.hotelManagement.airBnb.dto.HotelPriceDto;
import com.shardx.hotelManagement.airBnb.dto.HotelSearchRequest;
import com.shardx.hotelManagement.airBnb.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}

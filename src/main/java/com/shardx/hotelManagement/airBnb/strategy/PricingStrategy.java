package com.shardx.hotelManagement.airBnb.strategy;

import com.shardx.hotelManagement.airBnb.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}

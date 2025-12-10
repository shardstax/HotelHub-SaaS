package com.shardx.hotelManagement.airBnb.strategy;

import com.shardx.hotelManagement.airBnb.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();
    }
}

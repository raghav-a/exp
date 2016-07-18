package com.auto;

public interface BillableItem {
    public Price cost();

    public Integer quantityUsed();
}

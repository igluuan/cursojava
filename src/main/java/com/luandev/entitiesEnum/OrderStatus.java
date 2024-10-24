package com.luandev.entitiesEnum;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private int status;

    OrderStatus(int status) {
    }

    public int getStatus() {
        return status;
    }
}


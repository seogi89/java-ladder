package com.application.dto;

public class HeightRequestView {

    private final int height;

    public HeightRequestView(int height) {
        this.height = height;
    }

    public HeightRequestView(String height) {
        this(Integer.valueOf(height));
    }

    public int getHeight() {
        return height;
    }
}

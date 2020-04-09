package com.mailBox;

public class Box3 {
    float length = 23;
    float width = 14;
    int height = 13;

    public boolean validate(float length, float width, int height) {
        return this.length < width || this.width < width || this.height < height ? false:true;
    }
}

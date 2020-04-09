package com.mailBox;

public class Box5 {
    float length = 39.5f;
    float width = 27.5f;
    int height = 23;

    public boolean validate(float length, float width, int height) {
            return this.length < width || this.width < width || this.height < height ? false:true;
    }
}

package com.example.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Product {
    private int id;
    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String name;
    @Length(min = 0, max = 50, message = "Tên ảnh không quá 50 ký tự")
    private String image;
    @NotNull(message = "Giá sản phẩm không được để trống")
    @Min(value = 1, message = "Giá không được nhỏ hơn 1")
    @Max(value = 999999999, message = "Giá không được lớn hơn 999999999")
    private long price;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Product() {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public Product(int id, String name, String image, long price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

}


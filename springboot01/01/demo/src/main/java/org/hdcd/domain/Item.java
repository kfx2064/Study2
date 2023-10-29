package org.hdcd.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Item implements Serializable {

    private static final long serialVersionUID = -7171819535329599881L;

    private Integer itemId;

    private String itemName;

    private Integer price;

    private String description;

    private MultipartFile picture;

    private String pictureUrl;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public void setPicture(MultipartFile picture) {
        this.picture = picture;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", picture=" + picture +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}

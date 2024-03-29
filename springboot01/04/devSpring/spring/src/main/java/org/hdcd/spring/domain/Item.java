package org.hdcd.spring.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Item implements Serializable {

    private static final long serialVersionUID = -8017458064904909440L;

    private Integer itemId;

    private String itemName;

    private Integer price;

    private String description;

    private MultipartFile picture;

    private String pictureUrl;

    private MultipartFile preview;

    private String previewUrl;

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

    public MultipartFile getPreview() {
        return preview;
    }

    public void setPreview(MultipartFile preview) {
        this.preview = preview;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
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
                ", preview=" + preview +
                ", previewUrl='" + previewUrl + '\'' +
                '}';
    }
}

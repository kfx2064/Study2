package org.hdcd.prj.domain;

import java.io.Serializable;
import java.util.Date;

public class UserItem implements Serializable {

    private static final long serialVersionUID = -2400003757844137528L;

    private int userItemNo;
    private int userNo;

    private int itemId;
    private String itemName;
    private Integer price;
    private String description;
    private String pictureUrl;

    private Date regDate;

    public int getUserItemNo() {
        return userItemNo;
    }

    public void setUserItemNo(int userItemNo) {
        this.userItemNo = userItemNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "UserItem{" +
                "userItemNo=" + userItemNo +
                ", userNo=" + userNo +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}

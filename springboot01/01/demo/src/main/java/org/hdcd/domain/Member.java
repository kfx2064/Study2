package org.hdcd.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Member implements Serializable {

    private static final long serialVersionUID = -8850847423161672356L;

    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private Date regDate;
    private Date updDate;

    private String auth;

    private String password;
    private String email;
    private String birthDay;
    private Date dateOfBirth;
    private Address address;

    private List<Card> cardList;

    private String gender;
    private String developer;
    private boolean foreigner;
    private String nationality;
    private String cars;
    private String[] carArray;
    private String hobby;
    private String[] hobbyArray;
    private List<String> hobbyList;
    private List<String> carList;
    private String introduction;
    private List<MemberAuth> authList;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isForeigner() {
        return foreigner;
    }

    public void setForeigner(boolean foreigner) {
        this.foreigner = foreigner;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String[] getCarArray() {
        return carArray;
    }

    public void setCarArray(String[] carArray) {
        this.carArray = carArray;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String[] getHobbyArray() {
        return hobbyArray;
    }

    public void setHobbyArray(String[] hobbyArray) {
        this.hobbyArray = hobbyArray;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public List<String> getCarList() {
        return carList;
    }

    public void setCarList(List<String> carList) {
        this.carList = carList;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<MemberAuth> getAuthList() {
        return authList;
    }

    public void setAuthList(List<MemberAuth> authList) {
        this.authList = authList;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", regDate=" + regDate +
                ", updDate=" + updDate +
                ", auth='" + auth + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", cardList=" + cardList +
                ", gender='" + gender + '\'' +
                ", developer='" + developer + '\'' +
                ", foreigner=" + foreigner +
                ", nationality='" + nationality + '\'' +
                ", cars='" + cars + '\'' +
                ", carArray=" + Arrays.toString(carArray) +
                ", hobby='" + hobby + '\'' +
                ", hobbyArray=" + Arrays.toString(hobbyArray) +
                ", hobbyList=" + hobbyList +
                ", carList=" + carList +
                ", introduction='" + introduction + '\'' +
                ", authList=" + authList +
                '}';
    }
}

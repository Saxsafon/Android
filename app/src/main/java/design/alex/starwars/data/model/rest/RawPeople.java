package design.alex.starwars.data.model.rest;

import com.google.gson.annotations.SerializedName;

public class RawPeople {

    @SerializedName("name")
    private String mName;

    @SerializedName("height")
    private String mHeight;

    @SerializedName("mass")
    private String mMass;

    @SerializedName("hair_color")
    private String mHairColor;

    @SerializedName("skin_color")
    private String mSkinColor;

    @SerializedName("eye_color")
    private String mEyeColor;

    @SerializedName("birth_year")
    private String mBirthYear;

    @SerializedName("gender")
    private String mGender;

    @SerializedName("homeworld")
    private String mHoumeWorld;

    @SerializedName("url")
    private String mUrl;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getHeight() {
        return mHeight;
    }

    public void setHeight(String height) {
        mHeight = height;
    }

    public String getMass() {
        return mMass;
    }

    public void setMass(String mass) {
        mMass = mass;
    }

    public String getHairColor() {
        return mHairColor;
    }

    public void setHairColor(String hairColor) {
        mHairColor = hairColor;
    }

    public String getSkinColor() {
        return mSkinColor;
    }

    public void setSkinColor(String skinColor) {
        mSkinColor = skinColor;
    }

    public String getEyeColor() {
        return mEyeColor;
    }

    public void setEyeColor(String eyeColor) {
        mEyeColor = eyeColor;
    }

    public String getBirthYear() {
        return mBirthYear;
    }

    public void setBirthYear(String birthYear) {
        mBirthYear = birthYear;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getHoumeWorld() {
        return mHoumeWorld;
    }

    public void setHoumeWorld(String houmeWorld) {
        mHoumeWorld = houmeWorld;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}



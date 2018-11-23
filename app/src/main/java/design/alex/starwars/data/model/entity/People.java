package design.alex.starwars.data.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "peoples", indices = { @Index("id")})
public class People {

    @PrimaryKey
    @ColumnInfo(name = "id")
    public long mId;

    @ColumnInfo(name = "name")
    public String mName;

    @ColumnInfo(name = "height")
    public Integer mHeight;

    @ColumnInfo(name = "mass")
    public Integer mMass;

    @ColumnInfo(name = "hair_color")
    private String mHairColor;

    @ColumnInfo(name = "skin_color")
    private String mSkinColor;

    @ColumnInfo(name = "eye_color")
    private String mEyeColor;

    @ColumnInfo(name = "birth_year")
    private String mBirthYear;

    @ColumnInfo(name = "gender")
    private String mGender;

    @ColumnInfo(name = "homeworld")
    private String mHomeWorld;

    @ColumnInfo(name = "imageUrl")
    private String mImageUrl;

    public People() { }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Integer getHeight() {
        return mHeight;
    }

    public void setHeight(Integer height) {
        mHeight = height;
    }

    public Integer getMass() {
        return mMass;
    }

    public void setMass(Integer mass) {
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

    public String getHomeWorld() {
        return mHomeWorld;
    }

    public void setHomeWorld(String homeWorld) {
        mHomeWorld = homeWorld;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public static class Empty extends People { }
}

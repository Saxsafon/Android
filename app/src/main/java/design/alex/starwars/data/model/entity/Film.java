package design.alex.starwars.data.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "films", indices = @Index({"people_id"}), foreignKeys = @ForeignKey(
        entity = People.class,
        parentColumns = "id",
        childColumns = "people_id",
        onDelete = CASCADE
))
public class Film {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private long mId;

    @ColumnInfo(name = "people_id")
    private long mPeopleId;

    public Film() {

    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public long getPeopleId() {
        return mPeopleId;
    }

    public void setPeopleId(long peopleId) {
        mPeopleId = peopleId;
    }
}

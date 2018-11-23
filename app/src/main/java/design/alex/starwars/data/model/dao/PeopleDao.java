package design.alex.starwars.data.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import design.alex.starwars.data.model.entity.People;
import io.reactivex.Single;

@Dao
public interface PeopleDao {

    @Query("SELECT * FROM peoples")
    List<People> getAllPeoples();

    @Query("SELECT * FROM peoples WHERE id = :id")
    Single<People> getPeople(Long id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(People people);

}

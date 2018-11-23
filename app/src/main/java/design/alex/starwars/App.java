package design.alex.starwars;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import design.alex.starwars.rest.RestApiPeoples;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    // Сервис для получения персонажей
    private RestApiPeoples mPeopleRestService;

    private static AppDatabase mAppDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        buildRest();
        buildDb();
        Log.d("TAG", "onCreateApplication");

    }

    private void buildDb() {
        mAppDatabase = Room
                .databaseBuilder(getApplicationContext(), AppDatabase.class, "star-wars")
                .build();
    }

    private void buildRest() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://swapi.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        mPeopleRestService = retrofit.create(RestApiPeoples.class);
    }

    public RestApiPeoples getPeopleRestService() {
        return mPeopleRestService;
    }

    public static AppDatabase getAppDatabase() {
        return mAppDatabase;
    }
}

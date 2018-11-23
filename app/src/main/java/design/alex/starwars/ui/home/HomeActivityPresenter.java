package design.alex.starwars.ui.home;

import design.alex.starwars.data.model.entity.People;

public interface HomeActivityPresenter {

    void setView(HomeActivity view);

    void fetchData();

    void onCreate();

    void onClickPeople(People people);
}

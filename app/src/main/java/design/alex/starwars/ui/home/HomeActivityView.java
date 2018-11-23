package design.alex.starwars.ui.home;

public interface HomeActivityView {
    void showContent();

    void showProgress();

    void ShowConrent();

    void showError();

    void showLoader();

    void hideLoader();

    void openCardActivity(long id);
}

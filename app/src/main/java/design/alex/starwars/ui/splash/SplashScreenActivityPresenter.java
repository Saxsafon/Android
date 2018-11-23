package design.alex.starwars.ui.splash;

public interface SplashScreenActivityPresenter {
    // Обработка запуска активити
    void onCreate();
    // Обработка остановки анимации
    void onStopAnimation();

    void setView(SplashScreenActivity view);
}

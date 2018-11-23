package design.alex.starwars.ui.splash;

public class SplashScreenActivityPresenterImpl implements SplashScreenActivityPresenter {

    private SplashScreenActivityView mView;

    public void setmView(SplashScreenActivityView view){
        mView = view;
    }

    @Override
    public void onCreate() {
        validate();
        mView.onStartHomeActinity();
    }

    @Override
    public void onStopAnimation() {
        validate();
        mView.onStartHomeActinity();
    }

    @Override
    public void setView(SplashScreenActivity view) {

    }

    private void validate() {
        if (mView == null) {
            throw new IllegalStateException("Не указана View");
        }
    }
}

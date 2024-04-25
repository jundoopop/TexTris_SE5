package org.Stech.SE5;

import org.Stech.SE5.config.ConfigModel;
import org.Stech.SE5.presenter.ConfigPresenter;
import org.Stech.SE5.presenter.Presenter;

public class App {


    public enum View {
        CONFIG
    }

    protected App() {
        throw new UnsupportedOperationException();
    }

    public static void main(final String[] args) {
//            RecordModel.loadRecord();
        ConfigModel.loadConfig();

        ConfigPresenter configPresenter = new ConfigPresenter();

        // Set
        Presenter currentPresenter = configPresenter;
        currentPresenter.setVisible(true);
    }

//    public static void navigate(final View view) {
//        currentPresenter.setVisible(false);
//        switch (view) {
//            // case MAIN -> currentPresenter = mainPresenter;
//            // case GAME -> currentPresenter = gamePresenter;
//            case CONFIG -> currentPresenter = configPresenter;
//            // case RECORD -> currentPresenter = recordPresenter;
//            // case BATTLE -> currentPresenter = battlePresenter;
//        }
//        currentPresenter.initPresent();
//        currentPresenter.setVisible(true);
//    }
}

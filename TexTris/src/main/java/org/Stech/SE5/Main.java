package org.Stech.SE5;

import org.Stech.SE5.Model.ConfigModel;
import org.Stech.SE5.Controller.ConfigController;
import org.Stech.SE5.Controller.Controller;

public class Main {


    public enum View {
        CONFIG
    }

    protected Main() {
        throw new UnsupportedOperationException();
    }

    public static void main(final String[] args) {
//            RecordModel.loadRecord();
        ConfigModel.loadConfig();

        ConfigController configController = new ConfigController();

        // Set
        Controller currentController = configController;
        currentController.setVisible(true);
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

package org.Stech.SE5.presenter;

import org.Stech.SE5.view.ConfigView;


public class ConfigPresenter implements Presenter {
    private ConfigView configView;

    public ConfigPresenter() {
        initPresent();
    }

    @Override
    public void initPresent() {
        configView = new ConfigView(this);
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            int VIEW_WIDTH = 400;
            int VIEW_HEIGHT = 600;
            configView.setSize(VIEW_WIDTH, VIEW_HEIGHT);
            configView.setLocationRelativeTo(null);
            configView.setVisible(true);
        } else {
            configView.setVisible(false);
        }
    }
}

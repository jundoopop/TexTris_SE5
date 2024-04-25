package org.Stech.SE5.config;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

import static org.Stech.SE5.config.KeySetting.keyBinding;

public class SetConfig {
    public static void saveConfig() {
        BufferedWriter out = null;
        List<String> strList = new ArrayList<>();
        for (Integer integer : keyBinding) {
            strList.add(String.valueOf(integer));
        }
    }
}

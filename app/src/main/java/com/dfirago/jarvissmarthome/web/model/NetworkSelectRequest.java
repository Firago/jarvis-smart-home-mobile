package com.dfirago.jarvissmarthome.web.model;

/**
 * Created by dmfi on 05/01/2017.
 */
public class NetworkSelectRequest {

    private String ssid;
    private String password;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

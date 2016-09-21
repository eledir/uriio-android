package com.uriio.api.model;

import android.text.format.Time;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ShortUrl {
    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    @SerializedName("created")
    private String created;

    @SerializedName("expire")
    private String expire;

    public String getUrl() {
        return url;
    }

    public Date getExpire() {
        if (null != expire) {
            Time time = new Time();
            if (time.parse3339(expire)) {
                return new Date(time.toMillis(true));
            }
        }
        return null;
    }
}

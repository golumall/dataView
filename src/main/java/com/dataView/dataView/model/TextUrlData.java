package com.dataView.dataView.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="url_data")
public class TextUrlData {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "url")
    private String url;

    @Column(name = "response_data")
    private Blob response_data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Blob getResponse_data() {
        return response_data;
    }

    public void setResponse_data(Blob response_data) {
        this.response_data = response_data;
    }
}

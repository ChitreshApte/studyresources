package com.resourcesapi.studyresources.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resource {

    @Id
    private long id;
    private String name;
    private String type;
    private String url;
    private String description;

    public Resource() {
        super();
    }

    public Resource(long id, String name, String type, String url, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.url = url;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

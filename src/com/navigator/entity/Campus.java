package com.navigator.entity;

public class Campus {
    private Integer campusId;
    private String name;

    public Campus(Integer campusId, String name) {
        this.campusId = campusId;
        this.name = name;
    }

    public Integer getCampusId() {
        return campusId;
    }

    public String getName() {
        return name;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

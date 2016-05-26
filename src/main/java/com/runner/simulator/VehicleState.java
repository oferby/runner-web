package com.runner.simulator;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by Ofer Ben-Yacov (oWX212574) on 5/26/2016.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum VehicleState {

    IN_SERVICE(1,"In Service"), OUT_OF_SERVICE(2,"Out Of Service");

    private int id;
    private String name;

    VehicleState(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

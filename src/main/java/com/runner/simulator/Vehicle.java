package com.runner.simulator;

/**
 * Created by Ofer Ben-Yacov (oWX212574) on 5/26/2016.
 */
public class Vehicle {

    private String uuid;
    private VehicleType type;
    private double lat;
    private double lon;
    private VehicleState state;

    public Vehicle() {
    }

    public String getUuid() {
        return uuid;
    }

    public Vehicle setUuid(String  uuid) {
        this.uuid = uuid;
        return this;
    }

    public VehicleType getType() {
        return type;
    }

    public Vehicle setType(VehicleType type) {
        this.type = type;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public Vehicle setLat(double lat) {
        this.lat = lat;
        return this;
    }

    public double getLon() {
        return lon;
    }

    public Vehicle setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public VehicleState getState() {
        return state;
    }

    public Vehicle setState(VehicleState state) {
        this.state = state;
        return this;
    }

}

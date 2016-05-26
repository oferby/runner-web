package com.runner.simulator;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by Ofer Ben-Yacov (oWX212574) on 5/26/2016.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum VehicleType {

   BICYCLE(1,"Bicycle"),MOTORCYCLE(2,"Motorcycle"), CAR(3,"Car"), VAN(4,"Van"), TRUCK(5,"Truck");

   private int id;
   private String name;

   VehicleType(int id, String name) {
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

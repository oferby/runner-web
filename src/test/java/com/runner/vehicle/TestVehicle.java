package com.runner.vehicle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.runner.simulator.Vehicle;
import com.runner.simulator.VehicleState;
import com.runner.simulator.VehicleType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.UUID;

/**
 * Created by Ofer Ben-Yacov (oWX212574) on 5/26/2016.
 */
@RunWith(JUnit4.class)
public class TestVehicle {


    @Test
    public void testServer() throws FileNotFoundException, InterruptedException {
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setServiceAccount(new FileInputStream("d:/downloads/test1-7295c69ecf4c.json"))
                .setDatabaseUrl("https://test1-3a14d.firebaseio.com/")
                .build();
        FirebaseApp.initializeApp(options);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("vehicles");

        for (int i = 0; i < 10; i++) {

            Vehicle vehicle = createSingle();

            DatabaseReference vehicleRef = ref.child(vehicle.getUuid());
            vehicleRef.setValue(vehicle);

        }


        Thread.sleep(60000);

    }

    private Vehicle createSingle(){

        return new Vehicle().setUuid(UUID.randomUUID().toString())
                .setState(VehicleState.IN_SERVICE)
                .setType(VehicleType.CAR)
                .setLon(34.898974)
                .setLat(32.132561);

    }

}

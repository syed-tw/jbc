package com.tw.jbc.module1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CabRides {
    private List cabRides = Arrays.asList();

    public CabRides(){

    }

    public CabRides(List cabRides){

        this.cabRides = cabRides;
    }

    public int aggregateFare() {
        //this.cabRides = cabRides;
        int totalFare = 0;
        for (Object object : cabRides) {
            CabRide cabRide = (CabRide)object;
            totalFare = totalFare + cabRide.fare();
        }
        return totalFare;
    }

    public Object getInvoice() {
        //int totalFare= aggregateFare();
        return new CabRideInvoice(100);
    }

//    public int aggregateFareNew() {
//        int totalFare = aggregateFare(cabRides);
//        return totalFare;
//    }


}

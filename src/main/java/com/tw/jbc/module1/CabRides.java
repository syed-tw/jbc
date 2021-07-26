package com.tw.jbc.module1;

import java.util.List;

public class CabRides {
    //private List cabRides = null;

//   // public int aggregateFare(int firstRide, int secondRide) {
//        return firstRide+secondRide;
//    }//

    public int aggregateFare(List cabRides) {
        //this.cabRides = cabRides;
        int totalFare = 0;
        for (Object object : cabRides) {
            CabRide cabRide = (CabRide)object;
            totalFare = totalFare + cabRide.fare();
        }
        return totalFare;
    }

}

package com.tw.jbc.module1;

public class CabRideInvoice {
    public int getAggregateFare() {
        return aggregateFare;
    }

    public void setAggregateFare(int aggregateFare) {
        this.aggregateFare = aggregateFare;
    }

    private int aggregateFare = 0;

    public CabRideInvoice(int aggregateFare) {
        this.aggregateFare=aggregateFare;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof CabRideInvoice))
            return false;
        if (obj == this)
            return true;
        return this.getAggregateFare() == ((CabRideInvoice) obj).getAggregateFare();
    }


}

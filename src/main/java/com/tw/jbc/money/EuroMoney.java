package com.tw.jbc.money;

public class EuroMoney {
    private final int value;

    public EuroMoney(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EuroMoney other = (EuroMoney) obj;
        if (value == 0) {
            if (other.value != 0)
                return false;
        } else if (!(value == other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        return this.value;
    }


    public EuroMoney add(EuroMoney twoEuroMoney) {
        return new EuroMoney(value + twoEuroMoney.value );
    }
}

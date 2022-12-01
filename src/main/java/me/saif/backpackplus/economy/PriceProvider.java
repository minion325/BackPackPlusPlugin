package me.saif.backpackplus.economy;

public abstract class PriceProvider {

    /**
     *
     * @param slot This is not zero indexed. Slots start at 1
     * @return Price of the slot
     */
    public abstract double getPrice(int slot);

}

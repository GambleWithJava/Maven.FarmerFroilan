package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle<Pilot> {
    public CropDuster(String generic) {
        super(generic);
    }


    public static boolean isFertilizing() {
   return true; }


    public boolean ride() {
        return false;
    }


    public boolean canMount() {
        return false;
    }
}

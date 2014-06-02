package main;

import garage.Garage;
import view.GarageFrame;
import view.GarageFrameException;

public class GarageApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Garage garage = new Garage("E:\\Développement\\Projets WIP\\Java dev\\GarageGUI\\cars.txt", "E:\\Développement\\Projets WIP\\Java dev\\GarageGUI\\vendors.txt");
        GarageFrame frame = null;
        
        try {
            frame = new GarageFrame(garage);
        } catch (GarageFrameException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

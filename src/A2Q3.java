
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv_000
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, -4, 4, Direction.NORTH);

        while (karel.getStreet() > 0) {
            if (karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
            }
            if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            if (karel.getDirection() == Direction.SOUTH) {
                karel.turnLeft();
                karel.turnLeft();
            }
            karel.move();
            if (karel.getStreet() == 0 && karel.getAvenue() > 0) {
                karel.turnLeft();
            }
            if (karel.getStreet() == 0 && karel.getAvenue() < 0) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            while (karel.getStreet() == 0 && karel.getAvenue() != 0) {
                karel.move();
            }
        }
        while (karel.getStreet() < 0) {
            if (karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
            }
            if (karel.getDirection() == Direction.NORTH) {
                karel.turnLeft();
                karel.turnLeft();
            }
            karel.move();
            if (karel.getStreet() == 0 && karel.getAvenue() > 0) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            if (karel.getStreet() == 0 && karel.getAvenue() < 0) {
                karel.turnLeft();
            }
            while (karel.getStreet() == 0 && karel.getAvenue() != 0) {
                karel.move();
            }
        }
    }

}

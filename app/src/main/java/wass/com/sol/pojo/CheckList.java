package wass.com.sol.pojo;

import wass.com.sol.pojo.cleaning.Doors;
import wass.com.sol.pojo.cleaning.Drainage;
import wass.com.sol.pojo.cleaning.Extractors;
import wass.com.sol.pojo.cleaning.Floors;
import wass.com.sol.pojo.cleaning.HandWashingStation;
import wass.com.sol.pojo.cleaning.Luminaires;
import wass.com.sol.pojo.cleaning.Sanitation;
import wass.com.sol.pojo.cleaning.Walls;
import wass.com.sol.pojo.cleaning.WindowsVentilationBlocks;

/**
 * Created by Lasar-Soporte on 23/1/2017.
 */

public class CheckList {

    private int idCheckList = -1;

    // cleaning
    private Doors doors = new Doors();
    private Drainage drainage = new Drainage();
    private Extractors extractors = new Extractors();
    private Floors floors = new Floors();
    private HandWashingStation handWashingStation = new HandWashingStation();
    private Luminaires luminaires = new Luminaires();
    private Sanitation sanitation = new Sanitation();
    private Walls walls = new Walls();
    private WindowsVentilationBlocks windowsVentilationBlocks = new WindowsVentilationBlocks();

    public int getIdCheckList() {
        return idCheckList;
    }

    public void setIdCheckList(int idCheckList) {
        this.idCheckList = idCheckList;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Drainage getDrainage() {
        return drainage;
    }

    public void setDrainage(Drainage drainage) {
        this.drainage = drainage;
    }

    public Extractors getExtractors() {
        return extractors;
    }

    public void setExtractors(Extractors extractors) {
        this.extractors = extractors;
    }

    public Floors getFloors() {
        return floors;
    }

    public void setFloors(Floors floors) {
        this.floors = floors;
    }

    public HandWashingStation getHandWashingStation() {
        return handWashingStation;
    }

    public void setHandWashingStation(HandWashingStation handWashingStation) {
        this.handWashingStation = handWashingStation;
    }

    public Luminaires getLuminaires() {
        return luminaires;
    }

    public void setLuminaires(Luminaires luminaires) {
        this.luminaires = luminaires;
    }

    public Sanitation getSanitation() {
        return sanitation;
    }

    public void setSanitation(Sanitation sanitation) {
        this.sanitation = sanitation;
    }

    public Walls getWalls() {
        return walls;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public WindowsVentilationBlocks getWindowsVentilationBlocks() {
        return windowsVentilationBlocks;
    }

    public void setWindowsVentilationBlocks(WindowsVentilationBlocks windowsVentilationBlocks) {
        this.windowsVentilationBlocks = windowsVentilationBlocks;
    }
}

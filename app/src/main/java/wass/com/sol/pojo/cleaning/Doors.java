package wass.com.sol.pojo.cleaning;

import wass.com.sol.utils.CheckListItem;

/**
 * Created by Lasar-Soporte on 26/1/2017.
 */

public class Doors implements CheckListItem {

    private int scValue;
    private int tycValue;
    private int sdcValue;
    private int sacValue;
    private int sciValue;
    private String scSpinnerValue;
    private String tycSpinnerValue;
    private String sdcSpinnerValue;
    private String sacSpinnerValue;
    private String sciSpinnerValue;

    @Override
    public int getScValue() {
        return scValue;
    }

    @Override
    public int getTycValue() {
        return tycValue;
    }

    @Override
    public int getSdcValue() {
        return sdcValue;
    }

    @Override
    public int getSacValue() {
        return sacValue;
    }

    @Override
    public int getSciValue() {
        return sciValue;
    }

    @Override
    public String getScSpinnerValue() {
        return scSpinnerValue;
    }

    @Override
    public String getTycSpinnerValue() {
        return tycSpinnerValue;
    }

    @Override
    public String getSdcSpinnerValue() {
        return sdcSpinnerValue;
    }

    @Override
    public String getSacSpinnerValue() {
        return sacSpinnerValue;
    }

    @Override
    public String getSciSpinnerValue() {
        return sciSpinnerValue;
    }
}

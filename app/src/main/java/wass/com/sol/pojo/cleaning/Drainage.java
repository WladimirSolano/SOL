package wass.com.sol.pojo.cleaning;

import wass.com.sol.utils.interfaces.CheckListItem;

/**
 * Created by Lasar-Soporte on 8/2/2017.
 */

public class Drainage implements CheckListItem {

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

    public void setScValue(int scValue) {
        this.scValue = scValue;
    }

    @Override
    public int getTycValue() {
        return tycValue;
    }

    public void setTycValue(int tycValue) {
        this.tycValue = tycValue;
    }

    @Override
    public int getSdcValue() {
        return sdcValue;
    }

    public void setSdcValue(int sdcValue) {
        this.sdcValue = sdcValue;
    }

    @Override
    public int getSacValue() {
        return sacValue;
    }

    public void setSacValue(int sacValue) {
        this.sacValue = sacValue;
    }

    @Override
    public int getSciValue() {
        return sciValue;
    }

    public void setSciValue(int sciValue) {
        this.sciValue = sciValue;
    }

    @Override
    public String getScSpinnerValue() {
        return scSpinnerValue;
    }

    public void setScSpinnerValue(String scSpinnerValue) {
        this.scSpinnerValue = scSpinnerValue;
    }

    @Override
    public String getTycSpinnerValue() {
        return tycSpinnerValue;
    }

    public void setTycSpinnerValue(String tycSpinnerValue) {
        this.tycSpinnerValue = tycSpinnerValue;
    }

    @Override
    public String getSdcSpinnerValue() {
        return sdcSpinnerValue;
    }

    public void setSdcSpinnerValue(String sdcSpinnerValue) {
        this.sdcSpinnerValue = sdcSpinnerValue;
    }

    @Override
    public String getSacSpinnerValue() {
        return sacSpinnerValue;
    }

    public void setSacSpinnerValue(String sacSpinnerValue) {
        this.sacSpinnerValue = sacSpinnerValue;
    }

    @Override
    public String getSciSpinnerValue() {
        return sciSpinnerValue;
    }

    public void setSciSpinnerValue(String sciSpinnerValue) {
        this.sciSpinnerValue = sciSpinnerValue;
    }
}

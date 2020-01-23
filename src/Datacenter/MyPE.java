/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacenter;

import org.cloudbus.cloudsim.provisioners.PeProvisioner;

/**
 *
 * @author aissa
 */
public class MyPE {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setMips(String mips) {
        this.mips = mips;
    }

    public String getId() {
        return id;
    }

    public String getMips() {
        return mips;
    }
   private String mips;
}

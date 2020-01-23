/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloudlet;

import java.util.List;

/**
 *
 * @author aissa
 */
public class MyVM {
    
    private String id;
    private String mips;
    private String size;
    private String ram;
    private String bw;
    private String pesNum;
    private String vmm;
  private List<MyCloudlet> cloud;

    public List<MyCloudlet> getCloud() {
        return cloud;
    }

    public void setCloud(List<MyCloudlet> cloud) {
        this.cloud = cloud;
    }
    public String getId() {
        return id;
    }

    public String getMips() {
        return mips;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMips(String mips) {
        this.mips = mips;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setBw(String bw) {
        this.bw = bw;
    }

    public void setPesNum(String pesNum) {
        this.pesNum = pesNum;
    }

    public void setVmm(String vmm) {
        this.vmm = vmm;
    }

    public String getSize() {
        return size;
    }

    public String getRam() {
        return ram;
    }

    public String getBw() {
        return bw;
    }

    public String getPesNum() {
        return pesNum;
    }

    public String getVmm() {
        return vmm;
    }
    
    
    
}

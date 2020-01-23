/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacenter;

import java.util.List;



/**
 *
 * @author aissa
 *
 */
public class MyHost {
    private String id;
    private String ram;
     private String storage;
      private String Bw;
      private List<MyPE> listpe;
 private String Polic;

    public String getPolic() {
        return Polic;
    }

    public void setPolic(String Polic) {
        this.Polic = Polic;
    }
    public void setListpe(List<MyPE> listpe) {
        this.listpe = listpe;
    }

    public List<MyPE> getListpe() {
        return listpe;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setBw(String Bw) {
        this.Bw = Bw;
    }

    public String getId() {
        return id;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getBw() {
        return Bw;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloudlet;

/**
 *
 * @author aissa
 */
public class MyCloudlet {
    private String id;
    private String lenght;
    private String filsize;
    private String outpute;
    
    private MyVM vm1;

    public void setVm1(MyVM vm1) {
        this.vm1 = vm1;
    }

    public MyVM getVm1() {
        return vm1;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public void setFilsize(String filsize) {
        this.filsize = filsize;
    }

    public void setOutpute(String outpute) {
        this.outpute = outpute;
    }

    public String getId() {
        return id;
    }

    public String getLenght() {
        return lenght;
    }

    public String getFilsize() {
        return filsize;
    }

    public String getOutpute() {
        return outpute;
    }
}

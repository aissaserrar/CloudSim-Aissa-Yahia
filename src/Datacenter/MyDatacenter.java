/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacenter;

import java.util.List;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.VmAllocationPolicy;

/**
 *
 * @author aissa
 */
public class MyDatacenter {
    private Charactristic characteristics;

	/** The regional cis name. */
	private String Name;
        private double schedulingInterval;
	/** The vm provisioner. */
	private VmAllocationPolicy vmAllocationPolicy;
       private List<Storage> storageList;
       private List<MyHost> host;
       private String Police;
       
       private String time="0";

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String getPolice() {
        return Police;
    }

    public void setPolice(String Police) {
        this.Police = Police;
    }

    public void setHost(List<MyHost> host) {
        this.host = host;
    }

    public List<MyHost> getHost() {
        return host;
    }
	/** The last process time. */
	private double lastProcessTime;

    public void setCharacteristics(Charactristic characteristics) {
        this.characteristics = characteristics;
    }

    public void setName(String regionalCisName) {
        this.Name = regionalCisName;
    }

    public void setVmAllocationPolicy(VmAllocationPolicy vmAllocationPolicy) {
        this.vmAllocationPolicy = vmAllocationPolicy;
    }

    public void setLastProcessTime(double lastProcessTime) {
        this.lastProcessTime = lastProcessTime;
    }

    public void setStorageList(List<Storage> storageList) {
        this.storageList = storageList;
    }

    public void setSchedulingInterval(double schedulingInterval) {
        this.schedulingInterval = schedulingInterval;
    }

	/** The storage list. */
	

    public Charactristic getCharacteristics() {
        return characteristics;
    }

    public String getName() {
        return Name;
    }

    public VmAllocationPolicy getVmAllocationPolicy() {
        return vmAllocationPolicy;
    }

    public double getLastProcessTime() {
        return lastProcessTime;
    }

    public List<Storage> getStorageList() {
        return storageList;
    }

    public double getSchedulingInterval() {
        return schedulingInterval;
    }



	/** The scheduling interval. */
	
}

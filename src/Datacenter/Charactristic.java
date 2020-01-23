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
 */
public class Charactristic {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setHostList(List<? extends MyHost> hostList) {
        this.hostList = hostList;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setCostPerSecond(String costPerSecond) {
        this.costPerSecond = costPerSecond;
    }

    public void setAllocationPolicy(String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
    }

    public void setVmm(String vmm) {
        this.vmm = vmm;
    }

    public void setCostPerMem(String costPerMem) {
        this.costPerMem = costPerMem;
    }

    public void setCostPerStorage(String costPerStorage) {
        this.costPerStorage = costPerStorage;
    }

    public void setCostPerBw(String costPerBw) {
        this.costPerBw = costPerBw;
    }

    public String getId() {
        return id;
    }

    public String getArchitecture() {
        return architecture;
    }

    public String getOs() {
        return os;
    }

    public List<? extends MyHost> getHostList() {
        return hostList;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getCostPerSecond() {
        return costPerSecond;
    }

    public String getAllocationPolicy() {
        return allocationPolicy;
    }

    public static String getTIME_SHARED() {
        return TIME_SHARED;
    }

    public static String getSPACE_SHARED() {
        return SPACE_SHARED;
    }

    public static String getOTHER_POLICY_SAME_RATING() {
        return OTHER_POLICY_SAME_RATING;
    }

    public static String getOTHER_POLICY_DIFFERENT_RATING() {
        return OTHER_POLICY_DIFFERENT_RATING;
    }

    public static String getADVANCE_RESERVATION() {
        return ADVANCE_RESERVATION;
    }

    public String getVmm() {
        return vmm;
    }

    public String getCostPerMem() {
        return costPerMem;
    }

    public String getCostPerStorage() {
        return costPerStorage;
    }

    public String getCostPerBw() {
        return costPerBw;
    }

	/** The architecture. */
	private String architecture;

	/** The os. */
	private String os;

	/** The host list. */
	private List<? extends MyHost> hostList;

	/** The time zone -- difference from GMT. */
	private String timeZone;

	/** Price/CPU-unit if unit = sec., then G$/CPU-sec. */
	private String costPerSecond;

	/** Resource Types -- allocation policy. */
	private String allocationPolicy;

	/** Time-shared system using Round-Robin algorithm. */
	public static final String TIME_SHARED = "0";

	/** Spaced-shared system using First Come First Serve (FCFS) algorithm. */
	public static final String SPACE_SHARED = "1";

	/** Assuming all PEs in all Machines have the same rating. */
	public static final String OTHER_POLICY_SAME_RATING = "2";

	/**
	 * Assuming all PEs in a Machine have the same rating. However, each Machine has different
	 * rating to each other.
	 */
	public static final String OTHER_POLICY_DIFFERENT_RATING = "3";

	/** A resource that supports Advanced Reservation mechanisms. */
	public static final String ADVANCE_RESERVATION = "4";

	/** The vmm. */
	private String vmm;

	/** The cost per mem. */
	private String costPerMem;

	/** The cost per storage. */
	private String costPerStorage;

	/** The cost per bw. */
	private String costPerBw;

}

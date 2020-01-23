package User;


import Cloudlet.MyVM;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class User {
    private String Id;
    private String nom;
    private String prenom;
    private List<MyVM> vm;
    private String timeC;

    public String getTimeC() {
        return timeC;
    }

    public void setTimeC(String timeC) {
        this.timeC = timeC;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<MyVM> getVm() {
        return vm;
    }

    public void setVm(List<MyVM> vm) {
        this.vm = vm;
    }
}

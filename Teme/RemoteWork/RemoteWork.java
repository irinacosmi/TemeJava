package com.java.training.d02.Teme.RemoteWork;

public class RemoteWork {

    //ISP = internet service provider
    private String name;
    private String ISP;
    private String VPNServices;
    private String communication;
    private String device;

    public RemoteWork() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISP() {
        return ISP;
    }

    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public String getVPNServices() {
        return VPNServices;
    }

    public void setVPNServices(String VPNServices) {
        this.VPNServices = VPNServices;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void display(){
        System.out.println(getName() + " works from a " + getDevice() + " and has as internet provider " + getISP() + ". VPN service is provided by " + getVPNServices() + ". We communicate via " + getCommunication() + ".");
    }
}

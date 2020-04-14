package com.java.training.d02.Teme.RemoteWork;

public class ImmutableRemoteWork {
    private final String name;
    private final String ISP;
    private final String VPNServices;
    private final String communication;
    private final String device;

    public ImmutableRemoteWork(String name, String ISP, String VPNServices, String communication, String device) {
        this.name = name;
        this.ISP = ISP;
        this.VPNServices = VPNServices;
        this.communication = communication;
        this.device = device;
    }

    public String getName() {
        return name;
    }

    public String getISP() {
        return ISP;
    }

    public String getVPNServices() {
        return VPNServices;
    }

    public String getCommunication() {
        return communication;
    }

    public String getDevice() {
        return device;
    }

    public void display(){
        System.out.println(getName() + " works from a " + getDevice() + " and has as internet provider " + getISP() + ". VPN service is provided by " + getVPNServices() + ". We communicate via " + getCommunication() + ".");
    }
}

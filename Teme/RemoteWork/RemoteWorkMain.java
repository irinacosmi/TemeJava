package com.java.training.d02.Teme.RemoteWork;

public class RemoteWorkMain {
    public static void main(String[] args) {
        RemoteWork ana = new RemoteWork();
        ana.setName("Ana");
        ana.setDevice("laptop");
        ana.setISP("RDS");
        ana.setVPNServices("ExpressVPN");
        ana.setCommunication("Google+ Hangouts");

        RemoteWork george = new RemoteWork();
        george.setName("George");
        george.setDevice("PC");
        george.setISP("Vodafone");
        george.setVPNServices("PrivateInternetAccess");
        george.setCommunication("Skype");

        ImmutableRemoteWork ioana = new ImmutableRemoteWork("Ioana", "Orange", "CyberGhost VPN", "Skype", "laptop");

        ana.display();
        george.display();
        ioana.display();
    }



}

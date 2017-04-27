package ru.android_studio;

import java.io.IOException;

import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

import sun.security.x509.X500Name;

public class Main {

    public static void main(String[] args) {
        final String cert = "-----BEGIN CERTIFICATE-----\n" +
                "MIIDxzCCAq+gAwIBAgIJAPy4+l7/jhx2MA0GCSqGSIb3DQEBBQUAMHoxCzAJBgNV\n" +
                "BAYTAlVTMREwDwYDVQQIDAhNaWNoaWdhbjERMA8GA1UEBwwISG91Z2h0b24xKjAo\n" +
                "BgNVBAoMIU1pY2hpZ2FuIFRlY2hub2xvZ2ljYWwgVW5pdmVyc2l0eTEKMAgGA1UE\n" +
                "CwwBMTENMAsGA1UEAwwEWXVyeTAeFw0xNzA0MjcxMDM5NDZaFw0xNzA0MjgxMDM5\n" +
                "NDZaMHoxCzAJBgNVBAYTAlVTMREwDwYDVQQIDAhNaWNoaWdhbjERMA8GA1UEBwwI\n" +
                "SG91Z2h0b24xKjAoBgNVBAoMIU1pY2hpZ2FuIFRlY2hub2xvZ2ljYWwgVW5pdmVy\n" +
                "c2l0eTEKMAgGA1UECwwBMTENMAsGA1UEAwwEWXVyeTCCASIwDQYJKoZIhvcNAQEB\n" +
                "BQADggEPADCCAQoCggEBANgQP0uzpi1aXDpfpktmx+CnCWIPXP30L180vL1IA5j8\n" +
                "tfjEC8MVYyK91vKPJt7pl68B/GZeZhZtAhsoaENpTX3AX51NAaFn8M8MP6TPzqwL\n" +
                "/AXDCqJak0n0FF0b/ZzR2v28VsayzFf2sQcgUgEoQ/RnIYygYWzD8rPNT89kEzSx\n" +
                "SOghtA0c4jmWCc1q8d+MMdt2zjFqZm0AdIYjpgSSWyGpt+wH/3wEbU20A35NTBRf\n" +
                "+dw6O/2Qg+T5aRB+AsRv6U2Di7kq1FYFJvf0M4pwb7Y+rbAoCCzhUiU6OZT5Q+CT\n" +
                "Cn3JkXS+Q+89dwhJ8W7NFG1RhWTiEfv9umORCXuIMf8CAwEAAaNQME4wHQYDVR0O\n" +
                "BBYEFDH8DIkVfJGSgJsQnxpqZCNuXgkIMB8GA1UdIwQYMBaAFDH8DIkVfJGSgJsQ\n" +
                "nxpqZCNuXgkIMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADggEBACzANe3g\n" +
                "v511y61gKl8odRXnwG3tBGE7IfJ3j0H2me6iXxyMPAR+4qCB3UL9dvrnQeNeQX5x\n" +
                "IqGIiRdLTULhwf5V2n5mcl1IennULTpARwaFB9BJKZQ4tNqBC3LG987rXOG0dv4e\n" +
                "RBxaLvJ9+8v6NgyYh9+7eqsgfuY3A3TNeLBx3EvM4RvQ42jKoWxWQ6smgH+2t66y\n" +
                "OOt9jcybHlFJGrXj39fF5YHDSgIV+Fcvwxbj+R4ctJ5neWKVCbyP0yiWXGlGdBLy\n" +
                "KAhMg3sZ8us4fEMElyv+GCwzNPOIoCrVrPyp8eYxNO4zH7H4kb2Y426ejaiIYv4R\n" +
                "Ua20QKm1tJFtyf0=\n" +
                "-----END CERTIFICATE-----";

        final byte[] bytes = cert.getBytes();
        final X509Certificate certificate;
        try {
            certificate = X509Certificate.getInstance(bytes);
            try {
                final String commonName = ((X500Name) certificate.getSubjectDN()).getCommonName();
                System.out.println("commonName: " + commonName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}

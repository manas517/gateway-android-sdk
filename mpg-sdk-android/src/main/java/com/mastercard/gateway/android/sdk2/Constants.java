package com.mastercard.gateway.android.sdk2;


final class Constants {

    static final String VERSION = "1.0.0-SNAPSHOT";

    static final String USER_AGENT = "Gateway-Android-SDK/" + VERSION;

    static final int CONNECTION_TIMEOUT = 15000;
    static final int SOCKET_TIMEOUT = 60000;

    // TODO this may need to be parameterized to support different regions
    static final String API_URL = "https://eu-gateway.mastercard.com/api/rest/version/39";

    static final String API_PATH_CARDTOKEN = "/payment/cardToken";

    static final String EU_CA_ALIAS = "eu-gateway.mastercard.com";
    static final String EU_CA =
            "MIIFAzCCA+ugAwIBAgIEUdNg7jANBgkqhkiG9w0BAQsFADCBvjELMAkGA1UEBhMC" +
            "VVMxFjAUBgNVBAoTDUVudHJ1c3QsIEluYy4xKDAmBgNVBAsTH1NlZSB3d3cuZW50" +
            "cnVzdC5uZXQvbGVnYWwtdGVybXMxOTA3BgNVBAsTMChjKSAyMDA5IEVudHJ1c3Qs" +
            "IEluYy4gLSBmb3IgYXV0aG9yaXplZCB1c2Ugb25seTEyMDAGA1UEAxMpRW50cnVz" +
            "dCBSb290IENlcnRpZmljYXRpb24gQXV0aG9yaXR5IC0gRzIwHhcNMTQxMDIyMTcw" +
            "NTE0WhcNMjQxMDIzMDczMzIyWjCBujELMAkGA1UEBhMCVVMxFjAUBgNVBAoTDUVu" +
            "dHJ1c3QsIEluYy4xKDAmBgNVBAsTH1NlZSB3d3cuZW50cnVzdC5uZXQvbGVnYWwt" +
            "dGVybXMxOTA3BgNVBAsTMChjKSAyMDEyIEVudHJ1c3QsIEluYy4gLSBmb3IgYXV0" +
            "aG9yaXplZCB1c2Ugb25seTEuMCwGA1UEAxMlRW50cnVzdCBDZXJ0aWZpY2F0aW9u" +
            "IEF1dGhvcml0eSAtIEwxSzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEB" +
            "ANo/ltBNuS9E59s5XptQ7lylYdpBZ1MJqgCajld/KWvbx+EhJKo60I1HI9Ltchbw" +
            "kSHSXbe4S6iDj7eRMmjPziWTLLJ9l8j+wbQXugmeA5CTe3xJgyJoipveR8MxmHou" +
            "fUAL0u8+07KMqo9Iqf8A6ClYBve2k1qUcyYmrVgO5UK41epzeWRoUyW4hM+Ueq4G" +
            "RQyja03Qxr7qGKQ28JKyuhyIjzpSf/debYMcnfAf5cPW3aV4kj2wbSzqyc+UQRlx" +
            "RGi6RzwE6V26PvA19xW2nvIuFR4/R8jIOKdzRV1NsDuxjhcpN+rdBQEiu5Q2Ko1b" +
            "Nf5TGS8IRsEqsxpiHU4r2RsCAwEAAaOCAQkwggEFMA4GA1UdDwEB/wQEAwIBBjAP" +
            "BgNVHRMECDAGAQH/AgEAMDMGCCsGAQUFBwEBBCcwJTAjBggrBgEFBQcwAYYXaHR0" +
            "cDovL29jc3AuZW50cnVzdC5uZXQwMAYDVR0fBCkwJzAloCOgIYYfaHR0cDovL2Ny" +
            "bC5lbnRydXN0Lm5ldC9nMmNhLmNybDA7BgNVHSAENDAyMDAGBFUdIAAwKDAmBggr" +
            "BgEFBQcCARYaaHR0cDovL3d3dy5lbnRydXN0Lm5ldC9ycGEwHQYDVR0OBBYEFIKi" +
            "cHTdvFM/z3vU981/p2DGCky/MB8GA1UdIwQYMBaAFGpyJnrQHu995ztpUdRsjZ+Q" +
            "EmarMA0GCSqGSIb3DQEBCwUAA4IBAQA/HBpb/0AiHY81DC2qmSerwBEycNc2KGml" +
            "jbEnmUK+xJPrSFdDcSPE5U6trkNvknbFGe/KvG9CTBaahqkEOMdl8PUM4ErfovrO" +
            "GhGonGkvG9/q4jLzzky8RgzAiYDRh2uiz2vUf/31YFJnV6Bt0WRBFG00Yu0GbCTy" +
            "BrwoAq8DLcIzBfvLqhboZRBD9Wlc44FYmc1r07jHexlVyUDOeVW4c4npXEBmQxJ/" +
            "B7hlVtWNw6f1sbZlnsCDNn8WRTx0S5OKPPEr9TVwc3vnggSxGJgO1JxvGvz8pzOl" +
            "u7sY82t6XTKH920l5OJ2hiEeEUbNdg5vT6QhcQqEpy02qUgiUX6C";
}


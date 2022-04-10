package com.thatsdarlingmama.security.signature;

import java.security.SignatureException;

import com.thatsdarlingmama.security.QuantumSignatureSpi;
public class SPHINCSPlusSHAKE256256fsimpleSignatureSpi extends QuantumSignatureSpi {
    public SPHINCSPlusSHAKE256256fsimpleSignatureSpi() throws SignatureException {
        super("SPHINCS+-SHAKE256-256f-simple");
    }
}

package com.thatsdarlingmama.security;

import java.security.Provider;

public class QuantumProvider extends Provider {
    public QuantumProvider() {
        super("Quantum", "1.0", "Provides all current Quantum Encryption Algorithms");
        put("Signature.Dilithium2", "com.thatsdarlingmama.security.signature.Dilithium2SignatureSpi");
        put("Signature.Dilithium3", "com.thatsdarlingmama.security.signature.Dilithium3SignatureSpi");
        put("Signature.Dilithium5", "com.thatsdarlingmama.security.signature.Dilithium5SignatureSpi");
        put("Signature.Dilithium2-AES", "com.thatsdarlingmama.security.signature.Dilithium2AESSignatureSpi");
        put("Signature.Dilithium3-AES", "com.thatsdarlingmama.security.signature.Dilithium3AESSignatureSpi");
        put("Signature.Dilithium5-AES", "com.thatsdarlingmama.security.signature.Dilithium5AESSignatureSpi");
        put("Signature.Falcon-512", "com.thatsdarlingmama.security.signature.Falcon512SignatureSpi");
        put("Signature.Falcon-1024", "com.thatsdarlingmama.security.signature.Falcon1024SignatureSpi");
        put("Signature.Rainbow-I-Classic", "com.thatsdarlingmama.security.signature.RainbowIClassicSignatureSpi");
        put("Signature.Rainbow-I-Circumzenithal", "com.thatsdarlingmama.security.signature.RainbowICircumzenithalSignatureSpi");
        put("Signature.Rainbow-I-Compressed", "com.thatsdarlingmama.security.signature.RainbowICompressedSignatureSpi");
        put("Signature.Rainbow-III-Classic", "com.thatsdarlingmama.security.signature.RainbowIIIClassicSignatureSpi");
        put("Signature.Rainbow-III-Circumzenithal", "com.thatsdarlingmama.security.signature.RainbowIIICircumzenithalSignatureSpi");
        put("Signature.Rainbow-III-Compressed", "com.thatsdarlingmama.security.signature.RainbowIIICompressedSignatureSpi");
        put("Signature.Rainbow-V-Classic", "com.thatsdarlingmama.security.signature.RainbowVClassicSignatureSpi");
        put("Signature.Rainbow-V-Circumzenithal", "com.thatsdarlingmama.security.signature.RainbowVCircumzenithalSignatureSpi");
        put("Signature.Rainbow-V-Compressed", "com.thatsdarlingmama.security.signature.RainbowVCompressedSignatureSpi");
        put("Signature.SPHINCS+-Haraka-128f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128frobustSignatureSpi");
        put("Signature.SPHINCS+-Haraka-128f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128fsimpleSignatureSpi");
        put("Signature.SPHINCS+-Haraka-128s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128srobustSignatureSpi");
        put("Signature.SPHINCS+-Haraka-128s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128ssimpleSignatureSpi");
        put("Signature.SPHINCS+-Haraka-192f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192frobustSignatureSpi");
        put("Signature.SPHINCS+-Haraka-192f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192fsimpleSignatureSpi");
        put("Signature.SPHINCS+-Haraka-192s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192srobustSignatureSpi");
        put("Signature.SPHINCS+-Haraka-192s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192ssimpleSignatureSpi");
        put("Signature.SPHINCS+-Haraka-256f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256frobustSignatureSpi");
        put("Signature.SPHINCS+-Haraka-256f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256fsimpleSignatureSpi");
        put("Signature.SPHINCS+-Haraka-256s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256srobustSignatureSpi");
        put("Signature.SPHINCS+-Haraka-256s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256ssimpleSignatureSpi");
        put("Signature.SPHINCS+-SHA256-128f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128frobustSignatureSpi");
        put("Signature.SPHINCS+-SHA256-128f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128fsimpleSignatureSpi");
        put("Signature.SPHINCS+-SHA256-128s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128srobustSignatureSpi");
        put("Signature.SPHINCS+-SHA256-128s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128ssimpleSignatureSpi");
        put("Signature.SPHINCS+-SHA256-192f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192frobustSignatureSpi");
        put("Signature.SPHINCS+-SHA256-192f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192fsimpleSignatureSpi");
        put("Signature.SPHINCS+-SHA256-192s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192srobustSignatureSpi");
        put("Signature.SPHINCS+-SHA256-192s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192ssimpleSignatureSpi");
        put("Signature.SPHINCS+-SHA256-256f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256frobustSignatureSpi");
        put("Signature.SPHINCS+-SHA256-256f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256fsimpleSignatureSpi");
        put("Signature.SPHINCS+-SHA256-256s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256srobustSignatureSpi");
        put("Signature.SPHINCS+-SHA256-256s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256ssimpleSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-128f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128frobustSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-128f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128fsimpleSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-128s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128srobustSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-128s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128ssimpleSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-192f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192frobustSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-192f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192fsimpleSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-192s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192srobustSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-192s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192ssimpleSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-256f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256frobustSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-256f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256fsimpleSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-256s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256srobustSignatureSpi");
        put("Signature.SPHINCS+-SHAKE256-256s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256ssimpleSignatureSpi");
        put("Signature.picnic_L1_FS", "com.thatsdarlingmama.security.signature.picnicL1FSSignatureSpi");
        put("Signature.picnic_L1_UR", "com.thatsdarlingmama.security.signature.picnicL1URSignatureSpi");
        put("Signature.picnic_L1_full", "com.thatsdarlingmama.security.signature.picnicL1fullSignatureSpi");
        put("Signature.picnic_L3_FS", "com.thatsdarlingmama.security.signature.picnicL3FSSignatureSpi");
        put("Signature.picnic_L3_UR", "com.thatsdarlingmama.security.signature.picnicL3URSignatureSpi");
        put("Signature.picnic_L3_full", "com.thatsdarlingmama.security.signature.picnicL3fullSignatureSpi");
        put("Signature.picnic_L5_FS", "com.thatsdarlingmama.security.signature.picnicL5FSSignatureSpi");
        put("Signature.picnic_L5_UR", "com.thatsdarlingmama.security.signature.picnicL5URSignatureSpi");
        put("Signature.picnic_L5_full", "com.thatsdarlingmama.security.signature.picnicL5fullSignatureSpi");
        put("Signature.picnic3_L1", "com.thatsdarlingmama.security.signature.picnic3L1SignatureSpi");
        put("Signature.picnic3_L3", "com.thatsdarlingmama.security.signature.picnic3L3SignatureSpi");
        put("Signature.picnic3_L5", "com.thatsdarlingmama.security.signature.picnic3L3SignatureSpi");

        put("KeyAgreement.LightSaber-KEM", "com.thatsdarlingmama.security.keyagreement.LightSaberKEMKeyAgreementSpi");
        put("KeyAgreement.BIKE-L1", "com.thatsdarlingmama.security.keyagreement.BIKEL1KeyAgreementSpi");
        put("KeyAgreement.BIKE-L3", "com.thatsdarlingmama.security.keyagreement.BIKEL3KeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-348864", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece348864KeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-348864f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece348864fKeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-460896", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece460896KeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-460896f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece460896fKeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-6688128", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6688128KeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-6688128f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6688128fKeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-6960119", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6960119KeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-6960119f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6960119fKeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-8192128", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece8192128KeyAgreementSpi");
        put("KeyAgreement.Classic-McEliece-8192128f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece8192128fKeyAgreementSpi");
        put("KeyAgreement.HQC-128", "com.thatsdarlingmama.security.keyagreement.HQC128KeyAgreementSpi");
        put("KeyAgreement.HQC-192", "com.thatsdarlingmama.security.keyagreement.HQC192KeyAgreementSpi");
        put("KeyAgreement.HQC-256", "com.thatsdarlingmama.security.keyagreement.HQC256KeyAgreementSpi");
        put("KeyAgreement.Kyber512", "com.thatsdarlingmama.security.keyagreement.Kyber512KeyAgreementSpi");
        put("KeyAgreement.Kyber768", "com.thatsdarlingmama.security.keyagreement.Kyber768KeyAgreementSpi");
        put("KeyAgreement.Kyber1024", "com.thatsdarlingmama.security.keyagreement.Kyber1024KeyAgreementSpi");
        put("KeyAgreement.Kyber512-90s", "com.thatsdarlingmama.security.keyagreement.Kyber51290sKeyAgreementSpi");
        put("KeyAgreement.Kyber768-90s", "com.thatsdarlingmama.security.keyagreement.Kyber76890sKeyAgreementSpi");
        put("KeyAgreement.Kyber1024-90s", "com.thatsdarlingmama.security.keyagreement.Kyber102490sKeyAgreementSpi");
        put("KeyAgreement.NTRU-HPS-2048-509", "com.thatsdarlingmama.security.keyagreement.NTRUHPS2048509KeyAgreementSpi");
        put("KeyAgreement.NTRU-HPS-2048-677", "com.thatsdarlingmama.security.keyagreement.NTRUHPS2048677KeyAgreementSpi");
        put("KeyAgreement.NTRU-HPS-4096-821", "com.thatsdarlingmama.security.keyagreement.NTRUHPS4096821KeyAgreementSpi");
        put("KeyAgreement.NTRU-HPS-4096-1229", "com.thatsdarlingmama.security.keyagreement.NTRUHPS40961229KeyAgreementSpi");
        put("KeyAgreement.NTRU-HRSS-701", "com.thatsdarlingmama.security.keyagreement.NTRUHRSS701KeyAgreementSpi");
        put("KeyAgreement.NTRU-HRSS-1373", "com.thatsdarlingmama.security.keyagreement.NTRUHRSS1373KeyAgreementSpi");
        put("KeyAgreement.ntrulpr653", "com.thatsdarlingmama.security.keyagreement.ntrulpr653KeyAgreementSpi");
        put("KeyAgreement.ntrulpr761", "com.thatsdarlingmama.security.keyagreement.ntrulpr761KeyAgreementSpi");
        put("KeyAgreement.ntrulpr857", "com.thatsdarlingmama.security.keyagreement.ntrulpr857KeyAgreementSpi");
        put("KeyAgreement.ntrulpr1277", "com.thatsdarlingmama.security.keyagreement.ntrulpr1277KeyAgreementSpi");
        put("KeyAgreement.sntrup653", "com.thatsdarlingmama.security.keyagreement.sntrup653KeyAgreementSpi");
        put("KeyAgreement.sntrup761", "com.thatsdarlingmama.security.keyagreement.sntrup761KeyAgreementSpi");
        put("KeyAgreement.sntrup857", "com.thatsdarlingmama.security.keyagreement.sntrup857KeyAgreementSpi");
        put("KeyAgreement.sntrup1277", "com.thatsdarlingmama.security.keyagreement.sntrup1277KeyAgreementSpi");
        put("KeyAgreement.LightSaber-KEM", "com.thatsdarlingmama.security.keyagreement.LightSaberKEMKeyAgreementSpi");
        put("KeyAgreement.Saber-KEM", "com.thatsdarlingmama.security.keyagreement.SaberKEMKeyAgreementSpi");
        put("KeyAgreement.FireSaber-KEM", "com.thatsdarlingmama.security.keyagreement.FireSaberKEMKeyAgreementSpi");
        put("KeyAgreement.FrodoKEM-640-AES", "com.thatsdarlingmama.security.keyagreement.FrodoKEM640AESKeyAgreementSpi");
        put("KeyAgreement.FrodoKEM-640-SHAKE", "com.thatsdarlingmama.security.keyagreement.FrodoKEM640SHAKEKeyAgreementSpi");
        put("KeyAgreement.FrodoKEM-976-AES", "com.thatsdarlingmama.security.keyagreement.FrodoKEM976AESKeyAgreementSpi");
        put("KeyAgreement.FrodoKEM-976-SHAKE", "com.thatsdarlingmama.security.keyagreement.FrodoKEM976SHAKEKeyAgreementSpi");
        put("KeyAgreement.FrodoKEM-1344-AES", "com.thatsdarlingmama.security.keyagreement.FrodoKEM1344AESKeyAgreementSpi");
        put("KeyAgreement.FrodoKEM-1344-SHAKE", "com.thatsdarlingmama.security.keyagreement.FrodoKEM1344SHAKEKeyAgreementSpi");
        put("KeyAgreement.SIDH-p434", "com.thatsdarlingmama.security.keyagreement.SIDHp434KeyAgreementSpi");
        put("KeyAgreement.SIDH-p503", "com.thatsdarlingmama.security.keyagreement.SIDHp503KeyAgreementSpi");
        put("KeyAgreement.SIDH-p610", "com.thatsdarlingmama.security.keyagreement.SIDHp610KeyAgreementSpi");
        put("KeyAgreement.SIDH-p751", "com.thatsdarlingmama.security.keyagreement.SIDHp751KeyAgreementSpi");
        put("KeyAgreement.SIDH-p434-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp434compressedKeyAgreementSpi");
        put("KeyAgreement.SIDH-p503-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp503compressedKeyAgreementSpi");
        put("KeyAgreement.SIDH-p610-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp610compressedKeyAgreementSpi");
        put("KeyAgreement.SIDH-p751-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp751compressedKeyAgreementSpi");
        put("KeyAgreement.SIKE-p434", "com.thatsdarlingmama.security.keyagreement.SIKEp434KeyAgreementSpi");
        put("KeyAgreement.SIKE-p503", "com.thatsdarlingmama.security.keyagreement.SIKEp503KeyAgreementSpi");
        put("KeyAgreement.SIKE-p610", "com.thatsdarlingmama.security.keyagreement.SIKEp610KeyAgreementSpi");
        put("KeyAgreement.SIKE-p751", "com.thatsdarlingmama.security.keyagreement.SIKEp751KeyAgreementSpi");
        put("KeyAgreement.SIKE-p434-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp434compressedKeyAgreementSpi");
        put("KeyAgreement.SIKE-p503-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp503compressedKeyAgreementSpi");
        put("KeyAgreement.SIKE-p610-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp610compressedKeyAgreementSpi");
        put("KeyAgreement.SIKE-p751-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp751compressedKeyAgreementSpi");

        putService(new Service(this,"Signature", "Dilithium2", "com.thatsdarlingmama.security.signature.Dilithium2SignatureSpi", null, null));
        putService(new Service(this,"Signature", "Dilithium3", "com.thatsdarlingmama.security.signature.Dilithium3SignatureSpi", null, null));
        putService(new Service(this,"Signature", "Dilithium5", "com.thatsdarlingmama.security.signature.Dilithium5SignatureSpi", null, null));
        putService(new Service(this,"Signature", "Dilithium2-AES", "com.thatsdarlingmama.security.signature.Dilithium2AESSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Dilithium3-AES", "com.thatsdarlingmama.security.signature.Dilithium3AESSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Dilithium5-AES", "com.thatsdarlingmama.security.signature.Dilithium5AESSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Falcon-512", "com.thatsdarlingmama.security.signature.Falcon512SignatureSpi", null, null));
        putService(new Service(this,"Signature", "Falcon-1024", "com.thatsdarlingmama.security.signature.Falcon1024SignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-I-Classic", "com.thatsdarlingmama.security.signature.RainbowIClassicSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-I-Circumzenithal", "com.thatsdarlingmama.security.signature.RainbowICircumzenithalSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-I-Compressed", "com.thatsdarlingmama.security.signature.RainbowICompressedSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-III-Classic", "com.thatsdarlingmama.security.signature.RainbowIIIClassicSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-III-Circumzenithal", "com.thatsdarlingmama.security.signature.RainbowIIICircumzenithalSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-III-Compressed", "com.thatsdarlingmama.security.signature.RainbowIIICompressedSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-V-Classic", "com.thatsdarlingmama.security.signature.RainbowVClassicSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-V-Circumzenithal", "com.thatsdarlingmama.security.signature.RainbowVCircumzenithalSignatureSpi", null, null));
        putService(new Service(this,"Signature", "Rainbow-V-Compressed", "com.thatsdarlingmama.security.signature.RainbowVCompressedSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-128f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-128f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-128s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-128s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka128ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-192f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-192f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-192s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-192s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka192ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-256f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-256f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-256s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-Haraka-256s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusHaraka256ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-128f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-128f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-128s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-128s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256128ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-192f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-192f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-192s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-192s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256192ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-256f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-256f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-256s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHA256-256s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHA256256ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-128f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-128f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-128s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-128s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256128ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-192f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-192f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-192s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-192s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256192ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-256f-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256frobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-256f-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256fsimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-256s-robust", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256srobustSignatureSpi", null, null));
        putService(new Service(this,"Signature", "SPHINCS+-SHAKE256-256s-simple", "com.thatsdarlingmama.security.signature.SPHINCSPlusSHAKE256256ssimpleSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L1_FS", "com.thatsdarlingmama.security.signature.picnicL1FSSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L1_UR", "com.thatsdarlingmama.security.signature.picnicL1URSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L1_full", "com.thatsdarlingmama.security.signature.picnicL1fullSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L3_FS", "com.thatsdarlingmama.security.signature.picnicL3FSSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L3_UR", "com.thatsdarlingmama.security.signature.picnicL3URSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L3_full", "com.thatsdarlingmama.security.signature.picnicL3fullSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L5_FS", "com.thatsdarlingmama.security.signature.picnicL5FSSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L5_UR", "com.thatsdarlingmama.security.signature.picnicL5URSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic_L5_full", "com.thatsdarlingmama.security.signature.picnicL5fullSignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic3_L1", "com.thatsdarlingmama.security.signature.picnic3L1SignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic3_L3", "com.thatsdarlingmama.security.signature.picnic3L3SignatureSpi", null, null));
        putService(new Service(this,"Signature", "picnic3_L5", "com.thatsdarlingmama.security.signature.picnic3L5SignatureSpi", null, null));

        putService(new Service(this,"KeyAgreement", "LightSaber-KEM", "com.thatsdarlingmama.security.keyagreement.LightSaberKEMKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "BIKE-L1", "com.thatsdarlingmama.security.keyagreement.BIKEL1KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "BIKE-L3", "com.thatsdarlingmama.security.keyagreement.BIKEL3KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-348864", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece348864KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-348864f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece348864fKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-460896", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece460896KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-460896f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece460896fKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-6688128", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6688128KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-6688128f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6688128fKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-6960119", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6960119KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-6960119f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece6960119fKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-8192128", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece8192128KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Classic-McEliece-8192128f", "com.thatsdarlingmama.security.keyagreement.ClassicMcEliece8192128fKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "HQC-128", "com.thatsdarlingmama.security.keyagreement.HQC128KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "HQC-192", "com.thatsdarlingmama.security.keyagreement.HQC192KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "HQC-256", "com.thatsdarlingmama.security.keyagreement.HQC256KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Kyber512", "com.thatsdarlingmama.security.keyagreement.Kyber512KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Kyber768", "com.thatsdarlingmama.security.keyagreement.Kyber768KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Kyber1024", "com.thatsdarlingmama.security.keyagreement.Kyber1024KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Kyber512-90s", "com.thatsdarlingmama.security.keyagreement.Kyber51290sKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Kyber768-90s", "com.thatsdarlingmama.security.keyagreement.Kyber76890sKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Kyber1024-90s", "com.thatsdarlingmama.security.keyagreement.Kyber102490sKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "NTRU-HPS-2048-509", "com.thatsdarlingmama.security.keyagreement.NTRUHPS2048509KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "NTRU-HPS-2048-677", "com.thatsdarlingmama.security.keyagreement.NTRUHPS2048677KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "NTRU-HPS-4096-821", "com.thatsdarlingmama.security.keyagreement.NTRUHPS4096821KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "NTRU-HPS-4096-1229", "com.thatsdarlingmama.security.keyagreement.NTRUHPS40961229KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "NTRU-HRSS-701", "com.thatsdarlingmama.security.keyagreement.NTRUHRSS701KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "NTRU-HRSS-1373", "com.thatsdarlingmama.security.keyagreement.NTRUHRSS1373KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "ntrulpr653", "com.thatsdarlingmama.security.keyagreement.ntrulpr653KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "ntrulpr761", "com.thatsdarlingmama.security.keyagreement.ntrulpr761KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "ntrulpr857", "com.thatsdarlingmama.security.keyagreement.ntrulpr857KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "ntrulpr1277", "com.thatsdarlingmama.security.keyagreement.ntrulpr1277KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "sntrup653", "com.thatsdarlingmama.security.keyagreement.sntrup653KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "sntrup761", "com.thatsdarlingmama.security.keyagreement.sntrup761KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "sntrup857", "com.thatsdarlingmama.security.keyagreement.sntrup857KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "sntrup1277", "com.thatsdarlingmama.security.keyagreement.sntrup1277KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "LightSaber-KEM", "com.thatsdarlingmama.security.keyagreement.LightSaberKEMKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "Saber-KEM", "com.thatsdarlingmama.security.keyagreement.SaberKEMKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FireSaber-KEM", "com.thatsdarlingmama.security.keyagreement.FireSaberKEMKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FrodoKEM-640-AES", "com.thatsdarlingmama.security.keyagreement.FrodoKEM640AESKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FrodoKEM-640-SHAKE", "com.thatsdarlingmama.security.keyagreement.FrodoKEM640SHAKEKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FrodoKEM-976-AES", "com.thatsdarlingmama.security.keyagreement.FrodoKEM976AESKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FrodoKEM-976-SHAKE", "com.thatsdarlingmama.security.keyagreement.FrodoKEM976SHAKEKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FrodoKEM-1344-AES", "com.thatsdarlingmama.security.keyagreement.FrodoKEM1344AESKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "FrodoKEM-1344-SHAKE", "com.thatsdarlingmama.security.keyagreement.FrodoKEM1344SHAKEKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p434", "com.thatsdarlingmama.security.keyagreement.SIDHp434KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p503", "com.thatsdarlingmama.security.keyagreement.SIDHp503KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p610", "com.thatsdarlingmama.security.keyagreement.SIDHp610KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p751", "com.thatsdarlingmama.security.keyagreement.SIDHp751KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p434-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp434compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p503-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp503compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p610-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp610compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIDH-p751-compressed", "com.thatsdarlingmama.security.keyagreement.SIDHp751compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p434", "com.thatsdarlingmama.security.keyagreement.SIKEp434KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p503", "com.thatsdarlingmama.security.keyagreement.SIKEp503KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p610", "com.thatsdarlingmama.security.keyagreement.SIKEp610KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p751", "com.thatsdarlingmama.security.keyagreement.SIKEp751KeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p434-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp434compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p503-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp503compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p610-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp610compressedKeyAgreementSpi", null, null));
        putService(new Service(this,"KeyAgreement", "SIKE-p751-compressed", "com.thatsdarlingmama.security.keyagreement.SIKEp751compressedKeyAgreementSpi", null, null));
    }
}
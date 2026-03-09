package p285z2;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class s00 extends m00 {
    private final MessageDigest OoooOoO;
    private final Mac OoooOoo;

    private s00(c10 c10Var, String str) {
        super(c10Var);
        try {
            this.OoooOoO = MessageDigest.getInstance(str);
            this.OoooOoo = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private s00(c10 c10Var, ByteString byteString, String str) {
        super(c10Var);
        try {
            Mac mac = Mac.getInstance(str);
            this.OoooOoo = mac;
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.OoooOoO = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static s00 OooooOo(c10 c10Var, ByteString byteString) {
        return new s00(c10Var, byteString, "HmacSHA1");
    }

    public static s00 Oooooo(c10 c10Var) {
        return new s00(c10Var, "MD5");
    }

    public static s00 Oooooo0(c10 c10Var, ByteString byteString) {
        return new s00(c10Var, byteString, "HmacSHA256");
    }

    public static s00 OoooooO(c10 c10Var) {
        return new s00(c10Var, "SHA-1");
    }

    public static s00 Ooooooo(c10 c10Var) {
        return new s00(c10Var, "SHA-256");
    }

    public final ByteString OooOO0() {
        MessageDigest messageDigest = this.OoooOoO;
        return ByteString.m17043of(messageDigest != null ? messageDigest.digest() : this.OoooOoo.doFinal());
    }

    @Override // p285z2.m00, p285z2.c10
    public long read(h00 h00Var, long j) throws IOException {
        long j2 = super.read(h00Var, j);
        if (j2 != -1) {
            long j3 = h00Var.OoooOoo;
            long j4 = j3 - j2;
            z00 z00Var = h00Var.OoooOoO;
            while (j3 > j4) {
                z00Var = z00Var.OooO0oO;
                j3 -= (long) (z00Var.OooO0OO - z00Var.OooO0O0);
            }
            while (j3 < h00Var.OoooOoo) {
                int i = (int) ((((long) z00Var.OooO0O0) + j4) - j3);
                MessageDigest messageDigest = this.OoooOoO;
                if (messageDigest != null) {
                    messageDigest.update(z00Var.OooO00o, i, z00Var.OooO0OO - i);
                } else {
                    this.OoooOoo.update(z00Var.OooO00o, i, z00Var.OooO0OO - i);
                }
                j4 = ((long) (z00Var.OooO0OO - z00Var.OooO0O0)) + j3;
                z00Var = z00Var.OooO0o;
                j3 = j4;
            }
        }
        return j2;
    }
}

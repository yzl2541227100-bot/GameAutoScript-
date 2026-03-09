package p285z2;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class r00 extends l00 {

    @Nullable
    private final MessageDigest OoooOoo;

    @Nullable
    private final Mac Ooooo00;

    private r00(b10 b10Var, String str) {
        super(b10Var);
        try {
            this.OoooOoo = MessageDigest.getInstance(str);
            this.Ooooo00 = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private r00(b10 b10Var, ByteString byteString, String str) {
        super(b10Var);
        try {
            Mac mac = Mac.getInstance(str);
            this.Ooooo00 = mac;
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.OoooOoo = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static r00 Oooooo(b10 b10Var, ByteString byteString) {
        return new r00(b10Var, byteString, "HmacSHA256");
    }

    public static r00 Oooooo0(b10 b10Var, ByteString byteString) {
        return new r00(b10Var, byteString, "HmacSHA1");
    }

    public static r00 OoooooO(b10 b10Var, ByteString byteString) {
        return new r00(b10Var, byteString, "HmacSHA512");
    }

    public static r00 Ooooooo(b10 b10Var) {
        return new r00(b10Var, "MD5");
    }

    public static r00 o00O0O(b10 b10Var) {
        return new r00(b10Var, "SHA-512");
    }

    public static r00 o0OoOo0(b10 b10Var) {
        return new r00(b10Var, "SHA-1");
    }

    public static r00 ooOO(b10 b10Var) {
        return new r00(b10Var, "SHA-256");
    }

    @Override // p285z2.l00, p285z2.b10
    public void OooOooO(h00 h00Var, long j) throws IOException {
        f10.OooO0O0(h00Var.OoooOoo, 0L, j);
        z00 z00Var = h00Var.OoooOoO;
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, z00Var.OooO0OO - z00Var.OooO0O0);
            MessageDigest messageDigest = this.OoooOoo;
            if (messageDigest != null) {
                messageDigest.update(z00Var.OooO00o, z00Var.OooO0O0, iMin);
            } else {
                this.Ooooo00.update(z00Var.OooO00o, z00Var.OooO0O0, iMin);
            }
            j2 += (long) iMin;
            z00Var = z00Var.OooO0o;
        }
        super.OooOooO(h00Var, j);
    }

    public final ByteString OooooOo() {
        MessageDigest messageDigest = this.OoooOoo;
        return ByteString.m17043of(messageDigest != null ? messageDigest.digest() : this.Ooooo00.doFinal());
    }
}

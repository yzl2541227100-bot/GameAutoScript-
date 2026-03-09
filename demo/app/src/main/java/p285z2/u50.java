package p285z2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* JADX INFO: loaded from: classes2.dex */
public class u50 {
    private Result OooO00o;

    public u50(List<Failure> list) {
        this(new t50(list).OooO00o());
    }

    private u50(Result result) {
        this.OooO00o = result;
    }

    public static u50 OooO0O0(Class<?> cls) {
        return OooO0OO(x80.OooO00o(cls));
    }

    public static u50 OooO0OO(x80 x80Var) {
        return new u50(new JUnitCore().OooO0oO(x80Var));
    }

    public int OooO00o() {
        return this.OooO00o.getFailures().size();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new t60(new PrintStream(byteArrayOutputStream)).OooO0o0(this.OooO00o);
        return byteArrayOutputStream.toString();
    }
}

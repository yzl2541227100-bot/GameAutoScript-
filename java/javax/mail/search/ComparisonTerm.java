package javax.mail.search;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComparisonTerm extends SearchTerm {

    /* JADX INFO: renamed from: EQ */
    public static final int f19536EQ = 3;

    /* JADX INFO: renamed from: GE */
    public static final int f19537GE = 6;

    /* JADX INFO: renamed from: GT */
    public static final int f19538GT = 5;

    /* JADX INFO: renamed from: LE */
    public static final int f19539LE = 1;

    /* JADX INFO: renamed from: LT */
    public static final int f19540LT = 2;

    /* JADX INFO: renamed from: NE */
    public static final int f19541NE = 4;
    private static final long serialVersionUID = 1456646953666474308L;
    public int comparison;

    public boolean equals(Object obj) {
        return (obj instanceof ComparisonTerm) && ((ComparisonTerm) obj).comparison == this.comparison;
    }

    public int hashCode() {
        return this.comparison;
    }
}

package com.sun.mail.imap;

/* JADX INFO: loaded from: classes2.dex */
public final class SortTerm {
    public static final SortTerm ARRIVAL = new SortTerm("ARRIVAL");

    /* JADX INFO: renamed from: CC */
    public static final SortTerm f18024CC = new SortTerm("CC");
    public static final SortTerm DATE = new SortTerm("DATE");
    public static final SortTerm FROM = new SortTerm("FROM");
    public static final SortTerm REVERSE = new SortTerm("REVERSE");
    public static final SortTerm SIZE = new SortTerm("SIZE");
    public static final SortTerm SUBJECT = new SortTerm("SUBJECT");

    /* JADX INFO: renamed from: TO */
    public static final SortTerm f18025TO = new SortTerm("TO");
    private String term;

    private SortTerm(String str) {
        this.term = str;
    }

    public final String toString() {
        return this.term;
    }
}

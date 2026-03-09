package org.junit.runner;

import p285z2.a90;
import p285z2.w80;

/* JADX INFO: loaded from: classes2.dex */
public interface FilterFactory {

    public static class FilterNotCreatedException extends Exception {
        public FilterNotCreatedException(Exception exc) {
            super(exc.getMessage(), exc);
        }
    }

    a90 OooO00o(w80 w80Var) throws FilterNotCreatedException;
}

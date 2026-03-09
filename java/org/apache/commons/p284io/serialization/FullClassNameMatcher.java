package org.apache.commons.p284io.serialization;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class FullClassNameMatcher implements ClassNameMatcher {
    private final Set<String> classesSet;

    public FullClassNameMatcher(String... strArr) {
        this.classesSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // org.apache.commons.p284io.serialization.ClassNameMatcher
    public final boolean matches(String str) {
        return this.classesSet.contains(str);
    }
}

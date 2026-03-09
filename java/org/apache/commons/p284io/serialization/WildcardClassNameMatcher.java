package org.apache.commons.p284io.serialization;

import org.apache.commons.p284io.FilenameUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class WildcardClassNameMatcher implements ClassNameMatcher {
    private final String pattern;

    public WildcardClassNameMatcher(String str) {
        this.pattern = str;
    }

    @Override // org.apache.commons.p284io.serialization.ClassNameMatcher
    public final boolean matches(String str) {
        return FilenameUtils.wildcardMatch(str, this.pattern);
    }
}

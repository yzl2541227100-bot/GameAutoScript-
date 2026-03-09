package org.apache.commons.p284io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class FileFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter FILE = new FileFileFilter();
    private static final long serialVersionUID = 5345244090827540862L;

    @Override // org.apache.commons.p284io.filefilter.AbstractFileFilter, org.apache.commons.p284io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file.isFile();
    }
}

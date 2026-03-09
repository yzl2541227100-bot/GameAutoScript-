package com.octopus.p222ad.internal.p226b.p227a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.a.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3086d {

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.a.d$a */
    public static final class a implements Comparator<File> {
        private a() {
        }

        /* JADX INFO: renamed from: a */
        private int m14260a(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return m14260a(file.lastModified(), file2.lastModified());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14255a(File file) throws IOException {
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
            }
        } else {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("File " + file + " is not directory!");
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<File> m14256b(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new a());
        return listAsList;
    }

    /* JADX INFO: renamed from: c */
    public static void m14257c(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            m14258d(file);
            if (file.lastModified() >= jCurrentTimeMillis) {
                return;
            }
            throw new IOException("Error set last modified date to " + file);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14258d(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            m14259e(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j = length - 1;
        randomAccessFile.seek(j);
        byte b = randomAccessFile.readByte();
        randomAccessFile.seek(j);
        randomAccessFile.write(b);
        randomAccessFile.close();
    }

    /* JADX INFO: renamed from: e */
    private static void m14259e(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException("Error recreate zero-size file " + file);
    }
}

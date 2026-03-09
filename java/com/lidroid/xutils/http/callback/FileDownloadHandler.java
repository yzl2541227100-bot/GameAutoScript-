package com.lidroid.xutils.http.callback;

/* JADX INFO: loaded from: classes2.dex */
public class FileDownloadHandler {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r14.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r17 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        r17.updateProgress(r11, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        com.lidroid.xutils.util.IOUtils.closeQuietly(r13);
        com.lidroid.xutils.util.IOUtils.closeQuietly(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r8.exists() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (android.text.TextUtils.isEmpty(r20) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        r0 = new java.io.File(r8.getParent(), r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r0.exists() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r8.renameTo(r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        r0 = new java.io.File(r8.getParent(), java.lang.String.valueOf(java.lang.System.currentTimeMillis()) + r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File handleEntity(org.apache.http.HttpEntity r16, com.lidroid.xutils.http.callback.RequestCallBackHandler r17, java.lang.String r18, boolean r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lidroid.xutils.http.callback.FileDownloadHandler.handleEntity(org.apache.http.HttpEntity, com.lidroid.xutils.http.callback.RequestCallBackHandler, java.lang.String, boolean, java.lang.String):java.io.File");
    }
}

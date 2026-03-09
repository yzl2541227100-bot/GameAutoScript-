package com.octopus.p222ad.internal.utilities;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import com.octopus.p222ad.internal.C3120m;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HTTPGet extends AsyncTask<Void, Void, HTTPResponse> {
    private static String TAG = "HTTPGet";
    private boolean mBinaryStream;

    public HTTPGet(boolean z) {
        this.mBinaryStream = false;
        this.mBinaryStream = z;
    }

    private HttpURLConnection createConnection(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("GET");
        return httpURLConnection;
    }

    private void setConnectionParams(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setRequestProperty("User-Agent", C3120m.m14425a().m14442h());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed A[PHI: r2
  0x00ed: PHI (r2v1 java.net.HttpURLConnection) = 
  (r2v0 java.net.HttpURLConnection)
  (r2v0 java.net.HttpURLConnection)
  (r2v0 java.net.HttpURLConnection)
  (r2v2 java.net.HttpURLConnection)
 binds: [B:30:0x00c1, B:33:0x00d7, B:35:0x00eb, B:24:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.octopus.p222ad.internal.utilities.HTTPResponse doInBackground(java.lang.Void... r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.utilities.HTTPGet.doInBackground(java.lang.Void[]):com.octopus.ad.internal.utilities.HTTPResponse");
    }

    public abstract String getUrl();

    @Override // android.os.AsyncTask
    @TargetApi(11)
    public void onCancelled(HTTPResponse hTTPResponse) {
        super.onCancelled((Object) null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.AsyncTask
    public abstract void onPostExecute(HTTPResponse hTTPResponse);
}

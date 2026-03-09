package com.anythink.core.api;

import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediationBidManager {
    public static final String NO_BID_TOKEN_ERROR = "NO_BID_TOKEN";
    public String mRequestUrl;

    public interface BidListener {
        void onBidFail(String str);

        void onBidStart(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter);

        void onBidSuccess(List<C1229av> list);
    }

    public abstract void notifyWinnerDisplay(String str, C1229av c1229av);

    public void setBidRequestUrl(String str) {
        this.mRequestUrl = str;
    }

    public abstract void startBid(C1202a c1202a, BidListener bidListener);
}

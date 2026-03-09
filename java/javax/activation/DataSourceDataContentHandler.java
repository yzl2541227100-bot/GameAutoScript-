package javax.activation;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class DataSourceDataContentHandler implements DataContentHandler {
    private DataContentHandler dch;

    /* JADX INFO: renamed from: ds */
    private DataSource f19520ds;
    private ActivationDataFlavor[] transferFlavors = null;

    public DataSourceDataContentHandler(DataContentHandler dataContentHandler, DataSource dataSource) {
        this.f19520ds = null;
        this.dch = null;
        this.f19520ds = dataSource;
        this.dch = dataContentHandler;
    }

    @Override // javax.activation.DataContentHandler
    public Object getContent(DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        return dataContentHandler != null ? dataContentHandler.getContent(dataSource) : dataSource.getInputStream();
    }

    @Override // javax.activation.DataContentHandler
    public Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            return dataContentHandler.getTransferData(activationDataFlavor, dataSource);
        }
        if (activationDataFlavor.equals(getTransferDataFlavors()[0])) {
            return dataSource.getInputStream();
        }
        throw new IOException("Unsupported DataFlavor: ".concat(String.valueOf(activationDataFlavor)));
    }

    @Override // javax.activation.DataContentHandler
    public ActivationDataFlavor[] getTransferDataFlavors() {
        if (this.transferFlavors == null) {
            DataContentHandler dataContentHandler = this.dch;
            if (dataContentHandler != null) {
                this.transferFlavors = dataContentHandler.getTransferDataFlavors();
            } else {
                this.transferFlavors = new ActivationDataFlavor[]{new ActivationDataFlavor(this.f19520ds.getContentType(), this.f19520ds.getContentType())};
            }
        }
        return this.transferFlavors;
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            dataContentHandler.writeTo(obj, str, outputStream);
        } else {
            throw new UnsupportedDataTypeException("no DCH for content type " + this.f19520ds.getContentType());
        }
    }
}

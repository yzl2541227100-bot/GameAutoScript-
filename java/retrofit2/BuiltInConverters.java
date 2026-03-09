package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import p285z2.AbstractC4262px;
import p285z2.AbstractC4336rx;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    public static final class BufferingResponseBodyConverter implements Converter<AbstractC4336rx, AbstractC4336rx> {
        public static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public AbstractC4336rx convert(AbstractC4336rx abstractC4336rx) throws IOException {
            try {
                return Utils.buffer(abstractC4336rx);
            } finally {
                abstractC4336rx.close();
            }
        }
    }

    public static final class RequestBodyConverter implements Converter<AbstractC4262px, AbstractC4262px> {
        public static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public AbstractC4262px convert(AbstractC4262px abstractC4262px) {
            return abstractC4262px;
        }
    }

    public static final class StreamingResponseBodyConverter implements Converter<AbstractC4336rx, AbstractC4336rx> {
        public static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public AbstractC4336rx convert(AbstractC4336rx abstractC4336rx) {
            return abstractC4336rx;
        }
    }

    public static final class ToStringConverter implements Converter<Object, String> {
        public static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class UnitResponseBodyConverter implements Converter<AbstractC4336rx, Unit> {
        public static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public Unit convert(AbstractC4336rx abstractC4336rx) {
            abstractC4336rx.close();
            return Unit.INSTANCE;
        }
    }

    public static final class VoidResponseBodyConverter implements Converter<AbstractC4336rx, Void> {
        public static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(AbstractC4336rx abstractC4336rx) {
            abstractC4336rx.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, AbstractC4262px> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (AbstractC4262px.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<AbstractC4336rx, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == AbstractC4336rx.class) {
            return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.INSTANCE : BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (!this.checkForKotlinUnit || type != Unit.class) {
            return null;
        }
        try {
            return UnitResponseBodyConverter.INSTANCE;
        } catch (NoClassDefFoundError unused) {
            this.checkForKotlinUnit = false;
            return null;
        }
    }
}

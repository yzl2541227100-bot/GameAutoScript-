package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p285z2.AbstractC4336rx;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class OptionalConverterFactory extends Converter.Factory {
    public static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    @IgnoreJRERequirement
    public static final class OptionalConverter<T> implements Converter<AbstractC4336rx, Optional<T>> {
        public final Converter<AbstractC4336rx, T> delegate;

        public OptionalConverter(Converter<AbstractC4336rx, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(AbstractC4336rx abstractC4336rx) throws IOException {
            return Optional.ofNullable(this.delegate.convert(abstractC4336rx));
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<AbstractC4336rx, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}

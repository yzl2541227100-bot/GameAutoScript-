package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import p285z2.AbstractC4336rx;
import p285z2.C4299qx;
import p285z2.InterfaceC4335rw;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final InterfaceC4335rw.OooO00o callFactory;
    private final RequestFactory requestFactory;
    private final Converter<AbstractC4336rx, ResponseT> responseConverter;

    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(RequestFactory requestFactory, InterfaceC4335rw.OooO00o oooO00o, Converter<AbstractC4336rx, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, oooO00o, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        public SuspendForBody(RequestFactory requestFactory, InterfaceC4335rw.OooO00o oooO00o, Converter<AbstractC4336rx, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z) {
            super(requestFactory, oooO00o, converter);
            this.callAdapter = callAdapter;
            this.isNullable = z;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            return this.isNullable ? KotlinExtensions.awaitNullable(callAdapt, continuation) : KotlinExtensions.await(callAdapt, continuation);
        }
    }

    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        public SuspendForResponse(RequestFactory requestFactory, InterfaceC4335rw.OooO00o oooO00o, Converter<AbstractC4336rx, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, oooO00o, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            return KotlinExtensions.awaitResponse(this.callAdapter.adapt(call), (Continuation) objArr[objArr.length - 1]);
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, InterfaceC4335rw.OooO00o oooO00o, Converter<AbstractC4336rx, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = oooO00o;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<AbstractC4336rx, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z;
        boolean z3 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z3) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) == Response.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        CallAdapter callAdapterCreateCallAdapter = createCallAdapter(retrofit, method, genericReturnType, annotations);
        Type typeResponseType = callAdapterCreateCallAdapter.responseType();
        if (typeResponseType == C4299qx.class) {
            throw Utils.methodError(method, "'" + Utils.getRawType(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(typeResponseType)) {
            throw Utils.methodError(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        Converter converterCreateResponseConverter = createResponseConverter(retrofit, method, typeResponseType);
        InterfaceC4335rw.OooO00o oooO00o = retrofit.callFactory;
        return !z3 ? new CallAdapted(requestFactory, oooO00o, converterCreateResponseConverter, callAdapterCreateCallAdapter) : z ? new SuspendForResponse(requestFactory, oooO00o, converterCreateResponseConverter, callAdapterCreateCallAdapter) : new SuspendForBody(requestFactory, oooO00o, converterCreateResponseConverter, callAdapterCreateCallAdapter, false);
    }

    @Nullable
    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    @Override // retrofit2.ServiceMethod
    @Nullable
    public final ReturnT invoke(Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, objArr, this.callFactory, this.responseConverter), objArr);
    }
}

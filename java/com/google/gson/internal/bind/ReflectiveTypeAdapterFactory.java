package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 */
    public class C28001 extends BoundField {
        public final /* synthetic */ Gson val$context;
        public final /* synthetic */ Field val$field;
        public final /* synthetic */ TypeToken val$fieldType;
        public final /* synthetic */ boolean val$isPrimitive;
        public final /* synthetic */ boolean val$jsonAdapterPresent;
        public final /* synthetic */ TypeAdapter val$typeAdapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28001(String str, boolean z, boolean z3, Field field, boolean z4, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z5) {
            super(str, z, z3);
            field = field;
            z = z4;
            typeAdapter = typeAdapter;
            gson = gson;
            typeToken = typeToken;
            z = z5;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        public void read(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = typeAdapter.read(jsonReader);
            if (obj2 == null && z) {
                return;
            }
            field.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            (z ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, typeToken.getType())).write(jsonWriter, field.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        public boolean writeField(Object obj) throws IllegalAccessException, IOException {
            return this.serialized && field.get(obj) != obj;
        }
    }

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;

        public Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T tConstruct = this.constructor.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField == null || !boundField.deserialized) {
                        jsonReader.skipValue();
                    } else {
                        boundField.read(jsonReader, tConstruct);
                    }
                }
                jsonReader.endObject();
                return tConstruct;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (BoundField boundField : this.boundFields.values()) {
                    if (boundField.writeField(t)) {
                        jsonWriter.name(boundField.name);
                        boundField.write(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static abstract class BoundField {
        public final boolean deserialized;
        public final String name;
        public final boolean serialized;

        public BoundField(String str, boolean z, boolean z3) {
            this.name = str;
            this.serialized = z;
            this.deserialized = z3;
        }

        public abstract void read(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean writeField(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private BoundField createBoundField(Gson gson, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z3) {
        boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter) : null;
        boolean z4 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        return new BoundField(str, z, z3) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            public final /* synthetic */ Gson val$context;
            public final /* synthetic */ Field val$field;
            public final /* synthetic */ TypeToken val$fieldType;
            public final /* synthetic */ boolean val$isPrimitive;
            public final /* synthetic */ boolean val$jsonAdapterPresent;
            public final /* synthetic */ TypeAdapter val$typeAdapter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28001(String str2, boolean z5, boolean z32, Field field2, boolean z42, TypeAdapter typeAdapter2, Gson gson2, TypeToken typeToken2, boolean zIsPrimitive2) {
                super(str2, z5, z32);
                field = field2;
                z = z42;
                typeAdapter = typeAdapter2;
                gson = gson2;
                typeToken = typeToken2;
                z = zIsPrimitive2;
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void read(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
                Object obj2 = typeAdapter.read(jsonReader);
                if (obj2 == null && z) {
                    return;
                }
                field.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
                (z ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, typeToken.getType())).write(jsonWriter, field.get(obj));
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public boolean writeField(Object obj) throws IllegalAccessException, IOException {
                return this.serialized && field.get(obj) != obj;
            }
        };
    }

    public static boolean excludeField(Field field, boolean z, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }

    private Map<String, BoundField> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean zExcludeField = excludeField(field, true);
                boolean zExcludeField2 = excludeField(field, z);
                if (zExcludeField || zExcludeField2) {
                    this.accessor.makeAccessible(field);
                    Type typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                    List<String> fieldNames = getFieldNames(field);
                    int size = fieldNames.size();
                    BoundField boundField = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = fieldNames.get(i2);
                        boolean z3 = i2 != 0 ? false : zExcludeField;
                        int i3 = i2;
                        BoundField boundField2 = boundField;
                        int i4 = size;
                        List<String> list = fieldNames;
                        Field field2 = field;
                        boundField = boundField2 == null ? (BoundField) linkedHashMap.put(str, createBoundField(gson, field, str, TypeToken.get(typeResolve), z3, zExcludeField2)) : boundField2;
                        i2 = i3 + 1;
                        zExcludeField = z3;
                        fieldNames = list;
                        size = i4;
                        field = field2;
                    }
                    BoundField boundField3 = boundField;
                    if (boundField3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + boundField3.name);
                    }
                }
                i++;
                z = false;
            }
            typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        String strValue = serializedName.value();
        String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new Adapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType));
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z) {
        return excludeField(field, z, this.excluder);
    }
}

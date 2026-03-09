package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.p284io.FilenameUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessage extends AbstractMessageLite implements Message {
    private int memoizedSize = -1;

    public static abstract class Builder<BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> implements Message.Builder {

        /* JADX INFO: renamed from: $SWITCH_TABLE$com$google$protobuf$Descriptors$FieldDescriptor$Type */
        private static /* synthetic */ int[] f16076x792aeea3;

        /* JADX INFO: renamed from: $SWITCH_TABLE$com$google$protobuf$Descriptors$FieldDescriptor$Type */
        public static /* synthetic */ int[] m13221x792aeea3() {
            int[] iArr = f16076x792aeea3;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[Descriptors.FieldDescriptor.Type.values().length];
            try {
                iArr2[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 10;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 15;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 16;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 17;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f16076x792aeea3 = iArr2;
            return iArr2;
        }

        private static void addRepeatedField(Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet, Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (builder != null) {
                builder.addRepeatedField(fieldDescriptor, obj);
            } else {
                fieldSet.addRepeatedField(fieldDescriptor, obj);
            }
        }

        private static void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, ExtensionRegistry.ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet) throws IOException {
            Message messageBuildPartial;
            Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
            if (hasOriginalMessage(builder, fieldSet, fieldDescriptor)) {
                Message.Builder builder2 = getOriginalMessage(builder, fieldSet, fieldDescriptor).toBuilder();
                codedInputStream.readMessage(builder2, extensionRegistryLite);
                messageBuildPartial = builder2.buildPartial();
            } else {
                messageBuildPartial = (Message) codedInputStream.readMessage(extensionInfo.defaultInstance.getParserForType(), extensionRegistryLite);
            }
            if (builder != null) {
                builder.setField(fieldDescriptor, messageBuildPartial);
            } else {
                fieldSet.setField(fieldDescriptor, messageBuildPartial);
            }
        }

        public static List<String> findMissingFields(MessageOrBuilder messageOrBuilder) {
            ArrayList arrayList = new ArrayList();
            findMissingFields(messageOrBuilder, "", arrayList);
            return arrayList;
        }

        private static void findMissingFields(MessageOrBuilder messageOrBuilder, String str, List<String> list) {
            for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                    list.add(String.valueOf(str) + fieldDescriptor.getName());
                }
            }
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
                Descriptors.FieldDescriptor key = entry.getKey();
                Object value = entry.getValue();
                if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (key.isRepeated()) {
                        int i = 0;
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            findMissingFields((MessageOrBuilder) it.next(), subMessagePrefix(str, key, i), list);
                            i++;
                        }
                    } else if (messageOrBuilder.hasField(key)) {
                        findMissingFields((MessageOrBuilder) value, subMessagePrefix(str, key, -1), list);
                    }
                }
            }
        }

        private static Message getOriginalMessage(Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet, Descriptors.FieldDescriptor fieldDescriptor) {
            return (Message) (builder != null ? builder.getField(fieldDescriptor) : fieldSet.getField(fieldDescriptor));
        }

        private static boolean hasOriginalMessage(Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet, Descriptors.FieldDescriptor fieldDescriptor) {
            return builder != null ? builder.hasField(fieldDescriptor) : fieldSet.hasField(fieldDescriptor);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean mergeFieldFrom(com.google.protobuf.CodedInputStream r7, com.google.protobuf.UnknownFieldSet.Builder r8, com.google.protobuf.ExtensionRegistryLite r9, com.google.protobuf.Descriptors.Descriptor r10, com.google.protobuf.Message.Builder r11, com.google.protobuf.FieldSet<com.google.protobuf.Descriptors.FieldDescriptor> r12, int r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractMessage.Builder.mergeFieldFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.UnknownFieldSet$Builder, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.Descriptors$Descriptor, com.google.protobuf.Message$Builder, com.google.protobuf.FieldSet, int):boolean");
        }

        private static void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistry.ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet) throws IOException {
            Message partialFrom;
            Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
            boolean zHasOriginalMessage = hasOriginalMessage(builder, fieldSet, fieldDescriptor);
            if (zHasOriginalMessage || ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                if (zHasOriginalMessage) {
                    Message.Builder builder2 = getOriginalMessage(builder, fieldSet, fieldDescriptor).toBuilder();
                    builder2.mergeFrom(byteString, extensionRegistryLite);
                    partialFrom = builder2.buildPartial();
                } else {
                    partialFrom = extensionInfo.defaultInstance.getParserForType().parsePartialFrom(byteString, extensionRegistryLite);
                }
                setField(builder, fieldSet, fieldDescriptor, partialFrom);
                return;
            }
            LazyField lazyField = new LazyField(extensionInfo.defaultInstance, extensionRegistryLite, byteString);
            if (builder == null) {
                fieldSet.setField(fieldDescriptor, lazyField);
            } else if (builder instanceof GeneratedMessage.ExtendableBuilder) {
                builder.setField(fieldDescriptor, lazyField);
            } else {
                builder.setField(fieldDescriptor, lazyField.getValue());
            }
        }

        private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptors.Descriptor descriptor, Message.Builder builder2, FieldSet<Descriptors.FieldDescriptor> fieldSet) throws IOException {
            int uInt32 = 0;
            ByteString bytes = null;
            ExtensionRegistry.ExtensionInfo extensionInfoFindExtensionByNumber = null;
            while (true) {
                int tag = codedInputStream.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = codedInputStream.readUInt32();
                    if (uInt32 != 0 && (extensionRegistryLite instanceof ExtensionRegistry)) {
                        extensionInfoFindExtensionByNumber = ((ExtensionRegistry) extensionRegistryLite).findExtensionByNumber(descriptor, uInt32);
                    }
                } else if (tag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 == 0 || extensionInfoFindExtensionByNumber == null || !ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                        bytes = codedInputStream.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, extensionInfoFindExtensionByNumber, extensionRegistryLite, builder2, fieldSet);
                        bytes = null;
                    }
                } else if (!codedInputStream.skipField(tag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (extensionInfoFindExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, extensionInfoFindExtensionByNumber, extensionRegistryLite, builder2, fieldSet);
            } else {
                builder.mergeField(uInt32, UnknownFieldSet.Field.newBuilder().addLengthDelimited(bytes).build());
            }
        }

        private static void mergeOriginalMessage(Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet, Descriptors.FieldDescriptor fieldDescriptor, Message.Builder builder2) {
            Message originalMessage = getOriginalMessage(builder, fieldSet, fieldDescriptor);
            if (originalMessage != null) {
                builder2.mergeFrom(originalMessage);
            }
        }

        public static UninitializedMessageException newUninitializedMessageException(Message message) {
            return new UninitializedMessageException(findMissingFields(message));
        }

        private static void setField(Message.Builder builder, FieldSet<Descriptors.FieldDescriptor> fieldSet, Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (builder != null) {
                builder.setField(fieldDescriptor, obj);
            } else {
                fieldSet.setField(fieldDescriptor, obj);
            }
        }

        private static String subMessagePrefix(String str, Descriptors.FieldDescriptor fieldDescriptor, int i) {
            StringBuilder sb = new StringBuilder(str);
            if (fieldDescriptor.isExtension()) {
                sb.append('(');
                sb.append(fieldDescriptor.getFullName());
                sb.append(')');
            } else {
                sb.append(fieldDescriptor.getName());
            }
            if (i != -1) {
                sb.append('[');
                sb.append(i);
                sb.append(']');
            }
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            return sb.toString();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType clear() {
            Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField(it.next().getKey());
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo17061clone();

        @Override // com.google.protobuf.MessageOrBuilder
        public List<String> findInitializationErrors() {
            return findMissingFields(this);
        }

        @Override // com.google.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public String getInitializationErrorString() {
            return AbstractMessage.delimitWithCommas(findInitializationErrors());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return super.mergeDelimitedFrom(inputStream);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeDelimitedFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream) throws IOException {
            return (BuilderType) mergeFrom(codedInputStream, (ExtensionRegistryLite) ExtensionRegistry.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int tag;
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder(getUnknownFields());
            do {
                tag = codedInputStream.readTag();
                if (tag == 0) {
                    break;
                }
            } while (mergeFieldFrom(codedInputStream, builderNewBuilder, extensionRegistryLite, getDescriptorForType(), this, null, tag));
            setUnknownFields(builderNewBuilder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public BuilderType mergeFrom(com.google.protobuf.Message r6) {
            /*
                r5 = this;
                com.google.protobuf.Descriptors$Descriptor r0 = r6.getDescriptorForType()
                com.google.protobuf.Descriptors$Descriptor r1 = r5.getDescriptorForType()
                if (r0 != r1) goto L83
                java.util.Map r0 = r6.getAllFields()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r1 = r0.hasNext()
                if (r1 != 0) goto L24
                com.google.protobuf.UnknownFieldSet r6 = r6.getUnknownFields()
                r5.mergeUnknownFields(r6)
                return r5
            L24:
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                com.google.protobuf.Descriptors$FieldDescriptor r2 = (com.google.protobuf.Descriptors.FieldDescriptor) r2
                boolean r3 = r2.isRepeated()
                if (r3 == 0) goto L4f
                java.lang.Object r1 = r1.getValue()
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r3 = r1.iterator()
            L40:
                boolean r1 = r3.hasNext()
                if (r1 != 0) goto L47
                goto L16
            L47:
                java.lang.Object r1 = r3.next()
                r5.addRepeatedField(r2, r1)
                goto L40
            L4f:
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType r3 = r2.getJavaType()
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType r4 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE
                if (r3 != r4) goto L7b
                java.lang.Object r3 = r5.getField(r2)
                com.google.protobuf.Message r3 = (com.google.protobuf.Message) r3
                com.google.protobuf.Message r4 = r3.getDefaultInstanceForType()
                if (r3 != r4) goto L64
                goto L7b
            L64:
                com.google.protobuf.Message$Builder r4 = r3.newBuilderForType()
                com.google.protobuf.Message$Builder r3 = r4.mergeFrom(r3)
                java.lang.Object r1 = r1.getValue()
                com.google.protobuf.Message r1 = (com.google.protobuf.Message) r1
                com.google.protobuf.Message$Builder r1 = r3.mergeFrom(r1)
                com.google.protobuf.Message r1 = r1.build()
                goto L7f
            L7b:
                java.lang.Object r1 = r1.getValue()
            L7f:
                r5.setField(r2, r1)
                goto L16
            L83:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "mergeFrom(Message) can only merge messages of the same type."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractMessage.Builder.mergeFrom(com.google.protobuf.Message):com.google.protobuf.AbstractMessage$Builder");
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            return (BuilderType) super.mergeFrom(inputStream);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BuilderType) super.mergeFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, i, i2, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.Message.Builder
        public BuilderType mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            setUnknownFields(UnknownFieldSet.newBuilder(getUnknownFields()).mergeFrom(unknownFieldSet).build());
            return this;
        }
    }

    public static String delimitWithCommas(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashEnum(Internal.EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends Internal.EnumLite> list) {
        Iterator<? extends Internal.EnumLite> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return getDescriptorForType() == message.getDescriptorForType() && getAllFields().equals(message.getAllFields()) && getUnknownFields().equals(message.getUnknownFields());
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public List<String> findInitializationErrors() {
        return Builder.findMissingFields(this);
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public String getInitializationErrorString() {
        return delimitWithCommas(findInitializationErrors());
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSetExtensionSize = 0;
        boolean messageSetWireFormat = getDescriptorForType().getOptions().getMessageSetWireFormat();
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            iComputeMessageSetExtensionSize += (messageSetWireFormat && key.isExtension() && key.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) ? CodedOutputStream.computeMessageSetExtensionSize(key.getNumber(), (Message) value) : FieldSet.computeFieldSize(key, value);
        }
        UnknownFieldSet unknownFields = getUnknownFields();
        int serializedSizeAsMessageSet = iComputeMessageSetExtensionSize + (messageSetWireFormat ? unknownFields.getSerializedSizeAsMessageSet() : unknownFields.getSerializedSize());
        this.memoizedSize = serializedSizeAsMessageSet;
        return serializedSizeAsMessageSet;
    }

    @Override // com.google.protobuf.Message
    public int hashCode() {
        return (hashFields(getDescriptorForType().hashCode() + 779, getAllFields()) * 29) + getUnknownFields().hashCode();
    }

    public int hashFields(int i, Map<Descriptors.FieldDescriptor, Object> map) {
        int i2;
        int iHashEnum;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            int number = (i * 37) + key.getNumber();
            if (key.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                i2 = number * 53;
                iHashEnum = value.hashCode();
            } else if (key.isRepeated()) {
                i2 = number * 53;
                iHashEnum = hashEnumList((List) value);
            } else {
                i2 = number * 53;
                iHashEnum = hashEnum((Internal.EnumLite) value);
            }
            i = i2 + iHashEnum;
        }
        return i;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                boolean zIsRepeated = key.isRepeated();
                Object value = entry.getValue();
                if (zIsRepeated) {
                    Iterator it = ((List) value).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((Message) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public UninitializedMessageException newUninitializedMessageException() {
        return Builder.newUninitializedMessageException((Message) this);
    }

    @Override // com.google.protobuf.Message
    public final String toString() {
        return TextFormat.printToString(this);
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean messageSetWireFormat = getDescriptorForType().getOptions().getMessageSetWireFormat();
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && key.isExtension() && key.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) {
                codedOutputStream.writeMessageSetExtension(key.getNumber(), (Message) value);
            } else {
                FieldSet.writeField(key, value, codedOutputStream);
            }
        }
        UnknownFieldSet unknownFields = getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }
}

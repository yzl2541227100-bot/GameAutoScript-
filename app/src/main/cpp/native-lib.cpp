#include <jni.h>
#include <string>
#include <android/log.h>

#define TAG "MqmNative"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)

// 包名前缀 — 需要两层宏才能正确拼接 token
#define JNI_PREFIX2(prefix, name) prefix##name
#define JNI_PREFIX(name) JNI_PREFIX2(Java_com_example_myapplication_engine_NativeJni_, name)

extern "C" {

// ==================== ElfinNativeJni ====================

JNIEXPORT jint JNICALL JNI_PREFIX(initBaseParam)(
    JNIEnv *env, jobject, jobject context, jstring appPath, jstring dataPath, jstring arch) {
    const char *a = env->GetStringUTFChars(appPath, nullptr);
    const char *d = env->GetStringUTFChars(dataPath, nullptr);
    const char *ar = env->GetStringUTFChars(arch, nullptr);
    LOGD("initBaseParam: app=%s data=%s arch=%s", a, d, ar);
    env->ReleaseStringUTFChars(appPath, a);
    env->ReleaseStringUTFChars(dataPath, d);
    env->ReleaseStringUTFChars(arch, ar);
    return 0;
}

JNIEXPORT jstring JNICALL JNI_PREFIX(getString)(JNIEnv *env, jobject, jstring key) {
    return env->NewStringUTF("");
}

JNIEXPORT jstring JNICALL JNI_PREFIX(requestDomain)(JNIEnv *env, jobject, jint type) {
    return env->NewStringUTF("");
}

JNIEXPORT jint JNICALL JNI_PREFIX(setKeys)(JNIEnv *env, jobject, jstring pub, jstring priv) {
    return 0;
}

JNIEXPORT jstring JNICALL JNI_PREFIX(executeCommand)(JNIEnv *env, jobject, jstring cmd, jstring args) {
    const char *c = env->GetStringUTFChars(cmd, nullptr);
    const char *a = env->GetStringUTFChars(args, nullptr);
    LOGD("executeCommand: %s %s", c, a);
    env->ReleaseStringUTFChars(cmd, c);
    env->ReleaseStringUTFChars(args, a);
    return env->NewStringUTF("ok");
}

JNIEXPORT void JNICALL JNI_PREFIX(release)(JNIEnv *, jobject) {
    LOGD("release");
}

// ==================== MQLanguageStub ====================

JNIEXPORT void JNICALL JNI_PREFIX(enginInit)(JNIEnv *, jobject) { LOGD("enginInit"); }
JNIEXPORT void JNICALL JNI_PREFIX(initRunner)(JNIEnv *, jobject, jobject, jstring) { LOGD("initRunner"); }

JNIEXPORT jint JNICALL JNI_PREFIX(compile)(JNIEnv *, jobject, jstring, jstring, jstring, jint) {
    LOGD("compile"); return 0;
}

JNIEXPORT jint JNICALL JNI_PREFIX(run)(JNIEnv *, jobject, jstring, jstring, jstring, jint, jint, jlong, jstring) {
    LOGD("run"); return 0;
}

JNIEXPORT jint JNICALL JNI_PREFIX(pause)(JNIEnv *, jobject) { LOGD("pause"); return 0; }
JNIEXPORT jint JNICALL JNI_PREFIX(resume)(JNIEnv *, jobject) { LOGD("resume"); return 0; }
JNIEXPORT jint JNICALL JNI_PREFIX(stop)(JNIEnv *, jobject) { LOGD("stop"); return 0; }
JNIEXPORT void JNICALL JNI_PREFIX(quitApp)(JNIEnv *, jobject) { LOGD("quitApp"); }

JNIEXPORT void JNICALL JNI_PREFIX(setLocalDir)(JNIEnv *, jobject, jstring, jstring, jstring, jstring) {}
JNIEXPORT void JNICALL JNI_PREFIX(setProcess)(JNIEnv *, jobject, jstring) {}
JNIEXPORT void JNICALL JNI_PREFIX(setSid)(JNIEnv *, jobject, jlong) {}
JNIEXPORT void JNICALL JNI_PREFIX(setWriteLog2File)(JNIEnv *, jobject, jboolean) {}
JNIEXPORT void JNICALL JNI_PREFIX(setIsAccessibility)(JNIEnv *, jobject, jboolean) {}
JNIEXPORT void JNICALL JNI_PREFIX(setRegCode)(JNIEnv *, jobject, jstring) {}
JNIEXPORT void JNICALL JNI_PREFIX(setHeartBeatTime)(JNIEnv *, jobject, jint, jint) {}
JNIEXPORT void JNICALL JNI_PREFIX(sendFloatEvent)(JNIEnv *, jobject, jbyteArray) {}
JNIEXPORT void JNICALL JNI_PREFIX(request)(JNIEnv *, jobject, jstring) {}
JNIEXPORT void JNICALL JNI_PREFIX(setScreenInfo)(JNIEnv *, jobject, jfloat, jfloat) {}

// ==================== MQUipStub ====================

JNIEXPORT jint JNICALL JNI_PREFIX(startLoop)(JNIEnv *, jobject, jstring, jlong, jstring, jstring) {
    LOGD("startLoop"); return 0;
}

JNIEXPORT jint JNICALL JNI_PREFIX(startLoopBytes)(JNIEnv *, jobject, jbyteArray, jlong) {
    LOGD("startLoopBytes"); return 0;
}

JNIEXPORT jboolean JNICALL JNI_PREFIX(stopLoop)(JNIEnv *, jobject) {
    LOGD("stopLoop"); return JNI_TRUE;
}

// ==================== MQAuxiliary ====================

JNIEXPORT void JNICALL JNI_PREFIX(auxInit)(JNIEnv *, jobject) { LOGD("auxInit"); }
JNIEXPORT void JNICALL JNI_PREFIX(auxClear)(JNIEnv *, jobject) { LOGD("auxClear"); }

JNIEXPORT jbyteArray JNICALL JNI_PREFIX(screenCap)(JNIEnv *env, jobject, jintArray outSize) {
    LOGD("screenCap - use ScreenShoterV3 for MediaProjection capture");
    // 返回空 - 实际截图通过 ScreenShoterV3 (MediaProjection) 实现
    // 此函数保留用于兼容性
    if (outSize != nullptr) {
        jint size[2] = {0, 0};
        env->SetIntArrayRegion(outSize, 0, 2, size);
    }
    return env->NewByteArray(0);
}

JNIEXPORT void JNICALL JNI_PREFIX(keepCapture)(JNIEnv *, jobject, jboolean) {}

JNIEXPORT jint JNICALL JNI_PREFIX(compareColorEx)(JNIEnv *env, jobject, jstring colorDesc, jfloat similarity) {
    // 颜色比较在 Kotlin 层 GameColorHelper 中实现
    // 此处保留 stub 用于兼容
    LOGD("compareColorEx - delegated to Kotlin GameColorHelper");
    return 0;
}

JNIEXPORT jboolean JNICALL JNI_PREFIX(findMultiColor)(
    JNIEnv *env, jobject, jint left, jint top, jint right, jint bottom,
    jstring firstColor, jstring offsetColors, jint dir, jfloat similarity, jintArray result) {
    // 多点找色在 Kotlin 层 GameColorHelper 中实现
    LOGD("findMultiColor - delegated to Kotlin GameColorHelper");
    return JNI_FALSE;
}

JNIEXPORT void JNICALL JNI_PREFIX(setImageCrop)(JNIEnv *, jobject, jboolean, jint, jint, jint, jint) {}
JNIEXPORT void JNICALL JNI_PREFIX(setScreenRotation)(JNIEnv *, jobject, jint) {}
JNIEXPORT void JNICALL JNI_PREFIX(setScreenScale)(JNIEnv *, jobject, jfloat, jfloat) {}
JNIEXPORT jint JNICALL JNI_PREFIX(waitKey)(JNIEnv *, jobject) { return 0; }

} // extern "C"

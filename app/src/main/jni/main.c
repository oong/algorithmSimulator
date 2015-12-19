#include "com_oong_as_algorithmsimulator_activity_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_oong_as_algorithmsimulator_activity_MainActivity_getStringFromNative(JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "hello jni !");
}
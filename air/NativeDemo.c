#include "NativeDemo.h"
#include <stdio.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_NativeDemo_test
  (JNIEnv * env, jclass c){
        printf("Hello, JNI!\n");
  }

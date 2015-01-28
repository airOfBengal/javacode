LOCAL_PATH := $(call my-dir)
 
#
# 3rd party prebuilt AVI library
#
include $(CLEAR_VARS)
 
LOCAL_MODULE    := NativeDemo
LOCAL_SRC_FILES := NativeDemo.dll
 
include $(PREBUILT_SHARED_LIBRARY)

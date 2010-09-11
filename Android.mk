LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-subdir-java-files) 

LOCAL_STATIC_JAVA_LIBRARIES := android-common

LOCAL_PACKAGE_NAME := BuglabsDemo

#Disable building the APK; we are checking in the pre-built version which
#contains the credential plug-in instead. Note the libwbxml_jni has to be
#enabled because so won't be extracted from the system APK

include $(BUILD_PACKAGE)


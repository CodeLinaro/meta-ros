# Copyright (c) 2021 LG Electronics, Inc.

DEPENDS += "ament-cmake-native"

BBCLASSEXTEND = "native nativesdk"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Copyright (c) 2021 LG Electronics, Inc.
# Copyright (c) 2024 Wind River Systems, Inc.


FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://allow-new-octomap-version.patch"

inherit pkgconfig

ROS_BUILD_DEPENDS += "octomap"

# ERROR: geometric-shapes-2.0.0-1-r0 do_package_qa: QA Issue:
# non -dev/-dbg/nativesdk- package contains symlink .so: geometric-shapes path '/work/raspberrypi4-webos-linux-gnueabi/geometric-shapes/2.0.0-1-r0/packages-split/geometric-shapes/usr/lib/libgeometric_shapes.so' [dev-so]
inherit ros_insane_dev_so

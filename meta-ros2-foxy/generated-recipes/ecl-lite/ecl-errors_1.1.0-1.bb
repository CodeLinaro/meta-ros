# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "This library provides lean and mean error mechanisms.     It includes c style error functions as well as a few     useful macros. For higher level mechanisms,     refer to ecl_exceptions."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_errors"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_lite"
ROS_BPN = "ecl_errors"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-license \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-config \
    ecl-license \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/ecl_lite-release/archive/release/foxy/ecl_errors/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/ecl_errors"
SRC_URI = "git://github.com/yujinrobot-release/ecl_lite-release;${ROS_BRANCH};protocol=https"
SRCREV = "6516c981d43a1424648a7488c93e90bc982a867c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

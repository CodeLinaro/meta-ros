# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "C++ stdlib-compatible wrapper around tlsf allocator and ROS2 examples"
AUTHOR = "Brandon Ong <brandon@openrobotics.org>"
ROS_AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GNU Lesser Public License 2.1 & Apache License 2.0"
LICENSE = "LGPL-2.1-only & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3badeab1074cb0c993003745c15d12f0"

ROS_CN = "realtime_support"
ROS_BPN = "tlsf_cpp"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    rclcpp \
    rmw \
    std-msgs \
    tlsf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    rclcpp \
    rmw \
    std-msgs \
    tlsf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rmw-implementation-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/realtime_support-release/archive/release/rolling/tlsf_cpp/0.18.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/tlsf_cpp"
SRC_URI = "git://github.com/ros2-gbp/realtime_support-release;${ROS_BRANCH};protocol=https"
SRCREV = "b42ac9300575905a2b6a4b0c371f5635352f5bbf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "The fuse_viz package provides visualization tools for fuse."
AUTHOR = "Enrique Fernandez <efernandez@clearpath.ai>"
ROS_AUTHOR = "Enrique Fernandez <efernandez@clearpath.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fuse"
ROS_BPN = "fuse_viz"

ROS_BUILD_DEPENDS = " \
    fuse-constraints \
    fuse-core \
    fuse-msgs \
    fuse-variables \
    geometry-msgs \
    libeigen \
    qtbase \
    rviz-common \
    rviz-rendering \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    fuse-constraints \
    fuse-core \
    fuse-msgs \
    fuse-variables \
    geometry-msgs \
    libeigen \
    rviz-common \
    rviz-rendering \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fuse-constraints \
    fuse-core \
    fuse-msgs \
    fuse-variables \
    geometry-msgs \
    libeigen \
    rviz-common \
    rviz-rendering \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/fuse-release/archive/release/rolling/fuse_viz/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/fuse_viz"
SRC_URI = "git://github.com/ros2-gbp/fuse-release;${ROS_BRANCH};protocol=https"
SRCREV = "fcdcaa2a5fe9c82d74a3c69eeaaa3fbb5d07ffa2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

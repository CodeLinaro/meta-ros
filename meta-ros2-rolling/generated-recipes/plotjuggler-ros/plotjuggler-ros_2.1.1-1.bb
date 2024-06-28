# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "PlotJuggler plugin for ROS"
AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
ROS_AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
HOMEPAGE = "https://github.com/facontidavide/PlotJuggler"
SECTION = "devel"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=401bb3d3cfffe0a0a75060250c104a03"

ROS_CN = "plotjuggler_ros"
ROS_BPN = "plotjuggler_ros"

ROS_BUILD_DEPENDS = " \
    binutils \
    boost \
    plotjuggler \
    qtbase \
    qtsvg \
    qtwebsockets \
    rclcpp \
    rcpputils \
    rosbag2 \
    rosbag2-transport \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    binutils \
    boost \
    plotjuggler \
    qtbase \
    qtsvg \
    qtwebsockets \
    rclcpp \
    rcpputils \
    rosbag2 \
    rosbag2-transport \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    binutils \
    boost \
    plotjuggler \
    qtbase \
    qtsvg \
    qtwebsockets \
    rclcpp \
    rcpputils \
    rosbag2 \
    rosbag2-transport \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/plotjuggler-ros-plugins-release/archive/release/rolling/plotjuggler_ros/2.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/plotjuggler_ros"
SRC_URI = "git://github.com/ros2-gbp/plotjuggler-ros-plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "8524f06f3d0be7a9e2d9284052fcda00f7a86be8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "camera_calibration_parsers contains routines for reading and writing camera calibration parameters."
AUTHOR = "Alejandro Hernandez Cordero <alejandro@openrobotics.org>"
ROS_AUTHOR = "Michael Carroll <michael@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/camera_calibration_parsers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_common"
ROS_BPN = "camera_calibration_parsers"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    sensor-msgs \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    sensor-msgs \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    sensor-msgs \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/image_common-release/archive/release/rolling/camera_calibration_parsers/5.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/camera_calibration_parsers"
SRC_URI = "git://github.com/ros2-gbp/image_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "b18bf27f8d852cf0af19c7b4f15e51e975569f9e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ROS2 driver for synchronized flir cameras using the Spinnaker SDK"
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4083d50af96f9bddbe68e0de85b0a7db"

ROS_CN = "flir_camera_driver"
ROS_BPN = "spinnaker_synchronized_camera_driver"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    spinnaker-camera-driver \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    spinnaker-camera-driver \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    spinnaker-camera-driver \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-black \
    ament-cmake-clang-format \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/flir_camera_driver-release/archive/release/rolling/spinnaker_synchronized_camera_driver/2.0.17-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/spinnaker_synchronized_camera_driver"
SRC_URI = "git://github.com/ros2-gbp/flir_camera_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "be875ce63eaec54d09746cb1130a66a523a695ea"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

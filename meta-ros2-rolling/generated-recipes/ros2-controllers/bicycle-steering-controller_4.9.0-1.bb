# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Steering controller with bicycle kinematics. Rear fixed wheel is powering the vehicle and front wheel is steering."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Dr.-Ing. Denis Štogl <denis.stogl@stoglrobotics.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_controllers"
ROS_BPN = "bicycle_steering_controller"

ROS_BUILD_DEPENDS = " \
    backward-ros \
    control-msgs \
    controller-interface \
    generate-parameter-library \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    std-srvs \
    steering-controllers-library \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    backward-ros \
    control-msgs \
    controller-interface \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    std-srvs \
    steering-controllers-library \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    backward-ros \
    control-msgs \
    controller-interface \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    std-srvs \
    steering-controllers-library \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    controller-manager \
    hardware-interface \
    hardware-interface-testing \
    ros2-control-test-assets \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_controllers-release/archive/release/rolling/bicycle_steering_controller/4.9.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/bicycle_steering_controller"
SRC_URI = "git://github.com/ros2-gbp/ros2_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "a550db6cc8e00505bc41186a9c3f5ab6b8433361"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

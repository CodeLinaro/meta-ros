# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The new driver for Universal Robots UR3, UR5 and UR10 robots with CB3 controllers and the e-series."
AUTHOR = "Denis Stogl <denis@stoglrobotics.de>"
ROS_AUTHOR = "Marvin Große Besselmann <grosse@fzi.de>"
HOMEPAGE = "https://github.com/UniversalRobots/Universal_Robots_ROS2_Driver/issues"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "ur_robot_driver"
ROS_BPN = "ur_robot_driver"

ROS_BUILD_DEPENDS = " \
    backward-ros \
    controller-manager \
    controller-manager-msgs \
    geometry-msgs \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    rclpy \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    ur-client-library \
    ur-controllers \
    ur-dashboard-msgs \
    ur-description \
    ur-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    backward-ros \
    controller-manager \
    controller-manager-msgs \
    geometry-msgs \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    rclpy \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    ur-client-library \
    ur-controllers \
    ur-dashboard-msgs \
    ur-description \
    ur-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    backward-ros \
    controller-manager \
    controller-manager-msgs \
    force-torque-sensor-broadcaster \
    geometry-msgs \
    hardware-interface \
    joint-state-broadcaster \
    joint-state-publisher \
    joint-trajectory-controller \
    launch \
    launch-ros \
    pluginlib \
    position-controllers \
    rclcpp \
    rclcpp-lifecycle \
    rclpy \
    robot-state-publisher \
    ros2-controllers-test-nodes \
    rviz2 \
    socat \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    ur-client-library \
    ur-controllers \
    ur-dashboard-msgs \
    ur-description \
    ur-msgs \
    urdf \
    velocity-controllers \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    launch-testing-ament-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/Universal_Robots_ROS2_Driver-release/archive/release/humble/ur_robot_driver/2.2.13-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/ur_robot_driver"
SRC_URI = "git://github.com/ros2-gbp/Universal_Robots_ROS2_Driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "050f896185f742596107f5d6004bf1c6628512d7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

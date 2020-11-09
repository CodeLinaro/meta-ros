# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Minimal action client examples"
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
ROS_AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "examples"
ROS_BPN = "examples_rclcpp_minimal_action_client"

ROS_BUILD_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rclcpp-action \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rclcpp-action \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rclcpp-action \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/examples-release/archive/release/eloquent/examples_rclcpp_minimal_action_client/0.8.2-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/examples_rclcpp_minimal_action_client"
SRC_URI = "git://github.com/ros2-gbp/examples-release;${ROS_BRANCH};protocol=https"
SRCREV = "65e326b91f431c0958955d32685763f29a2d7cdf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

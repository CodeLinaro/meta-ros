# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Fanuc Resources used for MoveIt testing"
AUTHOR = "Dave Coleman <dave@dav.ee>"
ROS_AUTHOR = "Ioan Sucan <isucan@willowgarage.edu>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit_resources"
ROS_BPN = "moveit_resources_fanuc_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/moveit_resources-release/archive/release/humble/moveit_resources_fanuc_description/2.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/moveit_resources_fanuc_description"
SRC_URI = "git://github.com/ros2-gbp/moveit_resources-release;${ROS_BRANCH};protocol=https"
SRCREV = "33324bf21d6e088aa17f1d11c25c6a3caf277e78"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

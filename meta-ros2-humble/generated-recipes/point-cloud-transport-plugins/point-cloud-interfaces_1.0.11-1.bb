# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "msg definitions for use with point_cloud_transport plugins."
AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
ROS_AUTHOR = "Jakub Paplham"
HOMEPAGE = "https://wiki.ros.org/draco_point_cloud_transport"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "point_cloud_transport_plugins"
ROS_BPN = "point_cloud_interfaces"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
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

# matches with: https://github.com/ros2-gbp/point_cloud_transport_plugins-release/archive/release/humble/point_cloud_interfaces/1.0.11-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/point_cloud_interfaces"
SRC_URI = "git://github.com/ros2-gbp/point_cloud_transport_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "1558f28a665a5604c98b695f35b8deec7a8b7d31"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

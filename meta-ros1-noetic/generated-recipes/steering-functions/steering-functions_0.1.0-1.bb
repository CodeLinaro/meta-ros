# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The steering_functions package"
AUTHOR = "Holger Banzhaf <holger.banzhaf@de.bosch.com>"
ROS_AUTHOR = "Holger Banzhaf <holger.banzhaf@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "steering_functions"
ROS_BPN = "steering_functions"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    costmap-2d \
    geometry-msgs \
    libeigen \
    nav-msgs \
    roscpp \
    roslib \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    libeigen \
    nav-msgs \
    roscpp \
    roslib \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    libeigen \
    nav-msgs \
    roscpp \
    roslib \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/nobleo/steering_functions-release/archive/release/noetic/steering_functions/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/steering_functions"
SRC_URI = "git://github.com/nobleo/steering_functions-release;${ROS_BRANCH};protocol=https"
SRCREV = "6bace20b61f89a19fc5d683e42fff2fc274f3781"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

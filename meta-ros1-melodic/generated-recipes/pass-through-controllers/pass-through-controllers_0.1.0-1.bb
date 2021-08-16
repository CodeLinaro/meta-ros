# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Trajectory controllers (joint-based and Cartesian) that forward trajectories     directly to a robot controller and let it handle trajectory interpolation and execution."
AUTHOR = "Stefan Scherzinger <scherzin@fzi.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "pass_through_controllers"
ROS_BPN = "pass_through_controllers"

ROS_BUILD_DEPENDS = " \
    actionlib \
    cartesian-control-msgs \
    cartesian-interface \
    controller-manager \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    roscpp \
    speed-scaling-interface \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    cartesian-control-msgs \
    cartesian-interface \
    controller-manager \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    roscpp \
    speed-scaling-interface \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    cartesian-control-msgs \
    cartesian-interface \
    controller-interface \
    controller-manager \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    roscpp \
    speed-scaling-interface \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    cartesian-trajectory-controller \
    control-msgs \
    controller-manager-msgs \
    rostest \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UniversalRobots/Universal_Robots_ROS_passthrough_controllers-release/archive/release/melodic/pass_through_controllers/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pass_through_controllers"
SRC_URI = "git://github.com/UniversalRobots/Universal_Robots_ROS_passthrough_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "f5ac9e3d7ebab989134addb7f22eeea0b6cfb1bc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

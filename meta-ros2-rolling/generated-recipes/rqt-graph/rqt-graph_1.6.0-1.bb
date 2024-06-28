# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS       computation graph.<br/>       Its components are made generic so that other packages       where you want to achieve graph representation can depend upon this pkg       (use <a href="http://www.ros.org/wiki/rqt_dep">rqt_dep</a> to find out       the pkgs that depend. rqt_dep itself depends on rqt_graph too)."
AUTHOR = "Chris Lalancette <clalancette@gmail.com>"
ROS_AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/rqt_graph"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_graph"
ROS_BPN = "rqt_graph"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    python-qt-binding \
    qt-dotgraph \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_graph-release/archive/release/rolling/rqt_graph/1.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rqt_graph"
SRC_URI = "git://github.com/ros2-gbp/rqt_graph-release;${ROS_BRANCH};protocol=https"
SRCREV = "5f70926e7fd40c10106ff32b6d562f7d748a2cb4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}

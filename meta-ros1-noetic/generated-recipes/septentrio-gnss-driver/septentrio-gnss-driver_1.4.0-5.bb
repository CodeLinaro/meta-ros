# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "ROSaic: C++ driver for Septentrio's GNSS and INS receivers"
AUTHOR = "Tibor Dome <tibor.doeme@alumni.ethz.ch>"
ROS_AUTHOR = "Tibor Dome"
HOMEPAGE = "https://github.com/septentrio-gnss/septentrio_gnss_driver"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause License"
LICENSE = "BSD-3-Clause-License"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=5668b0d257345fe4a950dc0d5b34f56f"

ROS_CN = "septentrio_gnss_driver"
ROS_BPN = "septentrio_gnss_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-msgs \
    geographiclib \
    geometry-msgs \
    gps-common \
    libpcap \
    message-generation \
    nav-msgs \
    nmea-msgs \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-msgs \
    geographiclib \
    geometry-msgs \
    gps-common \
    libpcap \
    nav-msgs \
    nmea-msgs \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-msgs \
    geographiclib \
    geometry-msgs \
    gps-common \
    libpcap \
    message-runtime \
    nav-msgs \
    nmea-msgs \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/septentrio-users/septentrio_gnss_driver-release/archive/release/noetic/septentrio_gnss_driver/1.4.0-5.tar.gz
ROS_BRANCH ?= "branch=release/noetic/septentrio_gnss_driver"
SRC_URI = "git://github.com/septentrio-users/septentrio_gnss_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "8854e70ab6aaa0f9b643814419f03702d913d37b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package provides Google Benchmark."
AUTHOR = "Audrow Nash <audrow@openrobotics.org>"
ROS_AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
HOMEPAGE = "https://github.com/google/benchmark"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a9acc8a0587aa088a1cbd8e35acd271e"

ROS_CN = "google_benchmark_vendor"
ROS_BPN = "google_benchmark_vendor"

ROS_BUILD_DEPENDS = " \
    google-benchmark \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    google-benchmark \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    google-benchmark \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/google_benchmark_vendor-release/archive/release/humble/google_benchmark_vendor/0.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/google_benchmark_vendor"
SRC_URI = "git://github.com/ros2-gbp/google_benchmark_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "09fbf04c117c61fb62ca998d7761b56f810894a4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
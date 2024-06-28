# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Vendor package for: gz-rendering8 8.1.1      Gazebo Rendering: Rendering library for robot applications"
AUTHOR = "Addisu Z. Taddese <addisuzt@intrinsic.ai>"
HOMEPAGE = "https://github.com/gazebosim/gz-rendering"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "gz_rendering_vendor"
ROS_BPN = "gz_rendering_vendor"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libfreeimage-dev} \
    freeglut \
    glew \
    gz-cmake-vendor \
    gz-common-vendor \
    gz-math-vendor \
    gz-ogre-next-vendor \
    gz-plugin-vendor \
    gz-utils-vendor \
    libxi \
    libxmu \
    ogre \
    util-linux \
    vulkan-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    ament-cmake-test-native \
    ament-cmake-vendor-package-native \
"

ROS_EXPORT_DEPENDS = " \
    gz-cmake-vendor \
    gz-common-vendor \
    gz-math-vendor \
    gz-ogre-next-vendor \
    gz-plugin-vendor \
    gz-utils-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libfreeimage-dev} \
    freeglut \
    glew \
    gz-cmake-vendor \
    gz-common-vendor \
    gz-math-vendor \
    gz-ogre-next-vendor \
    gz-plugin-vendor \
    gz-utils-vendor \
    libxi \
    libxmu \
    ogre \
    util-linux \
    vulkan-headers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-xvfb} \
    ament-cmake-copyright \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/gz_rendering_vendor-release/archive/release/rolling/gz_rendering_vendor/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/gz_rendering_vendor"
SRC_URI = "git://github.com/ros2-gbp/gz_rendering_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "9511f7f4f1a47dd9e123fb1dace0761d6b016c11"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

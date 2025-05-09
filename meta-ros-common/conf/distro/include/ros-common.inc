# OE DISTRO configuration settings common to both ROS 1 and ROS 2 distros.
#
# Copyright (c) 2019-2021 LG Electronics, Inc.

DISTRO_NAME = "${ROS_OE_DISTRO_NAME} with OpenEmbedded Linux"
DISTRO_CODENAME = "${ROS_DISTRO}"

ROS_DISTRO_VERSION_APPEND ??= ""
DISTRO_VERSION = "${ROS_DISTRO_METADATA_VERSION}${ROS_DISTRO_VERSION_APPEND}"

MAINTAINER = "Rob Woolley <rob.woolley@windriver.com>"

# Use systemd execusively with no sysvinit scripts
# (see https://www.yoctoproject.org/docs/2.6.2/mega-manual/mega-manual.html#selecting-an-initialization-manager).
DISTRO_FEATURES:append = " systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
VIRTUAL-RUNTIME_initscripts = ""

# Without this, networking has to be started manually.
ROS_CONNECTION_MANAGER ??= "connman"
IMAGE_INSTALL:append = " \
    ${ROS_CONNECTION_MANAGER} \
"

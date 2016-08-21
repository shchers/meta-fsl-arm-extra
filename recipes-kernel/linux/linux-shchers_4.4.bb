# Copyright (C) 2016 Sergey Shcherbakov <shchers@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

LOCALVERSION = "+shchers"

SUMMARY = "Linux kernel for Starterkit SK-i.MX233 board"

SRCBRANCH = "v4.4.6-sk"
SRCREV = "c322d044da8c2d21b8f14ca9d9b15058650d8f0f"
SRC_URI = "git://github.com/shchers/linux.git;protocol=https;branch=${SRCBRANCH} \
           file://defconfig"

DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(sk-imx233)"

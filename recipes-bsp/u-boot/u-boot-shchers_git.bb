require recipes-bsp/u-boot/u-boot.inc

inherit fsl-u-boot-localversion

DESCRIPTION = "u-boot for SK-i.MX233 board"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

DEPENDS_mxs += "elftosb-native openssl-native"

PROVIDES = "u-boot"

LOCALVERSION = "+shchers"

PV = "v2016.03+git${SRCPV}"

SRCREV = "d198da0c2bee06d7eecfff084850f568c1bb1973"
SRCBRANCH = "v2016.03-sk"
SRC_URI = "git://github.com/shchers/u-boot.git;protocol=https;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE  = "(mxs)"

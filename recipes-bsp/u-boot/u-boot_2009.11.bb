#
# Binary u-boot image from http://code.google.com/p/beagleboard/
# Building from source causes a performance regression.
#

UBOOT_BINARY = "u-boot-revc4.bin"

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb" 

#FILESDIR = "${@os.path.dirname(d.getVar('FILE',1))}/u-boot-git/${MACHINE}"

PV = "v2009.11"
PR = "revc4"

SRC_URI = "file://${UBOOT_BINARY} \
           file://COPYING"

S = "${WORKDIR}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_compile() {
}


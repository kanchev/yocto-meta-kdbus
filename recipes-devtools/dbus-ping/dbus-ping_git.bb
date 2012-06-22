DESCRIPTION = "D-Bus benchmarking and profiling tool."
HOMEPAGE = "http://www.genivi.org"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=92bf9743cf0f1e6d9306478e118e432f"

DEPENDS = "dbus"

SRC_URI = "git://github.com/kanchev/dbus-ping.git;protocol=git"
S = "${WORKDIR}/git/"
SRCREV = "e22db57c31c87042e8a5863e07a1114391b04451"
PV = "1+git${SRCPV}"
PR = "r1"

FILES_${PN} += "${datadir}/dbus-1/services/com.bmw.Test.service"

inherit autotools 


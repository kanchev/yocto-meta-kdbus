FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
PRINC := "${@int(PRINC) + 2}"

PR_append = "+afbus"

SRC_URI += "file://0001-Backport-AF_BUS-patch-to-1.4-branch.patch"

# fixes build on Ubuntu 11
DEPENDS += "shadow-native"

FILESEXTRAPATHS_prepend := "${THISDIR}:"
PRINC := "${@int(PRINC) + 2}"

PR_append = "+afbus"

SRC_URI += "file://0001-af_unix-dont-send-SCM_CREDENTIALS-by-default.patch"
SRC_URI += "file://0002-net-bus-add-the-AF_BUS-socket-address-family-and-net.patch"
SRC_URI += "file://af_bus.cfg"

KERNEL_FEATURES_append = " features/ftrace"


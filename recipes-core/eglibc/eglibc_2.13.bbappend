FILESEXTRAPATHS_prepend := "${THISDIR}:"
PRINC := "${@int(PRINC) + 2}"

PR_append = "+afbus"

SRC_URI += "file://add-af-bus-support.patch"


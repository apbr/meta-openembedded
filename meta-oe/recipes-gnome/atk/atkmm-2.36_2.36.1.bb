SUMMARY = "C++ bindings for the atk"
SECTION = "libs"

LICENSE = "LGPLv2.1 & GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1 \
                    file://COPYING.tools;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "atk glibmm-2.68"

GNOMEBASEBUILDCLASS = "meson"
GNOMEBN = "atkmm"

inherit gnomebase features_check

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI[archive.sha256sum] = "e11324bfed1b6e330a02db25cecc145dca03fb0dff47f0710c85e317687da458"

S = "${WORKDIR}/${GNOMEBN}-${PV}"

EXTRA_OEMESON = "-Dbuild-documentation=false"

FILES:${PN}-dev += "${libdir}/*/include ${libdir}/*/proc/m4"

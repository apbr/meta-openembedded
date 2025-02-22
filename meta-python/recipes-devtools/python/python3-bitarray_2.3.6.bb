SUMMARY = "A high-level Python efficient arrays of booleans -- C extension"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=2ad702cdcd49e8d2ac01d7e7d0810d2d"

SRC_URI[sha256sum] = "3bfdb59ded15c961e6e3d5b7f167155cda053be2475ea8017461df0b4d820b7d"

inherit setuptools3 pypi

BBCLASSEXTEND = "native nativesdk"

#!/bin/bash
mvn -f cat \
    versions:update-parent \
	versions:update-properties \
	versions:update-property \
	versions:update-child-modules \
	versions:use-latest-releases

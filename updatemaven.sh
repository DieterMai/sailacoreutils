#!/bin/bash
mvn \
    versions:update-parent \
	versions:update-properties \
	versions:update-property \
	versions:update-child-modules \
	versions:use-latest-releases

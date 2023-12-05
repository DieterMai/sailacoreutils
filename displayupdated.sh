#!/bin/bash
mvn \
	versions:display-plugin-updates \
	versions:display-dependency-updates \
	versions:display-property-updates \
	versions:update-parent

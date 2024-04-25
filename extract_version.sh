#!/bin/bash

APP_VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)

export APP_VERSION
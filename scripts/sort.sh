#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."

mvn -pl sort org.openrewrite.maven:rewrite-maven-plugin:6.46.1:run \
    -Drewrite.activeRecipes=org.openrewrite.maven.OrderPomElements

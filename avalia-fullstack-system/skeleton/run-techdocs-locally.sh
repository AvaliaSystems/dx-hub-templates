#!/bin/bash

echo "Open a browser on http://localhost:3000 for a Backstage preview"
echo "Open a browser on http://localhost:8000 for a mkdocs preview"
echo ""

npx @techdocs/cli serve --docker-image backstage --docker-entrypoint=mkdocs --verbose

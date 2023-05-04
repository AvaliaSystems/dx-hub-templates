#!/bin/bash

echo "Open a browser on http://localhost:3000 for a Backstage preview"
echo "Open a browser on http://localhost:8000 for a mkdocs preview"
echo ""

npx @techdocs/cli@latest serve --docker-image avaliasystems/techdocs --docker-entrypoint=mkdocs --verbose
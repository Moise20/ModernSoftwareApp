#!/bin/bash

echo "=========================="
echo " Simulation de déploiement "
echo "=========================="

# afichage du nom du fichier JAR généré
JAR_FILE=$(ls target/*.jar 2>/dev/null)

if [ -f "$JAR_FILE" ]; then
  echo "Le fichier JAR généré est : $JAR_FILE"
  echo "Déploiement simulé terminé avec succès."
else
  echo "Aucun fichier JAR trouvé dans le dossier target."
  echo "Le déploiement a échoué (simulation)."
  exit 1
fi

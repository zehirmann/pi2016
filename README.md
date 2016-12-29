# tuto git
Pour configurer le git sous Windows:

Téléchargez git sur https://git-scm.com/downloads
cochez git GUI et git bash, pour pouvoir taper des commandes en console.

Dans l'explorateur, allez dans le dossier où vous voulez travailler.
Clic droit -> git Bash Here (si vous n'avez pas ce choix, c'est que vous l'avez mal installé)

/*Pour initialiser git dans le dossier*/

git init

/*Pour vous paramétrer dans le git*/

git config --global user.email "vincent.montigny45@gmail.com"   //en changeant l'adresse

git config --global user.name "Vincent Montigny"		//en changeant le nom

/*Pour cloner le répertoire de travail*/

Vous devez avoir un compte Github, si ce n'est pas déjà le cas, créez le. Ensuite, allez sur http://github.com/zehirmann/pi2016

Cliquez sur le bouton fork en haut à droite. Cela va créer une image du répertoire de travail pour votre compte. Vous devez alors cloner cette branche. Retournez dans vos lignes de commande, et faites un clone :

git clone http://github.com/votreNom/pi2016.git

/*Pour ajouter ses fichiers, c'est comme dans les projets précédents*/

git add "mon fichier"

git commit -m "ajout de mon fichier"

git push -u origin master

A partir de là, votre branche est modifié, il faut faire une demande de merge sur le site, pour qu'on puisse le mettre sur le master de base (mais si vous ne le faites pas, on pourra quand même voir vos branches).
Pour ça, faites un "pull request" sur le site, en précisant un commentaire. Il me suffit de l'accepter pour valider ça dans la branche principal.
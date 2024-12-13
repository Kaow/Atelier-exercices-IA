## Reverse Engineering 
1.	Ecrivez un prompt qui va demander au modèle de décrire ce que fait votre code
Exemple que vous pouvez utiliser :  
```
Un code python
def calcul(limit): 
    primes = [] 
    is_prime = [True] * (limit + 1) 
    p = 2 
  
    while p * p <= limit: 
        if is_prime[p]: 
            for i in range(p * p, limit + 1, p): 
                is_prime[i] = False 
        p += 1 
  
    for p in range(2, limit + 1): 
        if is_prime[p]: 
            primes.append(p) 
  
    return primes 
  
limite = 100 
list = calcul(limite) 
  
for nombre in list: 
    print(nombre) 
```

**A vous de jouer en intégrant votre prompt ci-dessous**

```
En tant que développeur python, décrit de manière détaillé ce que fait ce code :
def calcul(limit): 
    primes = [] 
    is_prime = [True] * (limit + 1) 
    p = 2 
  
    while p * p <= limit: 
        if is_prime[p]: 
            for i in range(p * p, limit + 1, p): 
                is_prime[i] = False 
        p += 1 
  
    for p in range(2, limit + 1): 
        if is_prime[p]: 
            primes.append(p) 
  
    return primes 
  
limite = 100 
list = calcul(limite) 
  
for nombre in list: 
    print(nombre) 
```
**Quelle a été la réponse ?**

```bash
Ce code est une implémentation de l'algorithme du crible d'Ératosthène pour trouver tous les nombres premiers jusqu'à une limite donnée. Voici une description détaillée de ce que fait chaque partie du code :

La fonction calcul(limit) prend un entier limit comme argument et renvoie une liste de tous les nombres premiers jusqu'à la limite.

primes = [] crée une liste vide pour stocker les nombres premiers trouvés.

is_prime = [True] * (limit + 1) crée une liste de booléens de taille limit + 1 initialisée à True, où l'indice de la liste représente un nombre et la valeur booléenne indique si ce nombre est premier ou non.

p = 2 initialise la variable p à 2, le premier nombre premier.

La boucle while p * p <= limit exécute le crible d'Ératosthène. Pour chaque nombre premier p, on marque tous ses multiples comme non premiers dans la liste is_prime.

La boucle for p in range(2, limit + 1) parcourt tous les nombres de 2 à la limite et ajoute les nombres premiers à la liste primes.

La fonction renvoie la liste primes contenant tous les nombres premiers jusqu'à la limite.

En dehors de la fonction, on définit la variable limite à 100 et on appelle la fonction calcul(limite) pour obtenir la liste des nombres premiers jusqu'à 100.

Ensuite, on parcourt la liste des nombres premiers et on les imprime un par un.

En résumé, ce code génère tous les nombres premiers jusqu'à une limite donnée en utilisant l'algorithme du crible d'Ératosthène, puis les imprime.
```


## Sécurisation 
1.	Ecrivez un prompt qui va demander au modèle de sécuriser votre service  
Exemple que vous pouvez utiliser :  
Eviter les attaques sur votre requête SQL [“SELECT * FROM CLIENTS WHERE client=” + name] dans votre code 

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Voici ma requête SQL :  
“SELECT * FROM CLIENTS WHERE client=” + name  
Comment sécuriser cette requête ? 
```
**Quelle a été la réponse ?**

Pour sécuriser cette requête SQL contre les attaques par injection, vous devriez utiliser des paramètres de requête. Plutôt que d'incorporer directement la valeur de name dans la requête, vous devriez utiliser des paramètres de requête pour lier la valeur de name à la requête. Cela dépend du langage que vous utilisez pour exécuter la requête, mais voici un exemple en Python avec la bibliothèque sqlite3 :

```bash
import sqlite3

name = "nom_du_client"
conn = sqlite3.connect('ma_base_de_données.db')
cursor = conn.cursor()
cursor.execute("SELECT * FROM CLIENTS WHERE client=?", (name,))
```

Dans cet exemple, le point d'interrogation (?) est utilisé comme un paramètre de requête, et la valeur de name est passée séparément. Cela aide à prévenir les attaques par injection SQL en s'assurant que la valeur de name est traitée comme une donnée et non comme une partie de la requête SQL.

Il est important de toujours utiliser des paramètres de requête pour sécuriser vos requêtes SQL et éviter les attaques par injection.
 
2.	Ecrivez un prompt qui va demander au modèle de vous aider sur l’ajout de sécurité sans donner de code  
Exemple que vous pouvez utiliser :  
Sécuriser une authentification web  

**A vous de jouer en intégrant votre prompt ci-dessous**

```
En tant qu'expert Authentification WEB, Comment pourrais-je améliorer la sécurité de mon authentification ? 
```
**Quelle a été la réponse ?**

```bash
Pour améliorer la sécurité de votre authentification web, voici quelques bonnes pratiques que vous pourriez mettre en place :

Utiliser HTTPS : Assurez-vous que votre site utilise HTTPS pour chiffrer les données échangées entre le navigateur de l'utilisateur et le serveur. Cela aidera à prévenir les attaques de type interception de données.

Mise en place d'une politique de mots de passe robuste : Exigez des mots de passe forts comprenant une combinaison de lettres, chiffres et caractères spéciaux. Envisagez également d'implémenter des politiques de rotation de mots de passe et de vérification de la force des mots de passe lors de leur création.

Utilisation de l'authentification à deux facteurs (2FA) : Encouragez l'utilisation de l'authentification à deux facteurs pour ajouter une couche supplémentaire de sécurité. Cela peut être réalisé en utilisant des codes envoyés par SMS, des applications d'authentification ou des clés de sécurité.

Limitation des tentatives de connexion : Mettez en place des mécanismes pour limiter le nombre de tentatives de connexion infructueuses, afin de prévenir les attaques par force brute.

Protection contre les attaques par injection : Assurez-vous que votre application est protégée contre les attaques par injection SQL en utilisant des requêtes préparées ou des ORM sécurisées.

Gestion sécurisée des sessions : Assurez-vous que les sessions utilisateur sont gérées de manière sécurisée, en utilisant des identifiants de session aléatoires et en les stockant de manière sécurisée.

Mises à jour régulières : Assurez-vous que votre application et tous les composants associés sont régulièrement mis à jour avec les derniers correctifs de sécurité.

En mettant en œuvre ces bonnes pratiques, vous pourrez renforcer la sécurité de votre authentification web et réduire les risques d'attaques.
```

## Regex 
1.	Ecrivez un prompt qui va demander au modèle l'explication d'une formule Regex 
Exemple que vous pouvez utiliser :  
```bash
^[\w\.=-]+@[\w\.-]+\.[\w]{2,3}$
```

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Que fait cette regex ^[\w\.=-]+@[\w\.-]+\.[\w]{2,3}$
```
**Quelle a été la réponse ?**

Cette regex vérifie que l'adresse e-mail est au format suivant :

Une partie locale (avant le @) qui peut contenir des lettres, des chiffres, des points, des égalités et des tirets.
Un symbole @.
Un domaine qui peut contenir des lettres, des chiffres, des points et des tirets.
Un point suivi d'une extension de 2 à 3 lettres.  

2. Demandez à l'IA de modifier la regex précédente pour qu'elle valide seulement les adresses mail gmail.com
Exemple:  
nom.prenom@gmail.com  
exemple@gmail.com  

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Modifie cette regex pour que ce qui se trouve après le @ soit uniquement "gmail.com", comme par exemple "nom.prenom@gmail.com" ou "exemple@gmail.com"
```
**Quelle a été la réponse ?**
Pour modifier la regex afin que la partie après le @ soit uniquement "gmail.com", vous pouvez remplacer la partie correspondante par cette chaîne spécifique. Voici la regex modifiée :
```bash
^[\w\.=-]+@gmail\.com$
```

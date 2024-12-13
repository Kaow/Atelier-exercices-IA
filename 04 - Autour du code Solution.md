# Autour du code
Il existe beaucoup de fonctionnalités disponibles sur les outils IA qui vous permettent de vous aider dans votre écriture de code, cela va vous permettre de vous simplifier certaines tâches redondantes ou fastidieuses, voire même vous donner une autre vision possiblement plus optimale sur votre sujet


## Génération de code
1.  Ecrivez un prompt qui va demander au modèle de vous générer du code  
Exemple que vous pouvez utiliser :  
```bash
Une fonction/méthode réalisant la division de deux nombres 
```
**A vous de jouer en intégrant votre prompt ci-dessous**
```
Génère un code en typescript une fonction réalisant la division de deux nombres 
```
**Quelle a été la réponse ?**
Bien sûr ! Voici un exemple simple d'une fonction en TypeScript qui réalise la division de deux nombres. La fonction prend deux arguments et retourne le résultat de la division. Elle gère également la division par zéro en renvoyant un message d'erreur.

```bash
function divideNumbers(dividend: number, divisor: number): number | string {
    if (divisor === 0) {
        return "Erreur : Division par zéro n'est pas définie.";
    }
    return dividend / divisor;
}
```

// Exemples d'utilisation
const result1 = divideNumbers(10, 2);
console.log(result1); // Affiche 5

const result2 = divideNumbers(10, 0);
console.log(result2); // Affiche "Erreur : Division par zéro n'est pas définie."
Copier
Explications :
La fonction divideNumbers prend deux paramètres : dividend (le numérateur) et divisor (le dénominateur).
Si le divisor est zéro, la fonction renvoie un message d'erreur.
Sinon, elle renvoie le résultat de la division.
N'hésite pas à me faire savoir si tu as besoin d'autres exemples ou d'explications supplémentaires !  

2. Ecrivez un prompt pour ajouter des éléments supplémentaires à votre code  
Exemple que vous pouvez utiliser :  
```bash
Sécurisation du dénominateur différent de 0
Vérification des paramètres récupéré en tant que nombre
Ajout de fonctionnalité comme ajouté +10 au résultat de la division
```
**A vous de jouer en intégrant votre prompt ci-dessous**
```
Ajoute dans le code l'interdiction d'avoir un dénominateur égal à à 0
Vérifie que les paramètres récupérérs soient bien des nombres
Ajoute une addition de +10 au résultat dans la fonction de division
```

## Correction d'erreur
1. Ecrivez un prompt qui demander au modèle de comprendre pourquoi votre code ne fonctionne pas (Astuce Continue)  
Exemple que vous pouvez utiliser :  
```bash
function divide(a: string, b: number) {
    var c;
    c = a + b
    c = 0;
    return b/c;
}
```
**A vous de jouer en intégrant votre prompt ci-dessous**

```
Sur Chatbot : 
Voici mon code :  
function divide(a: string, b: number) {
    var c;
    c = a + b
    c = 0;
    return b/c;
}
pourquoi est-ce qu'il ne fonctionne pas ? 


Sur le plugin Continue : 
Ecrivez votre code dans une classe
Selectionnez-le
clique droit > Continue: Fix this code
```
**Quelle a été la réponse ?**

Votre code présente plusieurs problèmes qui empêchent son bon fonctionnement. Voici une explication des erreurs et une version corrigée :

Type de c : Vous affectez d'abord c à la somme d'une chaîne (a) et d'un nombre (b), ce qui donne une chaîne. Ensuite, vous écrasez cette valeur en affectant c à 0. Cela rend la première opération inutile.

Division par zéro : Vous divisez b par c, qui est toujours 0 dans votre code, ce qui entraînera une erreur de division par zéro.

Typage : Si vous voulez diviser un nombre, il faudrait que a soit un nombre et non une chaîne.

Voici une version corrigée de votre fonction :
```bash
function divide(a: number, b: number) {
    if (b === 0) {
        throw new Error("Division par zéro n'est pas permise.");
    }
    return a / b;
}
```

Explications des changements :
Changement des types : J'ai changé le type de a pour qu'il soit un nombre, ce qui a plus de sens pour une opération de division.
Vérification de la division par zéro : Avant de procéder à la division, j'ai ajouté une condition pour vérifier si b est zéro et, le cas échéant, lever une exception.
Si vous souhaitez conserver a en tant que chaîne et effectuer une opération de division, vous devrez vous assurer de convertir a en nombre :
```bash
function divide(a: string, b: number) {
    const numA = parseFloat(a);
    if (b === 0) {
        throw new Error("Division par zéro n'est pas permise.");
    }
    return numA / b;
}
```
Remarques :
Utilisez parseFloat pour convertir la chaîne en nombre. Assurez-vous que la chaîne est un nombre valide pour éviter des résultats inattendus.  


## Optimisation du code 
1.	Ecrivez un prompt qui va demander au modèle d’optimiser votre code (Astuce Continue)  
Exemple que vous pouvez utiliser :  
```
function sum(a: number, b: number) {
	var c;
    c = a + b;
    return c;
}
```
      
**A vous de jouer en intégrant votre prompt ci-dessous**

```
Voici mon code typescript :
function sum(a: number, b: number) {
	var c;
    c = a + b;
    return c;
}
peux-tu l'optimiser ?


Sur le plugin Continue : 
Ecrivez votre code dans une classe
Selectionnez-le
clique droit > Continue: Optimize this code
```

**Quelle a été la réponse ?**

Bien sûr ! Ton code peut être simplifié et optimisé. Voici une version améliorée :
```bash
function sum(a: number, b: number): number {
    return a + b;
}
```
Modifications apportées :
Retrait de la variable intermédiaire : Il n'est pas nécessaire d'utiliser une variable c pour stocker le résultat. Tu peux directement retourner la somme.

Ajout de la déclaration de type de retour : J'ai ajouté : number après la déclaration de la fonction pour indiquer clairement que la fonction retourne un nombre.

Ce code est plus concis tout en étant tout aussi clair.  

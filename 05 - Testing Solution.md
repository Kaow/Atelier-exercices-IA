## Test unitaire 
1.	Ecrivez un prompt qui va demander au modèle d’écrire des tests unitaires simples sur votre code (Astuce Continue)  
Exemple que vous pouvez utiliser :  
```bash
function somme(a: number, b: number): number {
    return a + b;
}
```

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Sur Chatbot : 
Voici mon code :  
function somme(a: number, b: number): number {
    return a + b;
}
Ecrit des tests unitaires sur ce code 


Sur le plugin Continue : 
Ecrivez votre code dans une classe
Selectionnez-le
clique droit > Continue: Write comments for this code
```
**Quelle a été la réponse ?**

Pour écrire des tests unitaires sur la fonction somme, vous pouvez utiliser un framework de test comme Jest ou Mocha. Voici un exemple de tests unitaires en utilisant Jest :

Installez Jest (si ce n'est pas déjà fait) :
```bash
npm install --save-dev jest
```
Créez un fichier de test. Par exemple, somme.test.ts :
```bash
// somme.ts
export function somme(a: number, b: number): number {
    return a + b;
}

// somme.test.ts
import { somme } from './somme';

describe('Tests de la fonction somme', () => {
    test('doit retourner la somme de deux nombres positifs', () => {
        expect(somme(2, 3)).toBe(5);
    });

    test('doit retourner la somme d\'un nombre positif et d\'un nombre négatif', () => {
        expect(somme(5, -2)).toBe(3);
    });

    test('doit retourner la somme de deux nombres négatifs', () => {
        expect(somme(-3, -7)).toBe(-10);
    });

    test('doit retourner la somme d\'un nombre et de zéro', () => {
        expect(somme(10, 0)).toBe(10);
        expect(somme(0, 10)).toBe(10);
    });

    test('doit retourner zéro lorsque les deux nombres sont zéro', () => {
        expect(somme(0, 0)).toBe(0);
    });

    test('doit retourner un nombre lorsque les deux nombres sont identiques', () => {
        expect(somme(7, 7)).toBe(14);
    });
});
```
Configurez votre fichier package.json pour ajouter un script de test :
```bash
"scripts": {
    "test": "jest"
}
```
Exécutez vos tests :
```bash
npm test
```

Cela lancera Jest, et vous verrez les résultats de vos tests dans la console. Les tests que nous avons écrits couvrent différents cas d'utilisation pour la fonction somme, y compris des nombres positifs, négatifs, et zéro.  

2.	Ecrivez un prompt qui va demander au modèle d’écrire des tests unitaires sur votre fonction calcul(a,b) qui calcul la somme des paramètres a et b sans lui donner de code

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Ecrit des tests unitaires en typescript qui vérifient si la fonction calcul(a,b) renvoie bien l'addition des deux paramètres 
```
**Quelle a été la réponse ?**

Bien sûr ! Voici un exemple de test unitaire pour la fonction calcul en utilisant le module unittest de Python :

```bash
import unittest

def calcul(a, b):
    return a + b

class TestCalcul(unittest.TestCase):

    def test_calcul_positif(self):
        self.assertEqual(calcul(3, 5), 8)

    def test_calcul_negatif(self):
        self.assertEqual(calcul(-1, 1), 0)

    def test_calcul_zero(self):
        self.assertEqual(calcul(0, 0), 0)

    def test_calcul_melange(self):
        self.assertEqual(calcul(10, -5), 5)

if __name__ == '__main__':
    unittest.main()
```
Dans cet exemple, nous avons créé une classe TestCalcul qui hérite de unittest.TestCase. Nous avons ensuite défini quatre méthodes de test, chacune vérifiant un cas spécifique de la fonction calcul. Lorsque vous exécutez ce script, les tests seront effectués et vous obtiendrez un rapport sur les résultats des tests.

N'oubliez pas d'importer le module unittest et de lancer unittest.main() pour exécuter les tests.

3.	Pour aller plus loin, vous pouvez utiliser différentes méthodes pour pousser l'écriture des tests encore plus en détail  
Utilisez certaines méthodes comme l'act like et d'autres pour créer des tests unitaires  
Exemple que vous pouvez utiliser :  
division(a,b) une fonction qui va faire diviser a par b

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Agis en tant que expert mathématicien. Trouves des tests unitaire à faire sur la méthode division(a,b), une méthode qui fait la division de a par b  
Agis en tant que expert testeur angular. Trouves des tests unitaire à faire sur la méthode division(a,b), une méthode qui fait la division de a par b  
```
**Quelle a été la réponse ?**

```bash
En tant qu'expert testeur, voici quelques exemples de tests unitaires que vous pourriez effectuer sur la méthode division(a, b) :

Test de division par zéro : Vérifiez que la méthode lève une exception appropriée lorsque la division par zéro est tentée.

Test de division avec des nombres positifs : Vérifiez que la méthode renvoie le résultat attendu lorsque les deux nombres sont positifs.

Test de division avec des nombres négatifs : Vérifiez que la méthode renvoie le résultat attendu lorsque l'un des nombres est négatif.

Test de division avec un résultat décimal : Vérifiez que la méthode renvoie un résultat décimal correct lorsque la division donne un nombre à virgule flottante.

Test de division avec un résultat entier : Vérifiez que la méthode renvoie un résultat entier lorsque la division donne un nombre entier.

Ces tests couvrent une gamme de cas d'utilisation différents et permettent de s'assurer que la méthode division(a, b) fonctionne correctement dans divers scénarios.
```
  
  
  
## Test fonctionnel 
1.	Ecrivez un prompt qui va demander au modèle de rédiger un jeu de test fonctionnel  
Exemple que vous pouvez utiliser :  
Création de devis  
Vérification des champs texte/date/montant  
Aperçu d’impression  
Facturation  

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Ecrit un document word listant un jeu de test fonctionnel impliquant la vérification de : 
La création de devis  
Des champs textes, dates, montant  
L'aperçu d'impression  
La facturation  
```
**Quelle a été la réponse ?**

```bash
En tant qu'assistant virtuel, je ne peux pas créer de documents Word, mais je peux vous aider à rédiger le contenu du document. Voici un exemple de jeu de test fonctionnel pour les fonctionnalités que vous avez mentionnées :

Jeu de test fonctionnel

Fonctionnalité : Création de devis

Cas de test :

Vérifier que l'utilisateur peut créer un nouveau devis.
Vérifier que les champs obligatoires tels que le nom du client, la description du devis, et le montant total sont validés.
Vérifier que l'utilisateur peut ajouter des lignes de devis avec des produits ou services.
Fonctionnalité : Champs textes, dates, montant

Cas de test :

Vérifier que les champs texte acceptent les caractères spéciaux et ont une limite de caractères appropriée.
Vérifier que les dates sont validées selon le format requis.
Vérifier que les champs de montant acceptent les valeurs numériques et les décimales.
Fonctionnalité : Aperçu d'impression

Cas de test :

Vérifier que l'aperçu d'impression affiche correctement les informations du devis.
Vérifier que les éléments tels que le logo de l'entreprise, les adresses, et les informations du client sont correctement positionnés.
Fonctionnalité : Facturation

Cas de test :

Vérifier que le devis peut être converti en facture.
Vérifier que la facture générée contient les informations correctes du devis.
Vérifier que la facture peut être envoyée par e-mail ou téléchargée au format PDF.
Ce jeu de test fonctionnel peut être utilisé pour valider les fonctionnalités de création de devis, la gestion des champs textes, dates et montant, l'aperçu d'impression et le processus de facturation.
```

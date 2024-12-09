# Auto-évaluation
L'auto-évaluation consiste à demander au modèle de s'évaluer lui-même, en utilisant des critères, des notes ou des commentaires. C'est une méthode qui peut être utiliser pour améliorer la qualité, la pertinence ou la cohérence du texte généré. 


Exercice 1 : Créez un prompt qui demande au modèle de dresser une liste d’éléments possiblement exhaustive  
Exemple que vous pouvez utiliser :  
Des chaines de texte à tester pour sécuriser un champ texte HTML

**A vous de jouer en intégrant votre prompt ci-dessous**

```bash
Ecris une liste de chaine de texte pour tester la sécurité d'un champ texte en html 
```
**Quelle a été la réponse ?**

```bash
 Ecris une liste de chaine de texte pour tester la sécurité d'un champ texte en html 


Il est important de noter que tester la sécurité d'un champ texte en HTML nécessite une approche plus robuste qu'une simple liste de chaînes de texte. Cependant, voici une liste de chaînes de texte couramment utilisées pour tester la sécurité d'un champ texte en HTML :

<script>alert('XSS attack')</script>
onmouseover="alert('XSS attack')"
javascript:alert('XSS attack')
<img src="javascript:alert('XSS attack')">
"><script>alert('XSS attack')</script>
javascript:eval('alert("XSS attack")')
<body onload=alert('XSS attack')>
<script>alert('XSS attack')</script>
&#x3C;script&#x3E;alert('XSS attack')&#x3C;/script&#x3E;
<img src=x onerror=alert('XSS attack')>
Il est essentiel de tester la sécurité d'un champ texte en HTML de manière approfondie en utilisant des outils spécialisés et en comprenant les vulnérabilités potentielles telles que les attaques XSS (Cross-Site Scripting).
```


Exercice 2 : À la suite de sa réponse, écrivez un prompt demandant s’il a donné plus de possibilité 

**A vous de jouer en intégrant votre prompt ci-dessous**

```bash
Donne d’autres propositions
```


Exercice 3 : Vous pouvez également créer un prompt pour demander de s’auto-évaluer en demandant d'améliorer sa réponse 

**A vous de jouer en intégrant votre prompt ci-dessous**

```bash
Ces textes sont-ils suffisant pour protéger mon champ texte ?
```
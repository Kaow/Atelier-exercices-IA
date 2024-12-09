# Few-shot prompting
Le few-shot prompting consiste à fournir au modèle quelques exemples d'entrées et de sorties pour lui indiquer le type de tâche à effectuer. C'est une méthode simple et intuitive qui peut être utilisée pour diverses tâches de génération de texte. 


Exercice 1 : Créez un prompt qui demande de résumer un document  
Exemple que vous pouvez utiliser :  
```bash
Mesdames et messieurs, permettez-moi de vous présenter notre toute nouvelle application mobile bancaire, "BankFormation". 
Avec BankFormation, gérer vos finances n'a jamais été aussi simple et pratique. 
Et grâce à votre application BankFormation, vous avez la possibilité de faire rembourser à 33% les formations que vous prenez.
Notre interface conviviale et intuitive, vous pouvez consulter vos soldes, effectuer des virements, payer vos factures et suivre vos dépenses en quelques clics seulement. 
De plus, notre application offre des fonctionnalités de sécurité avancées pour assurer la protection de vos informations financières. 
Téléchargez BankFormation dès aujourd'hui et découvrez la facilité de gérer vos finances en déplacement. Merci de votre attention et bonne journée !
```

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Résume ce texte : 
Mesdames et messieurs, permettez-moi de vous présenter notre toute nouvelle application mobile bancaire, "BankFormation". 
Avec BankFormation, gérer vos finances n'a jamais été aussi simple et pratique. 
Et grâce à votre application BankFormation, vous avez la possibilité de faire rembourser à 33% les formations que vous prenez.
Notre interface conviviale et intuitive, vous pouvez consulter vos soldes, effectuer des virements, payer vos factures et suivre vos dépenses en quelques clics seulement. 
De plus, notre application offre des fonctionnalités de sécurité avancées pour assurer la protection de vos informations financières. 
Téléchargez BankFormation dès aujourd'hui et découvrez la facilité de gérer vos finances en déplacement. Merci de votre attention et bonne journée !
```
**Quelle a été la réponse ?**

```bash
Ce texte est une promotion pour une application mobile bancaire, "BankFormation", qui simplifie la gestion financière grâce à une interface intuitive. 
Elle permet de consulter vos soldes, effectuer des virements, payer vos factures et suivre vos dépenses. 
En prime, bénéficiez d’un remboursement de 33 % sur vos formations. 
Sécurisée et pratique, elle facilite vos finances où que vous soyez.
```


Exercice 2 : Créez un nouveau prompt qui demande au modèle de résumer de nouveau ce document mais cette fois en utilisant un exemple de structure que vous voulez comme réponse.   
Exemple que vous pouvez utiliser :  
Nom de l'application  
Secteur d'activité  
Points clés  

**A vous de jouer en intégrant votre prompt ci-dessous**

```
En sortant les informations suivantes :  
Nom de l'application  
Secteur d'activité  
Points clés  

Peux-tu résumer ce texte : 
Mesdames et messieurs, permettez-moi de vous présenter notre toute nouvelle application mobile bancaire, "BankFormation". 
Avec BankFormation, gérer vos finances n'a jamais été aussi simple et pratique. 
Et grâce à votre application BankFormation, vous avez la possibilité de faire rembourser à 33% les formations que vous prenez.
Notre interface conviviale et intuitive, vous pouvez consulter vos soldes, effectuer des virements, payer vos factures et suivre vos dépenses en quelques clics seulement. 
De plus, notre application offre des fonctionnalités de sécurité avancées pour assurer la protection de vos informations financières. 
Téléchargez BankFormation dès aujourd'hui et découvrez la facilité de gérer vos finances en déplacement. Merci de votre attention et bonne journée !
```
**Quelle a été la réponse ?**

```bash
Nom de l'application : BankFormation Secteur d'activité : Application mobile bancaire

Points clés :

Gestion facile et pratique des finances
Possibilité de faire rembourser à 33% les formations
Interface conviviale et intuitive pour consulter les soldes, effectuer des virements, payer des factures et suivre les dépenses
Fonctionnalités de sécurité avancées pour protéger les informations financières
Encouragement à télécharger l'application pour une gestion facile des finances en déplacement
```

Exercice 3 : Comparer vos deux réponses et tester d’autres structures de réponses ou ajouter en plusieurs pour un seul prompt.
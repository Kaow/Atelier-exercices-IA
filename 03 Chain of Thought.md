# Chain of thought
La chain of thought consiste à guider le modèle dans un processus de réflexion ou de raisonnement, en utilisant des questions, des affirmations ou des instructions. C'est une méthode qui peut être utilisée pour créer des textes argumentatifs, analytiques ou informatifs. 


Exercice 1 : Créez un prompt qui demande au modèle d'écrire de la documentation pour un code lambda  
Exemple que vous pouvez utiliser :  
Un service API pour de la clientèle : 
```bash
const express = require('express') 
const app = express() 
const port = 5000 

app.get('/clients/:clientId', (req, res) => { 
  res.send('John Doe!') 
}) 

app.post('/clients', (req, res) => { 
  res.send('Client modified !') 
}) 

app.listen(port, () => { 
  console.log('Example app listening on port ${port}') 
}) 
```

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```


Exercice 2 : Créez un prompt qui demande au modèle la documentation pour la même API, mais cette fois-ci, en utilisant une méthodologie  
Exemple que vous pouvez utiliser :  
méthode OpenAPI

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```


Exercice 3 : [Bac à sable] Comparer vos deux réponses et tester d’autres méthodologies ou des plans personnalisées.
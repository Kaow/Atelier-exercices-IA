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

```bash
Voici mon code :  
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
  console.log(`Example app listening on port ${port}`) 
}) 

Ecrit une documentation pour ce service API 
```
**Quelle a été la réponse ?**

```bash
API de gestion de clients
***Introduction
Ce service API de gestion de clients permet d'effectuer des opérations de lecture et de modification sur des données de clients.

Endpoints
GET /clients/:clientId
Récupère les informations d'un client spécifié par son identifiant.

Paramètres de requête :

clientId : L'identifiant du client à récupérer.
Exemple de réponse :

John Doe!

***POST /clients
Modifie les informations d'un client.

Exemple de réponse :

Client modifié !
***Utilisation
Pour utiliser ce service API, effectuez des requêtes HTTP appropriées vers les endpoints spécifiés en utilisant l'URL de base du service API.

Exemple d'utilisation avec cURL :

# Récupérer les informations d'un client
curl http://localhost:5000/clients/123

# Modifier les informations d'un client
curl -X POST http://localhost:5000/clients -d "Nouvelles informations du client"

**Erreurs
En cas d'erreur, le service API renverra les codes d'erreur HTTP appropriés ainsi qu'un message d'erreur descriptif.

Ceci est un exemple de documentation de base pour le service API. Vous pouvez bien sûr l'adapter en fonction des besoins spécifiques de votre application.
```


Exercice 2 : Créez un prompt qui demande au modèle la documentation pour la même API, mais cette fois-ci, en utilisant une méthodologie  
Exemple que vous pouvez utiliser :  
méthode OpenAPI

**A vous de jouer en intégrant votre prompt ci-dessous**

```bash
Ecrit une documentation pour ce service API en utilisant la méthodologie OpenAPI 
```
**Quelle a été la réponse ?**

Bien sûr, voici un exemple de documentation OpenAPI pour votre service API :
```bash
openapi: 3.0.0
info:
  title: Gestion de clients API
  description: API de gestion de clients permettant d'effectuer des opérations de lecture et de modification sur des données de clients.
  version: 1.0.0

paths:
  /clients/{clientId}:
    get:
      summary: Récupérer les informations d'un client
      parameters:
        - in: path
          name: clientId
          required: true
          schema:
            type: string
          description: L'identifiant du client à récupérer.
      responses:
        '200':
          description: Succès
          content:
            application/json:
              schema:
                type: string
              example: John Doe!

    post:
      summary: Modifier les informations d'un client
      requestBody:
        required: true
        content:
          application/json:
            schema:
              type: string
      responses:
        '200':
          description: Succès
          content:
            application/json:
              schema:
                type: string
              example: Client modifié !

servers:
  - url: http://localhost:5000
```
Cette documentation OpenAPI spécifie les endpoints, les méthodes HTTP, les paramètres, les réponses et les exemples de réponses pour votre service API de gestion de clients. Vous pouvez l'adapter en fonction de vos besoins spécifiques.


Exercice 3 : [Bac à sable] Comparer vos deux réponses et tester d’autres méthodologies ou des plans personnalisées.
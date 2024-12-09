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
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```


## Sécurisation 
1.	Ecrivez un prompt qui va demander au modèle de sécuriser votre service  
Exemple que vous pouvez utiliser :  
Eviter les attaques sur votre requête SQL [“SELECT * FROM CLIENTS WHERE client=” + name] dans votre code 

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```
 
2.	Ecrivez un prompt qui va demander au modèle de vous aider sur l’ajout de sécurité sans donner de code  
Exemple que vous pouvez utiliser :  
Sécuriser une authentification web  

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```

## Regex 
1.	Ecrivez un prompt qui va demander au modèle l'explication d'une formule Regex 
Exemple que vous pouvez utiliser :  
```bash
^[\w\.=-]+@[\w\.-]+\.[\w]{2,3}$
```

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```

2. Demandez à l'IA de modifier la regex précédente pour qu'elle valide seulement les adresses mail gmail.com
Exemple:  
nom.prenom@gmail.com  
exemple@gmail.com  

**A vous de jouer en intégrant votre prompt ci-dessous**

```
Le prompt utilisé
```
**Quelle a été la réponse ?**

```bash
La réponse de votre IA
```
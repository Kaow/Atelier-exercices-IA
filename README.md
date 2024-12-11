# 🧪 Programmation avec l'IA Générative

## 👀 Introduction

Ce dépôt est conçu pour aider les développeurs à pratiquer et à améliorer leurs compétences en matière de développement et d'écriture de tests unitaires et d'application du développement piloté par les tests (TDD) en utilisant l'IA générative. Grâce à des exercices pratiques, organisés en dossiers, les développeurs apprendront comment l'IA peut faciliter la création, le raffinement et l'optimisation des tests unitaires pour leurs projets quotidiens.

## 👤 Public

Ce dépôt s'adresse aux développeurs de tous niveaux qui souhaitent intégrer des outils d'IA générative dans leur flux de travail, en mettant particulièrement l'accent sur les pratiques de tests unitaires et de TDD.

## 🛠️ Comment Utiliser Ce Dépôt

Pour cloner ce projet, utilisez la commande suivante :

```bash
git clone <url du dépôt>
```

Ensuite, installez les dépendances nécessaires :

```bash
mvn clean install
```

L'installation échouera car plusieurs tests sont actuellement invalides, mais c'est parfaitement normal !

## 🔎 Vue d'ensemble

Ce dépôt contient une petite application de gestion de comptes clients, _crm_.
La base de code ressemble à une simple application back-end avec des services et des dépôts, mais n'implique aucune connexion à une base de données physique.

Il présente principalement une classe `User` et une classe `Expense` ainsi que quelques fonctions utilitaires. Les utilisateurs peuvent avoir une liste de dépenses.

Ce dépôt contient plusieurs `TODOs` que nous allons implémenter tout au long de cet exercice.

---

## 🧩 Partie 1 - Génération d'algorithmes

Dans la première partie de ce cours, nous nous dirigeons vers le fichier `ExpenseUtils.java` où vous trouverez deux fonctions non implémentées.

- `List<User> sortUsersByTotalExpenses(List<User> allUsers)`

  Cette fonction prend une liste d'utilisateurs en paramètre et vise à trier les utilisateurs selon leurs dépenses totales par ordre décroissant.

- `Map<Long, Double> getUsersAverageExpensesMap(List<User> allUsers)`

  Cette fonction prend une liste d'utilisateurs en paramètre, calcule la dépense moyenne de chaque utilisateur (dépenses totales/nombre de dépenses) et renvoie une carte avec l'identifiant de l'utilisateur comme clé et la dépense moyenne comme valeur.

Examinez les classes `User` et `Expense` et implémentez ces deux fonctions en utilisant votre assistant IA. Une fois implémentées, exécutez les tests existants pour vérifier si votre solution est valide ou non.

### 🚀 Comment Exécuter les Tests

Exécutez Maven dans le terminal pour exécuter les tests :

```bash
mvn test -Dtest=ExpenseUtilsTest
```

### ✅ Critères de Validation :
Les tests sont exécutés avec succès !

---

## 📝 Partie 2 - Tests unitaires

Dans la classe `StringUtils`, nous avons plusieurs fonctions utilitaires à tester :

- **isValidEmail** : Cette fonction vérifie si une adresse e-mail est valide.
- **capitalize** : Cette fonction formate et capitalise la première lettre de chaque mot d'une chaîne. Ex : "I Eat An Apple", "John"
- **normalizePhoneNumber** : Cette fonction convertit un numéro de téléphone donné en un format normalisé, c'est-à-dire supprime les espaces.
- **sanitize** : Cette fonction supprime tous les caractères spéciaux d'une chaîne afin de se protéger des injections SQL.

Votre objectif est d'écrire des tests unitaires pour chaque méthode en utilisant Continue pour couvrir divers scénarios, à la fois valides et invalides.

### 🛠️ Instructions

1. Implémentez les tests unitaires dans la classe `StringUtilsTest` pour les trois méthodes mentionnées.
2. Assurez-vous de tester plusieurs cas pour chaque méthode, couvrant toutes les situations possibles. Un exemple est fourni pour vous aider à démarrer.
3. Vérifiez que tous les tests unitaires dans `StringUtilsTest` passent avec succès.

### 🚀 Comment Exécuter les Tests

Exécutez Maven dans le terminal pour exécuter les tests :

```bash
mvn test -Dtest=StringUtilsTest
```

### ✅ Critères de Validation
- Tous les tests unitaires écrits réussissent.
- Les cas limites (par exemple, une chaîne nulle, une chaîne vide, etc.) sont bien couverts.

---

## 🛠️ Partie 3 - Tests et Mocking

### 1. Implémenter les Tests Unitaires dans `UserServiceTest`

- Dans `UserServiceTest`, une configuration est déjà présente pour écrire des tests unitaires pour diverses fonctions dans `UserService`.
- Vous trouverez des squelettes de tests avec une description de ce qui est attendu.
- Utilisez ces lignes directrices et Continue pour écrire les tests unitaires nécessaires.
- N'oubliez pas de mocker les appels à `userRepository`.
- Exécutez les tests et assurez-vous qu'ils passent avec succès.

### 2. Ajouter la fonctionnalité `deleteUser` dans `UserService`

- Nous voulons ajouter une méthode `void deleteUser(Long id)` qui suit ces règles :
  - Si aucun utilisateur n'est associé à cet ID, aucune action ne doit être prise.
  - Si l'utilisateur existe et a le rôle Admin, l'opération doit échouer, en lançant une exception `NotAllowedException` avec le message _"You cannot delete an admin user"_.
  - La méthode `deleteUser(id)` dans `UserRepository` ainsi que l'exception existent déjà.
  - Une fois cette méthode implémentée, écrivez des tests unitaires dans `UserServiceTest` pour couvrir ces cas.

### 🚀 Comment Exécuter les Tests

Exécutez Maven dans le terminal pour exécuter les tests :

```bash
mvn test -Dtest=UserServiceTest
```

### ✅ Critères de Validation :
- Les tests unitaires écrits réussissent.
- Les tests couvrent les différentes règles, y compris la vérification de l'unicité du numéro de téléphone.

### 💡 Conseils Mockito :

Utilisez cette feuille de triche pour vous aider à mocker certains comportements courants :

```java
// Mocker un retour pour une recherche par ID
when(userRepository.findById(1L)).thenReturn(new User(...));

// Vérifier si une fonction est appelée un certain nombre de fois
verify(userRepository, times(n)).findById(1L);

// Vérifier que la fonction n'est jamais appelée
verify(userRepository, never()).deleteUser(1L);

// Vérifier la valeur d'un argument d'entrée
verify(userRepository).save(argThat(user -> user.getName().equals("John")));

// Vérifier que deux objets sont égaux
assertEquals(expected, actual);

// Capturer une exception attendue
assertThrows(ExpectedException.class, () -> {
    // Code qui devrait déclencher une exception
});
```

## 🎯 Conclusion

En complétant ces exercices, vous améliorerez non seulement vos compétences en développement et en tests unitaires, mais vous découvrirez également comment l'IA peut devenir un allié puissant dans le développement de logiciels.



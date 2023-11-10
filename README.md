# bank-accounts-management-builder-singleton-prototype-patterns
Objectif : 
Développer une application qui permet de gérer des comptes bancaires.
Chaque Compte est défini par :
   - accountId de type String
   - balance de type double
   - currency : String
   - accountType : AccountType (SAVING_ACCOUNT, CURRENT_ACCOUNT)
   - accountStatus : AccountStatus (CREATED, ACTIVATED, BLOCKED, SUSPENDED)
Travail demandé :
  1. Crée la classe BankAccount
  2. Créer l'interface AccountRepository déclarant les opérations qui permettent de :
       - Ajoute run compte
       - Consulter tous les comptes
       - Consulter un compte sachant son id
       - Chercher un compte avec un prédicat quelconque
   3. Créer une implémentation (BankRepositoryImpl)de cette interface en stockant les comptes dans une collection de type HashMap.
   4. Implémenter le pattern Builder pour la classe Compte
   5. Implémenter le pattern Singleton pour créer une instance unique de BankRepositoryImpl
   6. Implémenter le pattern Prototype pour la classe Compte
   8. Appliquer d'autres design pattern utiles pour cette application

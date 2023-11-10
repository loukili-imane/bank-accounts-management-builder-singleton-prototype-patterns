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
     ![image](https://github.com/loukili-imane/bank-accounts-management-builder-singleton-prototype-patterns/assets/93887037/8ee70ba4-12b2-470f-b877-7f0e3413059e)

  3. Créer l'interface AccountRepository déclarant les opérations qui permettent de :
       - Ajoute run compte
       - Consulter tous les comptes
       - Consulter un compte sachant son id
       - Chercher un compte avec un prédicat quelconque
     ![image](https://github.com/loukili-imane/bank-accounts-management-builder-singleton-prototype-patterns/assets/93887037/a4f1f433-9069-4a20-8477-8fb65e6c9a77)
   5. Créer une implémentation (BankRepositoryImpl)de cette interface en stockant les comptes dans une collection de type HashMap.
   6. Implémenter le pattern Builder pour la classe Compte
   7. Implémenter le pattern Singleton pour créer une instance unique de BankRepositoryImpl
   8. Implémenter le pattern Prototype pour la classe Compte
   9. Appliquer d'autres design pattern utiles pour cette application

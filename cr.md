# Questions
### 1- Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme ClassTestJPA ?


En base de données nous observons la creation de la table "class_testjpa" correspondante à notre classe java "ClassTestJPA". Et ça a été possible
car on s'est mis en mode create et qu'on a rendu notre classe persistant grâce à l'annotation @Entity.
Nous pouvons voir les colonnes : 
* my_id_test
* jpa_seed
* power_type
* saved_at

qui correspondent aux attributs ayant le même nom.
L'annotation @Id correspond à la contrainte de clé primaire.

### 2-Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ?

Grâce à @Colomn, on obtient les effets suivants:
* @Column(unique = true) précedant l'attribut "private String testName;", permet de rendre le champ "test_name" unique dans la base.
* @Column(precision = 1) sur l'attribut "Double jpaSeed" permet de limiter la precision à un chiffre significatif après la virgule.
* @Column() sur "Date savedAt" permet d'utiliser les propriétés de la colonnes avec les valeurs par défaut selon le type; dans notre cas
qui génère "saved_at timestamp without time zone", utilisé pour stocker des dates et heures sans tenir compte de fuseau horaire.

### À votre avis, dans quels cas est-il nécessaire de mettre les annotations @Column ? **

l'annotation @colomn permet d'indiquer la correspondances entre nos attributs et les leurs champs correspondants dans
la base de données(grâce à la propriété name si on est en mode validate) ou de leur mettre des propriétés comme "unique, precision,..." (en mode create/validate)


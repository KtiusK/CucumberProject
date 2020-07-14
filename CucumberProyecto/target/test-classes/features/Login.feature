Feature: Aplicación Login

Scenario: Home Page default login
Given Usuario se logea en la pagina
When Usuario se logea en la aplicación con usuario "jin" y password "1234"
Then Home page is abierta
And La tarjeta es desplegada "true"


#Negativo escenario

Scenario: Home Page default login
Given Usuario se logea en la pagina
When Usuario se logea en la aplicación con usuario "john" y password "234"
Then Home page is abierta
And La tarjeta no esta disponible "false"
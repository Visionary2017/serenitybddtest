Feature: Iniciar sesion en Everilion
  Como usuario de Everilion quiero autenticarme para acceder al sistema

Scenario: El usuario inicia sesion en Everilion
    Given ingresar a la pagina de Everilion
    And que he ingresado el nombre de usuario "48676537"
    And que he ingresado la contrasenia "everis"
    When realizar click entrar
    Then se visualiza la pagina de bienvenida con el nombre "Angel Jhonatan Mamani"

Feature: Ingresar a Tarjeta de un cliente
  	Como usuario de Everilion quiero ingresar a la opcion tarjeta de un cliente de everilion
	
  Scenario: El usuario ingresa a la opcion de tarjetas
    Given ingresa a la opcion de clientes con el usuario "48676537" y "everis"
    And buscar por nombre cliente que contiene "PROMOCARD COBRA PERU"
    When visualizar la ventana de tarjetas
    And ingresar datos
    Then cerrar la ventana de tarjetas
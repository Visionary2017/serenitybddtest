Feature: Realizar un CRUD de un cliente
	Como usuario de everilion quiero create,reader,update,delete 

Scenario: El usuario ingresa a opcion de clientes para crear
	Given ingreso a la opcion de clientes con el usuario "48676537" y "everis"
	And completar los campos del cliente	
	When guardar los datos ingresados
	Then visualizo en la lista de clientes
	
Scenario: El usuario ingresa a opcion de clientes para consultar
	Given ingreso a la opcion de clientes con el usuario "48676537" y "everis"
	And busco el cliente ""	
	When consulto cliente
	Then visualizo en la lista de clientes
	
Scenario: El usuario ingresa a opcion de clientes para actualizar
	Given ingreso a la opcion de clientes con el usuario "48676537" y "everis"
	And modifico los campos del cliente
	When guardo los cambios
	Then visualizo en la lista de clientes
	
	
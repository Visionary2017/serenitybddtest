Feature: Funcionalidad de busqueda de productos
  Scenario: Busqueda sin resultados
    Given Se carga la pagina de busqueda
    When Buscamos el termino "microsoft"
    Then Se muestra el mesaje "No results were found for your search"
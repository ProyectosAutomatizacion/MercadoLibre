#Author: Yesica Andrea Martin
#Feature para el inicio de sesion aplicacion Mercado Libre
#
@tag
Feature: Busquedas y contenidos

  #Ingreso y pagina
  @tag1
  Scenario Outline: Verificar que la pagina principal corresponda a la selección del pais seleccionado
    Given Ingreso a navegador
    When Seleccionar un pais <pais>
    Then Verificar que corresponda al pais seleccionado

    Examples: 
      | pais |
      | "CL" |

  #| "CO" |
  #| "CR" |
  #| "EC" |
  #| "MX" |
  #| "PE" |
  #| "UY" |
  #| "VE" |
  @tag2
  Scenario Outline: Validar usuario no registrado
    Given Ingreso a navegador
    When Seleccionar un pais <pais>
    And Ingresar a Login
    And Ingresar correo aleatorio <dominio>
    Then Verificar que el usuario no esté registrado

    Examples: 
      | pais | dominio      |
      | "CO" | "@gmail.com" |

  @tag3
  Scenario Outline: Verificar que no ingrese con una contrasena incorrecta
    Given Ingreso a navegador
    When Seleccionar un pais <pais>
    And Ingresar a Login
    And Ingresar correo <correo>
    And Ingresar contrasena <contrasena>
    Then Verificar que la clave sea incorrecta

    Examples: 
      | pais | correo          | contrasena |
      | "CO" | "123@gmail.com" | ""         |

  #Busquedas
  @tag4
  Scenario Outline: Verificar mensaje pop-up cuando el contenido sea para adultos
    Given Ingreso a navegador
    When Seleccionar un pais <pais>
    And Ingresar dato de busqueda <dato>
    Then Verificar pop-up

    Examples: 
      | pais | dato     |
      | "CO" | "Masturbadores" |
      
      @tag5
  Scenario Outline: Validar que el sistema muestre un pop-up al realizar una busqueda y seleccionar el filtro para adultos
    Given Ingreso a navegador
    When Seleccionar un pais <pais>
    And Ingresar dato de busqueda <dato>
    And Aplicar filtro
    Then Verificar pop-up

    Examples: 
      | pais | dato     |
      | "CO" | "Dildos" |

Feature: print holaMundo con nombre por consola
@TEST_IXR-100
 Scenario Outline: imprimir saludo personalizado por consola
   Given Entrego el "<nombre>"
   When ejecuto la clase
   Then se imprimie msj Hola mundo mas el "<nombre>"

   Examples:
     |nombre  |
     |Jeni    |
     |David   |
     |Diego   |

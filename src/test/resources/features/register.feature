@Portalaerocivil
Feature: Portal Aerocivil
  @tag1
  Scenario: Ir a portal de aero civil y descargar el documento pdf
    Given el usuario ingresa a la pagina del portal de aerocivil
    When el puede descargar el archivo pdf
    Then valida que si se descargo correctamente
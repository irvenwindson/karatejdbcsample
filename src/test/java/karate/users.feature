Feature: Karate Basic Todos

Background:
    * url apiUrl

@getonly
Scenario: Get all todos
    When method Get
    Then status 200
    * def dbnum = db.readJson("SELECT numberid, numbertexten FROM NUMSTR FOR JSON PATH;")
    * print dbnum
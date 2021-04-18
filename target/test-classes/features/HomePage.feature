
Feature: Akbank Mobile App Regression

  Scenario: Testing Akbank Mobile App
  
    Given  Open Play Store
    And 	 Click Searchbox
    And 	 Send "Akbank" search field
    And  	 Click Akbank App
    And  	 Download Akbank App
    And  	 Verify Download Akbank App
    And    Click Settings
    And    Click Security
    And    Click Location
    And    Permission On Location
    And 	 Open Akbank App
    And 	 Skip Intro
    #And  	 Verify Welcome Message "İyi günler"
    And  	 Click En yakin Akbank button
    And  	 Click Atm Btn 
    And  	 Click Menu Bar
    And  	 Click Third Atm Option
    And  	 Click Yol Tarifi
Feature: Register 

@register
Scenario: Register on TestMeApp 
	Given user open TestMeApp 
	When user click signup 
	And enter user name as "Bhakti" 
	And enter first name as "Bhakti" 
	And enter last name as "Jaju" 
	And enter password as "Bhakti@25" 
	And enter confirm password as "Bhakti@25" 
	And user select gender 
	And enter email as "bhaktijaju25@gmail.com" 
	And enter mobile number as "9156295756" 
	And dob as "25/03/1998" 
	And address as "Pune" 
	And select security question 
	And enter answer as "blue" 
	Then user registered successfully 
	
@login
Scenario: Login using datatable 
	Given user open TestMeApp 
	When user click signin 
	And user enter credentials as 
		|lalitha|
		|Password123|

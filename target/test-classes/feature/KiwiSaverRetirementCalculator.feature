@UATTest
Feature: Westpac KiwiSaver Scheme Risk Profiler and Retirement Calculator

	Scenario: Verify Information Icon on KiwiSaver Calculator
		Given The user open a browser, enters to Westpac New Zealand Limited website
		And navigates to KiwiSaver > KiwiSaver calculators > Click here to get started button
		When The user clicks on information icon besides the "Employment Status" field
		Then message "If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make." is displayed below the "Employment Status" field
		
		
	Scenario: Verify Retirement Projected Balance
		Given The user open a browser, enters to Westpac New Zealand Limited website
		And navigates to KiwiSaver > KiwiSaver calculators > Click here to get started button
		When The user put on values on fields
		Then it will calculate their KiwiSaver projected balance at retirement

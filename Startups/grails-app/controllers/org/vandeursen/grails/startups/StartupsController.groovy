package org.vandeursen.grails.startups

class StartupsController {

    static scaffold = true
	
	def allStartups() {
		[allStartups: Startups.list()]
	}
}

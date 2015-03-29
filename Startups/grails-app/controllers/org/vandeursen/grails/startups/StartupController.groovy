package org.vandeursen.grails.startups

class StartupController {

    static scaffold = true
	
	def allStartup() {
		[allStartup: Startup.list()]
	}
}

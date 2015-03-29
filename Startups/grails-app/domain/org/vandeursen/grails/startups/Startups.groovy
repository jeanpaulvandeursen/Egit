package org.vandeursen.grails.startups

class Startups {

	String name
	String alias
	Date initialContact
	
    static constraints = {
    	name(nullable: false,blank: false, maxSize: 50)
		alias(nullable: true, maxSize: 50)
		initialContact()
	}
	
}

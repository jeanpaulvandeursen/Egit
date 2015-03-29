package org.vandeursen

class Concepts {
	
	static void main(def args){
		def firstName='Jean-Paul'
		def lastName='van Deursen'
		def name="$firstName $lastName"
		println name
		def myList=[1,2,3,4]
		// Closure example
		myList.each { println it }
		assert(name=="Jean-Paul van Deursen")
	}
}

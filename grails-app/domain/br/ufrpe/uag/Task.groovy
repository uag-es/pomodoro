package br.ufrpe.uag

class Task {

	// propriedades
	String summary
	String details
	Date dateCreated
	Date deadline
	String status
	long timespent

	// relacionamento
	Tag owner
	static hasMany = [tags:Tag]
	static belongsTo = Tag

	// restricoes
	static constraints = {
		summary size: 10..140, blank: false
		dateCreated min: new Date(), blank: false
		deadline min: new Date(), blank: false
		status size: 1..10, blank: false
		timespent minSize: 10000
	}
}

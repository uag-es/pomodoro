package br.ufrpe.uag

class Tag {

	// propriedades
	String name
	
	// relacionamentos
	static hasMany = [tasks:Task]
	
	// restricoes
    static constraints = {
		name size:3..20, blank:false
    }
}
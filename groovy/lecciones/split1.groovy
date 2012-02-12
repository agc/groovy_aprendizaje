#!/usr/bin/env groovy


def textoToMap(String texto) {
	NEW_LINE = System.getProperty("line.separator") 
	def lineas = texto.split(NEW_LINE)
	
	lineas.collect {item->		
		def linea
		def lineamapeada=[:]
		linea=item.split(' ')	
		lineamapeada.a=linea[0]
		lineamapeada.b=linea[1]
		lineamapeada
	}

}
println 'Hello,How,Are,You,Today'.split(',').join('.')

println 'Hello How Are You Today'.split(' ').join('..')


String texto= '''Hello tu_y_tu
Hola yo_y_yo '''

println textoToMap(texto)


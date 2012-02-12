#!/usr/bin/env groovy


def textoToMap(campos,texto) {
	NEW_LINE = System.getProperty("line.separator") 
	def lineas = texto.split(NEW_LINE)
	
	lineas.collect {item->		
		def linea
		def lineamapeada=[:]
		linea=item.split(' ')	
		campos.eachWithIndex { nombre,indice->lineamapeada[nombre]=linea[indice]}
		
		lineamapeada
	}

}

def crearEquiposConTexto(campos,texto) {
        def lista=textoToMap(campos,texto)
        lista.collect{mapa->mapa.values().toList()}


    }

String texto= '''2007 ST-Ordenador-2 secretaria 250 clonico960amdatloncore 3600 ADMINISTRACION Ordenador 28 ordenador
2004 ST-Ordenador-3 secretaria 7 clonico512celeroncpu 293 ADMINISTRACION Ordenador 28 ordenador
2004 ST-Ordenador-3 secretaria 75 clonico512celeroncpu 293 ADMINISTRACION Ordenador 28 ordenador
2005 ST-Ordenador-4 secretaria 75 clonico512pentiumIV2 600 ADMINISTRACION Ordenador 28 ordenador
comprobar ST-Impresora-1 secretaria - lexmark - ADMINISTRACION Impresora 28 impresora'
'''

/*
2004		ST-Ordenador-3		secretaria	75	clonico512celeroncpu 293	ADMINISTRACION	Ordenador	28	ordenador
2005		ST-Ordenador-4		secretaria	75	clonico512pentiumIV2 600	ADMINISTRACION	Ordenador	28	ordenador
comprobar	ST-Impresora-1		secretaria	-	lexmark				-	ADMINISTRACION	Impresora	28	impresora'
*/''



println crearEquiposConTexto(['anoDeCompra','codigo','descripcion_ubicacion','discoDuro','memoria','modelo','red','tipo'],texto)


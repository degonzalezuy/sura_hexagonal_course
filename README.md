# DOJO reto para curso de Arquitectura Hexagonal
El mismo es un Proyecto basado en el plugin del Banco Colombia.
Implementando Clean Architecture

#Implementaci�n
Se utiliz� el cli de gradle para la creaci�n de los diferentes elementos.

Se utilizaron los siguientes comandos para la creaci�n de los diferentes elementos.

Creaci�n de un Modelo
gradle generateModel --name=[name]
gradle gm --name [modelName]

#Creaci�n de un UseCase
gradle generateUseCase --name=person

#Creaci�n de un Entry Point
gradle generateEntryPoint --type=WEBFLUX
gradle gep --type [entryPointType]

#Creaci�n de un Driven Adapter
gradle generateDrivenAdapter --type=GENERIC --name bancolombiaService

#Creaci�n de un repository MongoDB
gradle generateDrivenAdapter --type=mongodb



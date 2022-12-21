# DOJO reto para curso de Arquitectura Hexagonal
El mismo es un Proyecto basado en el plugin del Banco Colombia.
Implementando Clean Architecture

#Implementación
Se utilizó el cli de gradle para la creación de los diferentes elementos.

Se utilizaron los siguientes comandos para la creación de los diferentes elementos.

Creación de un Modelo
gradle generateModel --name=[name]
gradle gm --name [modelName]

#Creación de un UseCase
gradle generateUseCase --name=person

#Creación de un Entry Point
gradle generateEntryPoint --type=WEBFLUX
gradle gep --type [entryPointType]

#Creación de un Driven Adapter
gradle generateDrivenAdapter --type=GENERIC --name bancolombiaService

#Creación de un repository MongoDB
gradle generateDrivenAdapter --type=mongodb



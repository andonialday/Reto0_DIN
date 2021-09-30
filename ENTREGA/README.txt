// Se recomienda apertura de este archivo con Notepad++ o similares para no "romper" la cohesión debido a las tabulaciones //

URL Repositorio GitHub : 	https://github.com/andonialday/Reto0_DIN/

Archivos .jar utilizados como librerías:	mysql-connector-java-8.0.26
											swing-layout-1.0.4
											
Consideraciones de funcionamiento:
	Los archivos de configuración se cncuentran ubicados en el paquete properties.
	Para su funcionamiento, la modificación de los ficheros es el siguiente:
		Configuración de la conexión a la base de datos - config.properties
		Configuración del mensaje a obtener desde la implementación FileModelImplementation - file.properties
		Configuración de la implementación de modelo a usar por la aplicación - model.properties
		Configuración de la implementación de vista a usar por la aplicación - view.properties
		
Fichero					Campo			Parámetros iniciales						Parámetros opcionales
config.roperties		DB				reto0din									* nombre de la base de datos a la que se conecta
						URL				jdbc:mysql://localhost:3306/reto0din		* url de conexión a la base de datos
						USER			root										* usuario con permisos CRUD en la base de datos
						PASSWORD		abcd*1234									* contraseña de conexión del usuario a la base de datos
						DRIVER			com.mysql.jdbc.Driver						* identificación del driver de conexión empleado

file.properties			Saludo			Hola Mundo File								* Mensaje que se desee obtener al usar la implementación FileModelimplements

model.properties		Model_Type		DDBB										File

view.properties			View_Type		JavaFX										Text
																					Swing
																					
		NOTA - 	Tanto en el fichero file.properties como en view.properties los campos se encuentran preparados para comentar y descomentar.
				Ejemplo:    En el fichero model.properties se puede cambiar  	Model_Type=BBDD			por			# Model_Type=BBDD
																				# Model_Type=File					Model_Type=File
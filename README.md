# Taller01Semestre2
# Desarrollo Taller 01 Adonis Subiabre
# Identificacion de clases: 
# la primera clase sera Deportista, esta cuenta con atributos como nombre, apellido, correoElectronico, numeroContacto, tipoDeporte y posición.
# la segunda clase sera Deporte, que tiene un conjunto especifico de equipos.
# la tercera clase sera Equipo, en el que cada equipo tiene una lista de jugadores, un entrenador y un historial de partidos jugados.
# la cuarta clase sera Partido, en la que tiene atributos como equipoOponente, resultado, fecha y lugarJugado.
# la quinta clase sera Entrenador, esta hereda de Deportista y tiene atributos extras como experiencia y especialidadDeportiva.
# la sexta clase sera Futbol, esta hereda de Deporte y tiene atributos extras como tipoCampo(natural o sintético) y tipoPartido(local o visitante).
# la septima clase sera Baloncesto, esta hereda de Deporte y tiene atributos extras como tipoCancha(interio o exterior) y numTiempoJugado.
# la octava clase sera Tenis, esta hereda de Deporte y tiene atributos extras como tipoSuperficio(cesped, arcilla o dura) y tipoPartido(individual o dobles).
# Entre las principales funcionalidades encontramos: 
# se agrega una nueva clase llamada GestorClubDeportivo, en ella habrán metodos como registrarDeportista,
# registrarEntrenador (ambos tienen validación por correoElectronico, es decir, no se repite el correo), un metodo crearEquipo (en el que se les asigna jugadores y entrenadores),
# metodo registrarPartido, metodo estadisticasJugador (con el correoElectronico) y metodo estadisticasEquipo (con el entrenador).
# metodo para mostrar todos los deportistas que hayan sido agregados

"""
TAREA (ARRAYS): CLASIFICACIÓN DE BASES DE DATOS
Versión Python.

Se recorre una lista de sistemas, se solicita la clasificación de cada uno,
se guarda en una segunda lista y al final se muestra el resumen.
"""

sistemas = [
    "PostgreSQL",
    "MongoDB",
    "InfluxDB",
    "MySQL",
    "Redis",
    "Prometheus",
    "SAP HANA",
    "Cassandra",
    "Oracle",
    "OpenTSDB"
]

clasificaciones = [
    "Relacional",
    "No relacional",
    "Series temporales"
]

respuestas = []

print("CLASIFICACIÓN DE BASES DE DATOS")
print("Opciones: 1. Relacional | 2. No relacional | 3. Series temporales\n")

for sistema in sistemas:
    print(f"\nSistema: {sistema}")
    while True:
        print("1. Relacional")
        print("2. No relacional")
        print("3. Series temporales")
        opcion = input("Escribe el número de clasificación: ").strip()

        if opcion in ("1", "2", "3"):
            respuestas.append(clasificaciones[int(opcion) - 1])
            break
        else:
            print("Opción no válida. Escribe 1, 2 o 3.")

print("\n   RESUMEN DE CLASIFICACIÓN    ")
for i in range(len(sistemas)):
    print(f"{sistemas[i]}: {respuestas[i]}")

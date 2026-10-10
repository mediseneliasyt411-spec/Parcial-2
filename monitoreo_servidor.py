def leerPorcentaje(nombre):
    valor = float(input(f"Ingrese el porcentaje de {nombre}: "))
    return valor

def evaluarProcesador(porcentaje):
    if porcentaje <= 70:
        return "Estado normal"
    elif porcentaje <= 85:
        return "Requiere supervisión"
    else:
        return "Estado crítico"

def evaluarMemoria(porcentaje):
    if porcentaje <= 75:
        return "Estado normal"
    elif porcentaje <= 85:
        return "Requiere supervisión"
    else:
        return "Estado crítico"

def evaluarAlmacenamiento(porcentaje):
    if porcentaje <= 75:
        return "Estado normal"
    elif porcentaje <= 85:
        return "Requiere supervisión"
    else:
        return "Estado crítico"

def evaluarServidor(estado_proc, estado_mem, estado_alm):
    if estado_proc == "Estado crítico" or estado_mem == "Estado crítico" or estado_alm == "Estado crítico":
        return "Estado crítico"
    elif estado_proc == "Requiere supervisión" or estado_mem == "Requiere supervisión" or estado_alm == "Requiere supervisión":
        return "Requiere supervisión"
    else:
        return "Estado normal"

def mostrarResultados(proc, estado_proc, mem, estado_mem, alm, estado_alm, estado_servidor):
    print(f"Procesador: {proc}% — {estado_proc}")
    print(f"Memoria RAM: {mem}% — {estado_mem}")
    print(f"Almacenamiento: {alm}% — {estado_alm}")
    print(f"Estado del servidor: {estado_servidor}")

print("Monitoreo de un servidor")

porcentaje_proc = leerPorcentaje("procesador")
porcentaje_mem = leerPorcentaje("memoria RAM")
porcentaje_alm = leerPorcentaje("almacenamiento")

estado_proc = evaluarProcesador(porcentaje_proc)
estado_mem = evaluarMemoria(porcentaje_mem)
estado_alm = evaluarAlmacenamiento(porcentaje_alm)
estado_servidor = evaluarServidor(estado_proc, estado_mem, estado_alm)

mostrarResultados(porcentaje_proc, estado_proc, porcentaje_mem, estado_mem, porcentaje_alm, estado_alm, estado_servidor)

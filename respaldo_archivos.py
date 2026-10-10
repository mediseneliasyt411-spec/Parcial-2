def faltanArchivos(respaldados):
    return respaldados < 5

respaldados = 0

while faltanArchivos(respaldados):
    print("\n1. Respalda un archivo")
    print("2. Ver avance")
    print("3. Cancelar")
    
    opcion = input("Elige una opción: ")
    
    if opcion == "1":
        respaldados = respaldados + 1
        print("Archivos respaldados:", respaldados)
        
        if respaldados == 5:
            print("Respaldo listo")
            
    elif opcion == "2":
        print("Se han respaldado", respaldados, "archivos")
        continue
        
    elif opcion == "3":
        print("Respaldo cancelado")
        break
        
    else:
        print("Opción no válida")

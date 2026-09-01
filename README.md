# Parcial Primer Tercio (DOSW)

---

## Información:
* **Nombre Completo:** Juan David Munar Chaparro
* **Grupo DOSW:** 
* **LINK REPO:** https://github.com/JUDAMUCH03/DOSW_BITACORA.git
* **Enunciado Asignado**:

---

### 1. Acceso a Draw.io
<img width="1919" height="934" alt="image" src="https://github.com/user-attachments/assets/130984c9-2ece-42c8-8a5b-68562595ddfb" />



---

### 2. Acceso a Figma
<img width="1919" height="947" alt="image" src="https://github.com/user-attachments/assets/2ed023c7-d9a7-4d75-aacf-21fd9b76a643" />



---

### 3. Validación de Maven

<img width="570" height="111" alt="image" src="https://github.com/user-attachments/assets/b26e2378-9ec9-4039-81d6-b90c04b6e5ed" />

---

# Desarrollo parcial

1. Imagen C4

<img width="1002" height="582" alt="C4drawio" src="https://github.com/user-attachments/assets/7f14bc71-1b7a-4fdf-9e1d-c9c3ed4180d8" />

2. Identificacion de Requerimentos:

**Funcionales:**

UFH-01: Crear pedido en la app
Descripcion:Permitir al usuario crear un pedido teniendo en cuenta que debe tener minimo un producto base y un producto adicional
Actor: Estudiante/Docente

UFH-02: Permitir elegir metodo de entrega
Descripcion: Validar que el lugar elegido por el usuario se encuentre entre las opciones: Consumo local, Consumo en salon o para llevar
Actor: Estudiante/Docente


UFH-03: Visualizar resumen pedido
Descripcion: Monitorear en un panel el estado final de mi pedido (comida, lugar de entrega), de forma detallada junto con el precio final antes de confirmar dicho pedido
Actor: Estudiante/profesor


**No Funcionales:**
UFH-RNF-01: Responder en ≤ 1.5 s para el 90% de las peticiones
Descripcion: El Sistema debe garantizar que al menos el 90% de las peticiones diarias realizadas se reselvan de manera satisfactoria, verificando el tiempo y cada peticion en AWS S3 Buckets

UFH-RNF-02: La información de los pedidos se almacena en AWS Mongo Atlas.
Descripción: El almacenamiento de la informacion de los pedidos debe gestionarse en una base de datos relacional AWS Mongo Atlas.

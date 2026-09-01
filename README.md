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

UFH-01: Crear pedido personalizado en la app
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

3. Casos de uso

<img width="656" height="267" alt="casoUso" src="https://github.com/user-attachments/assets/ef480dd3-f4d4-4b45-bae5-c9153ec09a9c" />


4. Plantilla analisis de requerimentos

Codigo: UFH-01
Nombre: Crear pedido personalizado en la app
Descripcion: Permitir al usuario crear un pedido teniendo en cuenta que debe tener minimo un producto base y un producto adicional
Como se ejecutara: Entrar a la app web, dirigirse a la seccion de crear un pedido, seleccionar el producto base obligatorio, luego poner un producto extra a eleccion, 
Actor principal: Usuario general
Precondiciones: Debe estar registrado como usuario de la Universidad, no debe tener un pedido en activo.
Datos de entrada: producto base, productos extras
Datos de salida: -
Flujo Basico: Pide su comida con su base y extras adecuados, sigue en la linea a elegir su lugar
Flujo Alterno: Pide demasiados productos base o extra, esto genera una alerta y debe eliminar algunos de los productos



Codigo: UFH-03
Nombre: Visualizar resumen pedido final
Descripcion: Monitorear en un panel el estado final de mi pedido (comida, lugar de entrega), de forma detallada junto con el precio final antes de confirmar dicho pedido
Como se ejecutara:
Actor principal: Usuario general
Precondiciones: Pedido aprobado en UFH-01
Datos de entrada: -
Datos de salida: Resumen completo de pedido, especificando la comida, el lugara  entregar, precio final.
Flujo Basico:El usuario pidio correctamente su pedido, visibilizando el total del pedido el cual es igual a la suma del precio final del producto más el costo de la entrega.
Flujo Alterno: EL usuario tiene el resumen de su pedido, pero aparecen cosas que no pidio o el precio no es el adecuado. El usuario debe darle a cancelar pedido.

Imagenes Figma:

<img width="335" height="692" alt="Screenshot 2026-09-01 155423" src="https://github.com/user-attachments/assets/90fe9a56-c67b-438c-b91c-a8c1235f3175" />

<img width="331" height="697" alt="Screenshot 2026-09-01 155431" src="https://github.com/user-attachments/assets/c6ef16c2-438f-4bf7-ba28-d80331e23e8f" />


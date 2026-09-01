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

Descripcion: Permitir al usuario armar su pedido seleccionando entre 1 y 5 productos base, agregando extras opcionales a cada producto y eligiendo el metodo de entrega (consumo local, para llevar o entrega en salon).  

Como se ejecutara: Entrar a la app web, ir a la seccion de crear pedido, seleccionar el producto base obligatorio, marcar las adiciones deseadas, seleccionar el metodo de entrega (indicando bloque y salon si aplica) y continuar al resumen.  

Actor principal: Estudiante / Docente  

Precondiciones: Estar registrado con correo institucional 

Datos de entrada: Producto base elegido, lista de extras seleccionados, tipo de entrega, bloque y salon (obligatorio solo si es entrega en salon).  

Datos de salida: Items agregados al pedido con desglose y subtotal actualizado en tiempo real. 

Flujo Basico: El usuario selecciona su producto base, le agrega los extras que quiere, elige el metodo de entrega, el sistema calcula el subtotal y lo deja pasar a la pantalla de resumen del pedido.  

Flujo Alterno:Si el usuario intenta agregar mas de 5 productos al pedido, el sistema bloquea la accion y muestra una alerta indicando que el maximo permitido son 5 productos. 



Codigo: UFH-03

Nombre: Visualizar resumen pedido

Descripcion: Mostrar en un panel el desglose completo del pedido (productos, adiciones de cada uno y costo del metodo de entrega) junto con el precio final total antes de confirmar la compra.  

Como se ejecutara: Al terminar de armar el pedido en UFH-01, la app muestra la pantalla de resumen donde el usuario revisa el detalle y decide si confirma la orden o se devuelve a editarla.  

Actor principal: Estudiante / Docente  

Precondiciones: Haber seleccionado al menos un producto base con su entrega en UFH-01.  

Datos de entrada: Accion del usuario (clic en "Confirmar pedido" o "Editar pedido").

Datos de salida: Resumen detallado con items, costo de entrega, total liquidado y estado CONFIRMADO al aprobarse.  

Flujo Basico: El usuario ingresa al resumen, verifica que los productos y el lugar de entrega coincidan con lo pedido, el sistema confirma que el total supere el valor minimo de $3.500, el usuario presiona "Confirmar pedido" y la orden pasa a estado confirmado.  

Flujo Alterno:Si el total acumulado de la orden no alcanza el valor minimo de $3.500, el sistema deshabilita el boton de confirmacion y notifica que el monto minimo del pedido debe ser de $3.500.

Imagenes Figma:

<img width="335" height="692" alt="Screenshot 2026-09-01 155423" src="https://github.com/user-attachments/assets/90fe9a56-c67b-438c-b91c-a8c1235f3175" />

<img width="331" height="697" alt="Screenshot 2026-09-01 155431" src="https://github.com/user-attachments/assets/c6ef16c2-438f-4bf7-ba28-d80331e23e8f" />


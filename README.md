## Actividad de Reflexión
# 1. ¿Qué problema busca solucionar el patrón Factory Method?
Busca evitar que las clases tengan que crear objetos directamente. En lugar de eso, una fábrica se encarga de crearlos, haciendo el código más organizado y fácil de modificar.

# 2. ¿Por qué no es recomendable crear objetos directamente en todas las clases del sistema?
Porque si en algún momento cambia la forma de crear esos objetos, habría que modificar muchas clases. Esto hace que el mantenimiento sea más difícil.

# 3. ¿Qué función cumple la fábrica dentro del patrón?
La fábrica se encarga de crear los objetos que necesita el sistema. Así, las demás clases no tienen que preocuparse por cómo se crean.

# 4. ¿Cuál es la diferencia entre el producto y los productos concretos?
Producto: es la idea general o la interfaz que define qué puede hacer un objeto.
Productos concretos: son las diferentes implementaciones reales de ese producto.

# 5. ¿Qué ventajas aporta Factory Method en aplicaciones desarrolladas con Spring Boot?
Ayuda a que el código sea más ordenado, fácil de mantener y más sencillo de ampliar cuando se necesitan nuevas funcionalidades.

# 6. ¿Qué ocurriría si fuera necesario agregar un nuevo tipo de objeto al sistema?
Solo habría que crear una nueva clase para ese objeto y actualizar la fábrica para que pueda generarlo. 

# 7. ¿Cómo se relaciona Factory Method con el principio de bajo acoplamiento?
Porque las clases no dependen directamente de objetos específicos. En cambio, dependen de la fábrica, lo que hace que los cambios afecten a menos partes del sistema y sea más fácil mantenerlo.
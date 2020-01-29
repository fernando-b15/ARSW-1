# ARSW-1

## integrantes
		1. Fernando Barrera
		
## parte 1

### ejecucion de los tres hilos usando start()	

### codigo
![im1](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/1.PNG)	

### ejecucion
![im2](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/2.PNG)	

### ejecucion de los tres hilos usando run()


### codigo
![im3](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/3.PNG)	

### ejecucion
![im4](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/4.PNG)	

### ¿Que diferencia hubo entre la jecucion con start() y con run()?

la diferencia que podemos ver en la ejecucion de los tres hilos uno con el comando start() y el otro con el comando run() es que el comando start() es asincronico ya que crea un nuevo hilo que se ejecuta en paralelo con los demas hilos por lo tanto la impresion de la secuencia de intervalos puede salir en desorden mientras que el comando run() es sincronico lo que significa que no crea un nuevo hilo si no que ejecuyta el subproceso del metodo run() en el hilo actual por lo tanto la impresion de la secuencia de intervalos sale en orden	


## parte 2

### ejecucion del nuevo metodo get digits con 4 hilos el mismo numero de nucleos de la pc

### codigo
![im5](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/9.PNG)	

### ejecucion visual java
![im6](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/8.PNG)	

### compilacion de pruebas

![im7](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/10.PNG)	

## parte 3

### graficas de java visual con 1 hilo visual java

![im8](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/5.PNG)	

### graficas de java visual con 200 hilos visual java

![im9](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/6.PNG)	

### graficas de java visual con 500 hilos visual java

![im7](https://github.com/fernando-b15/CNYT-Actividad-Esfera/blob/master/7.PNG)	

### 1 pregunta

 en este caso por la capacidad del computador computador las simulaciones  se hicieron calculando 500.000 priemros digitos de pi ya que al ejecutarlos a un un millos el computador se bloqueaba, en cuanto al numero no hubo mucha diferencia entre el tiempo de ejecucion de 200 y 500 hilos por lo tanto se logra un mejor de tiempo para la ejecucion entre mas hilos pero hay un limite segun la capcidad del pc

### 2 pregunta 
  en este caso hubo mejor tiempo que haciendo la simulacion con 1 hilo o el mismo numero de hilos que nucleos ,ya que el computador no se sobrecargo de subprocesos
  
### 3 pregunta
 claro ya que se subdivide aun mas el problema y cada computador tendria su respectivo proceso y en efecto se lograria un mejor tiempo de ejecucion ya que los 500 computadores harian los 500 subprocesos en pararalelo y esto es mucho menos complejo a que un solo computador haga 500 subprocesos  

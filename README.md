# java-intermedio-hibernate
# prueba-maven-csv

### Esquemas drawio
### [Link esquemas](https://drive.google.com/file/d/1qIMAdtUY1rSO9ET24Z2pyTE1hxYIxuYm/view?usp=sharing)

<h3> Sentencias basicas SQL <h3>

<details>
   <summary>Definición de Datos (DDL)</summary>

  ~~~ sql
  CREATE TABLE `tabla_equipos`.
   `equipos` (`nombre` VARCHAR(20) NOT NULL ,
   `titulares` INT NULL , `suplentes` INT NULL ,
   `director_tecnico` VARCHAR(50) NULL ,
   `puntos` INT NULL ,
   `partidos jugados` INT NULL ,
   PRIMARY KEY (`nombre`)) ENGINE = InnoDB;
  ~~~

CREATE TABLE Empleados
(
    dni       VARCHAR(9) PRIMARY KEY,
    nombre    VARCHAR(100),
    sexo      CHAR(1),
    categoria INT,
    anyos     INT
);

CREATE TABLE Nominas
(
    dni    VARCHAR(9),
    sueldo INT,
    FOREIGN KEY (dni) REFERENCES Empleados (dni)
);
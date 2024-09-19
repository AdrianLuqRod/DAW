DROP TABLE IF EXISTS MATRICULADO;

DROP TABLE IF EXISTS IMPARTE;

DROP TABLE IF EXISTS ASIGNATURA;

DROP TABLE IF EXISTS ALUMNO;

DROP TABLE IF EXISTS PROFESOR;

DROP TABLE IF EXISTS PROVINCIA;

CREATE TABLE
    PROVINCIA (
        ID_PROV INT (5),
        NOMBRE VARCHAR(100) NOT NULL,
        CONSTRAINT PK_PROVINCIA PRIMARY KEY (ID_PROV)
    );

CREATE TABLE
    PROFESOR (
        ID_PROF INT (5),
        NOMBRE VARCHAR(100) NOT NULL,
        APELLIDOS VARCHAR(100) NOT NULL,
        DNI VARCHAR(9) NOT NULL,
        NACIDO_EN INT (5),
        CONSTRAINT PK_PROFESOR PRIMARY KEY (ID_PROF),
        CONSTRAINT FK_PROFESOR_PROVINCIA FOREIGN KEY (NACIDO_EN) REFERENCES PROVINCIA (ID_PROV)
    );

CREATE TABLE
    ALUMNO (
        ID_ALUM INT (5),
        DNI VARCHAR(9) NOT NULL,
        NOMBRE VARCHAR(100) NOT NULL,
        APELLIDOS VARCHAR(100) NOT NULL,
        FECHA_NAC DATE,
        NACIDO_EN INT (5),
        CONSTRAINT PK_ALUMNO PRIMARY KEY (ID_ALUM),
        CONSTRAINT FK_ALUMNO_PROVICIA FOREIGN KEY (NACIDO_EN) REFERENCES PROVINCIA (ID_PROV)
    );

CREATE TABLE
    ASIGNATURA (
        ID_ASIG INT (5),
        NOMBRE VARCHAR(100) NOT NULL,
        CONSTRAINT PK_ASIGNATURA PRIMARY KEY (ID_ASIG)
    );

CREATE TABLE
    IMPARTE (
        ID_PROF INT (5) NOT NULL,
        ID_ASIG INT (5) NOT NULL,
        CONSTRAINT PK_IMPARTE PRIMARY KEY (ID_PROF, ID_ASIG),
        CONSTRAINT FK_IMPARTE_PROFESOR FOREIGN KEY (ID_PROF) REFERENCES PROFESOR (ID_PROF) ON DELETE CASCADE,
        CONSTRAINT FK_IMPARTE_ASIGNATURA FOREIGN KEY (ID_ASIG) REFERENCES ASIGNATURA (ID_ASIG) ON DELETE CASCADE
    );

CREATE TABLE
    MATRICULADO (
        ID_ALUM INT (5) NOT NULL,
        ID_ASIG INT (5) NOT NULL,
        NOTA1 DECIMAL(4, 2),
        NOTA2 DECIMAL(4, 2),
        NOTA3 DECIMAL(4, 2),
        CONSTRAINT PK_MATRICULADO PRIMARY KEY (ID_ALUM, ID_ASIG),
        CONSTRAINT FK_MATRICULADO_ASIGNATURA FOREIGN KEY (ID_ASIG) REFERENCES ASIGNATURA (ID_ASIG) ON DELETE CASCADE,
        CONSTRAINT FK_MATRICULADO_ALUMNO FOREIGN KEY (ID_ALUM) REFERENCES ALUMNO (ID_ALUM) ON DELETE CASCADE
    );

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (1, 'Almeria');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (2, 'Cadiz');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (3, 'Cordoba');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (4, 'Granada');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (5, 'Huelva');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (6, 'Jaen');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (7, 'Malaga');

INSERT INTO
    PROVINCIA (ID_PROV, Nombre)
VALUES
    (8, 'Sevilla');

INSERT INTO
    PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni)
VALUES
    (1, 'Alvaro', 'Acebedo', 8, '78293485F');

INSERT INTO
    PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni)
VALUES
    (2, 'Manuel', 'Gutierrez', 2, '69298485J');

INSERT INTO
    PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni)
VALUES
    (3, 'Celia', 'Villa', 8, '23293465L');

INSERT INTO
    PROFESOR (ID_PROF, Nombre, Apellidos, Nacido_en, dni)
VALUES
    (4, 'Maria', 'Munioz', 3, '19298885N');

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (1, '28756358V', 'Juan', 'Veloso', '1977/02/11', 8);

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        2,
        '28956157L',
        'Sonia',
        'Sanchez',
        '1981/08/24',
        8
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        3,
        '27568011D',
        'Cristina',
        'Abascal',
        '1980/06/08',
        2
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        4,
        '28754685C',
        'Manuel',
        'Perez',
        '1974/06/04',
        8
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        5,
        '28546821Y',
        'Manuel',
        'Bueno',
        '1985/12/19',
        2
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        6,
        '27656981Y',
        'Jose Antonio',
        'Montero',
        '1990/07/25',
        3
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        7,
        '58324542B',
        'Juan Jose',
        'Sanchez',
        '1992/11/01',
        2
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        8,
        '56846315M',
        'Sandra',
        'Valles',
        '1985/01/05',
        3
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (9, '28468215X', 'Sara', 'Merida', '1986/09/09', 8);

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        10,
        '27684214Z',
        'Laura',
        'Gutierrez',
        '1987/04/09',
        8
    );

INSERT INTO
    ALUMNO (
        ID_ALUM,
        DNI,
        Nombre,
        Apellidos,
        FECHA_NAC,
        Nacido_en
    )
VALUES
    (
        11,
        '28896443S',
        'Inmaculada',
        'Garcia',
        '1989/03/21',
        8
    );

INSERT INTO
    ASIGNATURA (ID_ASIG, Nombre)
VALUES
    (1, 'Redes');

INSERT INTO
    ASIGNATURA (ID_ASIG, Nombre)
VALUES
    (2, 'Sistemas');

INSERT INTO
    ASIGNATURA (ID_ASIG, Nombre)
VALUES
    (3, 'Ingles');

INSERT INTO
    IMPARTE (ID_PROF, ID_ASIG)
VALUES
    (1, 1);

INSERT INTO
    IMPARTE (ID_PROF, ID_ASIG)
VALUES
    (2, 1);

INSERT INTO
    IMPARTE (ID_PROF, ID_ASIG)
VALUES
    (3, 2);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (1, 1, 4, 6, 8);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (2, 1, 5, 5, 5);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (2, 3, 10, 9, 7);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (3, 1, 10, 8, 9);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (4, 1, 3, 3, 4);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (4, 3, 0, 0, 0);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (5, 1, 1, 4, 8);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (5, 3, 8, 4, 4);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (6, 1, 5, 2, 7);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (7, 1, 5, 5, 5);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (7, 2, 7, 5, 6);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (7, 3, 6, 7, 7);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (8, 1, 4, 6, 5);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (8, 2, 4, 5, 6);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (9, 2, 7, 7, 7);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (9, 3, 6, 7, 8);

INSERT INTO
    MATRICULADO (ID_ALUM, ID_ASIG, Nota1, Nota2, Nota3)
VALUES
    (10, 2, 9, 5, 5);
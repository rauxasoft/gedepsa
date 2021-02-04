CREATE TABLE PRODUCTOS(

	ID					INT				NOT NULL,
	NOMBRE				VARCHAR(100)	,
	PRECIO				DOUBLE			NOT NULL,
	FAMILIA				VARCHAR(100)	,
	FECHA_ALTA			DATE			,
	DESCATALOGADO		BOOLEAN			,		
	
	PRIMARY KEY (ID)

);

CREATE TABLE ALMACENES(

	CODIGO				INT				NOT NULL,
	TELEFONO			VARCHAR(100)	,
	EMAIL				VARCHAR(100)	,
	DIRECCION			VARCHAR(100)	,
	POBLACION			VARCHAR(100)	,
	CODIGO_POSTAL		VARCHAR(40)		,
	PROVINCIA			VARCHAR(100)	,
	PAIS				VARCHAR(100)	,
	
	PRIMARY KEY (CODIGO)

);

CREATE TABLE ENVIOS(

	CODIGO				INT				NOT NULL,
	CODIGO_ALMACEN		INT				,
	FECHA_RECOGIDA		TIMESTAMP		,
	FECHA_ENTREGA		TIMESTAMP		,
	DIRECCION			VARCHAR(100)	,
	POBLACION			VARCHAR(100)	,
	CODIGO_POSTAL		VARCHAR(40)		,
	PROVINCIA			VARCHAR(100)	,
	PAIS				VARCHAR(100)	,
	OBSERVACIONES		VARCHAR(255)	,
	NUMERO_TRACKING		BIGINT			,
	
	PRIMARY KEY (CODIGO),
	FOREIGN KEY (CODIGO_ALMACEN) REFERENCES ALMACENES (CODIGO)
	
);

CREATE TABLE SECUENCIAS(

	NOMBRE_SECUENCIA	VARCHAR(100)	NOT NULL,
	VALOR_SECUENCIA		BIGINT			NOT NULL

);

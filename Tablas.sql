USE HospitalTEC

CREATE TABLE Provincia (
  idProvincia INT not null ,
  nombreProvincia VARCHAR(20),
  PRIMARY KEY (idProvincia)
);

CREATE TABLE Canton(
  idCanton INT not null ,
  nombreCanton VARCHAR(50) not null,
  idProvincia INT not null,
  PRIMARY KEY (idCanton),
  FOREIGN KEY  (idProvincia) references provincia(idProvincia)
);

CREATE TABLE Distrito (
  idDistrito INT not null  ,
  nombreDistrito VARCHAR(50) not null,
  idCanton INT not null,
  PRIMARY KEY (idDistrito),
  FOREIGN KEY  (idCanton) references canton(idCanton)
);

CREATE TABLE TipoCentro (
	idTipoCentro int PRIMARY KEY IDENTITY(1,1),
	tipoCentro varchar(20) not null,
);

CREATE TABLE CentroAtencion (
	codigo int PRIMARY KEY IDENTITY(1,1),
	nombre varchar(20) not null,
	capacidadMax int not null,
	idDistrito int not null FOREIGN KEY REFERENCES Distrito(idDistrito),
	idTipoCentro int not null FOREIGN KEY REFERENCES TipoCentro(idTipoCentro)
);

CREATE TABLE Usuario (
	nombreUsuario varchar(20) PRIMARY KEY,
	contrasenia varchar(20) not null,
	tipoCuenta varchar(1) not null,
);
CREATE TABLE Persona (
	cedula int PRIMARY KEY,
	primerNombre varchar(10) not null ,
	segundoNombre varchar(10),
	primerApellido varchar(10) not null,
	segundoApellido varchar(10) not null,
	nombreUsuario varchar(20) FOREIGN KEY REFERENCES Usuario(nombreUsuario)
);

CREATE TABLE Paciente (
	cedula int not null PRIMARY KEY FOREIGN KEY REFERENCES Persona(cedula),
	fechaNacimiento Date not null,
	nacionalidad varchar(50) not null,
	idDistrito int not null FOREIGN KEY REFERENCES Distrito(idDistrito)
);

CREATE TABLE TipoSangre (
	codigoSangre int PRIMARY KEY,
	descripcion varchar(20) not null,
);

CREATE TABLE Paciente_TipoSangre (
	codigoSangre int not null FOREIGN KEY REFERENCES TipoSangre(codigoSangre),
	cedula int not null  FOREIGN KEY REFERENCES Paciente(cedula)
);

CREATE TABLE Telefono_Paciente (
	cedula int not null FOREIGN KEY REFERENCES Paciente(cedula),
	numeroTelefono int not null,

	PRIMARY KEY (cedula, numeroTelefono)
);

CREATE TABLE Vacuna (
	numLote int PRIMARY KEY,
	nombreVacuna varchar(50) not null,
	farmaceutica varchar(50) not null
);

CREATE TABLE Vacuna_Paciente (
	cedula int FOREIGN KEY REFERENCES Paciente(cedula),
	numLote int FOREIGN KEY REFERENCES Paciente(cedula),
	fechaAplicacion Date,
	PRIMARY KEY (cedula, numLote)
);

CREATE TABLE NivelDiagnostico (
	idNivel int PRIMARY KEY,
	nivel varchar(20) not null
);

CREATE TABLE CatalogoDiagnosticos (
	idNombre int PRIMARY KEY IDENTITY (1,1),
	nombre varchar(20) not null
);

CREATE TABLE CatalogoTratamientos (
	idTratamiento int not null PRIMARY KEY,
	nombre varchar(30) not null,
	tipoTratamiento varchar(30) not null,
);

CREATE TABLE NombreDiagnostico_Tratamiento (
	idNombre int FOREIGN KEY REFERENCES CatalogoDiagnosticos(idNombre),
	idTratamiento int FOREIGN KEY REFERENCES CatalogoTratamientos(idTratamiento),
);

CREATE TABLE Diagnostico (
	idDiagnostico int PRIMARY KEY IDENTITY (1,1),
	observaciones varchar(100) not null,
	idNivelDiagnostico int FOREIGN KEY REFERENCES NivelDiagnostico(idNivel),
	idNombre int FOREIGN KEY REFERENCES CatalogoDiagnosticos(idNombre)
);

CREATE TABLE Diagnostico_Tratamientos (
	idTratamiento int FOREIGN KEY REFERENCES CatalogoTratamientos(idTratamiento),
	idDiagnostico int FOREIGN KEY REFERENCES Diagnostico(idDiagnostico),
	dosis varchar(20) not null
);

CREATE TABLE Diagnostico_Paciente (
	idDiagnostico int FOREIGN KEY REFERENCES Diagnostico(idDiagnostico),
	cedula int FOREIGN KEY REFERENCES Paciente(cedula),

	PRIMARY KEY (idDiagnostico, cedula)
);

CREATE TABLE AreaLaboral (
	idArea int PRIMARY KEY IDENTITY(1,1),
	area varchar(20) not null
);

CREATE TABLE TipoFuncionario (
	idTipo int PRIMARY KEY,
	nombre varchar(20) not null
);

CREATE TABLE Funcionario(
	cedula int PRIMARY KEY FOREIGN KEY REFERENCES Persona(cedula),
	fechaIngreso Date not null,
	idArea int FOREIGN KEY REFERENCES AreaLaboral(idArea),
	idTipo int FOREIGN KEY REFERENCES TipoFuncionario(idTipo)
);

CREATE TABLE Centro_Funcionario (
	idCentro int FOREIGN KEY REFERENCES CentroAtencion(codigo),
	cedulaFuncionario int FOREIGN KEY REFERENCES Funcionario(cedula)
);

CREATE TABLE Especialidad (
	idEspecialidad int PRIMARY KEY,
	especialidad varchar(20) not null unique,
);

CREATE TABLE Doctor (
	cedula int PRIMARY KEY FOREIGN KEY REFERENCES Funcionario(cedula),
	codigoMedico int,

	--PRIMARY KEY (cedula, codigoMedico)
);

CREATE TABLE Especialidad_Doctor (
	idEspecialidad int FOREIGN KEY REFERENCES Especialidad(idEspecialidad),
	cedula int FOREIGN KEY REFERENCES Doctor(cedula)
);

CREATE TABLE Enfermero (
	cedula int PRIMARY KEY FOREIGN KEY REFERENCES Funcionario(cedula),
	experienciaSubordinados bit not null,
	experienciaCapacitando bit not null
);

CREATE TABLE Hospitalizacion (
	codigo int PRIMARY KEY IDENTITY(1,1),
	fechaInicio Date not null,
	fechaFinal Date not null,
	idDiagnostico int FOREIGN KEY REFERENCES Diagnostico(idDiagnostico),
	cedulaPaciente int FOREIGN KEY REFERENCES Paciente(cedula),
	idCentro int FOREIGN KEY REFERENCES  CentroAtencion(codigo),
	cedulaFunc int FOREIGN KEY REFERENCES Funcionario(cedula),
);

CREATE TABLE Cita (
	idCita int PRIMARY KEY IDENTITY(1,1),
	citaFechaHora smalldatetime not null,
	observacion varchar(100) not null,
	cedulaPaciente int FOREIGN KEY REFERENCES Paciente(cedula),
	idEspecialidad int FOREIGN KEY REFERENCES Especialidad(idEspecialidad)
);

CREATE TABLE EstadoCita (
	codigoEstado int PRIMARY KEY,
	nombre varchar(20) not null
);

CREATE TABLE Bitacora (
	idBitacora int PRIMARY KEY IDENTITY(1,1),
	fechaModificacion date not null,
	codigoEstado int FOREIGN KEY REFERENCES EstadoCita(codigoEstado),
);

CREATE TABLE UsuarioModificacionBitacora (
	idBitacora int FOREIGN KEY REFERENCES Bitacora(idBitacora),
	nombreUsuario varchar(20) FOREIGN KEY REFERENCES Usuario(nombreUsuario)
);

CREATE TABLE Cita_Bitacora (
	idBitacora int FOREIGN KEY REFERENCES Bitacora(idBitacora),
	idCita int FOREIGN KEY REFERENCES Cita(idCita)
);
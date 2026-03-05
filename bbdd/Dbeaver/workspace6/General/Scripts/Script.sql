CREATE TABLE VentasRaw (
  PedidoID       VARCHAR(10),
  FechaPedido    DATE,
  ClienteID      VARCHAR(10),
  ClienteNombre  VARCHAR(100),
  ClienteDireccion VARCHAR(120),
  ClienteCiudad  VARCHAR(60),
  ClienteCP      VARCHAR(10),
  VendedorID     VARCHAR(10),
  VendedorNombre VARCHAR(100),
  Region         VARCHAR(40),
  ProductoID     VARCHAR(10),
  ProductoNombre VARCHAR(100),
  CategoriaID    VARCHAR(10),
  CategoriaNombre VARCHAR(60),
  ProveedorID    VARCHAR(10),
  ProveedorNombre VARCHAR(100),
  PrecioUnitario DECIMAL(10,2),
  Cantidad       INT,
  ImporteLinea   DECIMAL(10,2),
  FormaPago      VARCHAR(30)
);

INSERT INTO VentasRaw VALUES
-- O1001 (C001, V01)
('O1001','2025-09-10','C001','Acme SL','C/ Alcalá 1','Madrid','28001','V01','Laura Gómez','Centro',
 'P1001','Portátil 14"', 'C10','Portátiles','PR1','TechCorp', 799.00,2,1598.00,'Tarjeta'),
('O1001','2025-09-10','C001','Acme SL','C/ Alcalá 1','Madrid','28001','V01','Laura Gómez','Centro',
 'P1003','Teclado mecánico','C30','Periféricos','PR3','KeyWorks', 89.00,3,267.00,'Tarjeta'),

-- O1002 (C002, V02)
('O1002','2025-09-12','C002','Beta Consulting','Pg. de Gràcia 10','Barcelona','08002','V02','Iván Pérez','Norte',
 'P1002','Monitor 27"', 'C20','Monitores','PR2','ViewBest', 229.00,5,1145.00,'Transferencia'),
('O1002','2025-09-12','C002','Beta Consulting','Pg. de Gràcia 10','Barcelona','08002','V02','Iván Pérez','Norte',
 'P1004','SSD 1TB','C40','Almacenamiento','PR4','FastDisk', 119.00,4,476.00,'Transferencia'),
('O1002','2025-09-12','C002','Beta Consulting','Pg. de Gràcia 10','Barcelona','08002','V02','Iván Pérez','Norte',
 'P1005','Ratón inalámbrico','C30','Periféricos','PR3','KeyWorks', 39.00,2,78.00,'Transferencia'),

-- O1003 (C001, V01)
('O1003','2025-10-05','C001','Acme SL','C/ Alcalá 1','Madrid','28001','V01','Laura Gómez','Centro',
 'P1005','Ratón inalámbrico','C30','Periféricos','PR3','KeyWorks', 39.00,10,390.00,'Tarjeta'),
('O1003','2025-10-05','C001','Acme SL','C/ Alcalá 1','Madrid','28001','V01','Laura Gómez','Centro',
 'P1002','Monitor 27"', 'C20','Monitores','PR2','ViewBest', 229.00,1,229.00,'Tarjeta'),
('O1003','2025-10-05','C001','Acme SL','C/ Alcalá 1','Madrid','28001','V01','Laura Gómez','Centro',
 'P1003','Teclado mecánico','C30','Periféricos','PR3','KeyWorks', 89.00,1,89.00,'Tarjeta'),

-- O1004 (C003, V02)
('O1004','2025-10-18','C003','DistriNorte SA','Av. Gran Vía 5','Bilbao','48001','V02','Iván Pérez','Norte',
 'P1004','SSD 1TB','C40','Almacenamiento','PR4','FastDisk', 119.00,8,952.00,'Contado'),
('O1004','2025-10-18','C003','DistriNorte SA','Av. Gran Vía 5','Bilbao','48001','V02','Iván Pérez','Norte',
 'P1001','Portátil 14"','C10','Portátiles','PR1','TechCorp', 799.00,1,799.00,'Contado'),

-- O1005 (C002, V01)
('O1005','2025-11-02','C002','Beta Consulting','Pg. de Gràcia 10','Barcelona','08002','V01','Laura Gómez','Centro',
 'P1003','Teclado mecánico','C30','Periféricos','PR3','KeyWorks', 89.00,2,178.00,'Transferencia'),
('O1005','2025-11-02','C002','Beta Consulting','Pg. de Gràcia 10','Barcelona','08002','V01','Laura Gómez','Centro',
 'P1005','Ratón inalámbrico','C30','Periféricos','PR3','KeyWorks', 39.00,6,234.00,'Transferencia');
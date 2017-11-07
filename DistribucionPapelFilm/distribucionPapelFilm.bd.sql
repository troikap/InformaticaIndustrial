
SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE `proveedor` (
  			`OIDProveedor` varchar(36) NOT NULL,
  			`codigoProveedor` int(10) NOT NULL,
			`correoProveedor` varchar(36) NOT NULL,
			`direccionProveedor` varchar(36) NOT NULL,
  			`nombreProveedor` varchar(36) NOT NULL,
  			`telefonoProveedor` int(10) NULL,
  			
			PRIMARY KEY (`OIDProveedor`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;




DROP TABLE IF EXISTS `articulo`;
CREATE TABLE `articulo` (
  			`OIDArticulo` varchar(36) NOT NULL,
  			`codigoArticulo` int(10) NOT NULL,
			`descripcionArticulo` varchar(36) NOT NULL,
			`fechaInhabilitacionArticulo` date NULL,
  			`nombreArticulo` varchar(36) NOT NULL,
  			`OIDProveedor` varchar(36) NOT NULL,
  			`OIDTipoArticulo` varchar(36) NOT NULL,
			`OIDTipoImpuesto` varchar(36) DEFAULT NULL,
  
  			PRIMARY KEY (`OIDArticulo`),
  			KEY `OIDProveedor` (`OIDProveedor`),
  			KEY `OIDTipoArticulo` (`OIDTipoArticulo`),
			KEY `idx` (`OIDArticulo`) USING BTREE,
      			CONSTRAINT `OIDProveedor` FOREIGN KEY (`OIDProveedor`) REFERENCES `proveedor` (`OIDProveedor`),
  			CONSTRAINT `OIDTipoArticulo` FOREIGN KEY (`OIDTipoArticulo`) REFERENCES `tipoarticulo` (`OIDTipoArticulo`),
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;




DROP TABLE IF EXISTS `tipoimpuesto`;
CREATE TABLE `tipoimpuesto` (
			  `OIDTipoImpuesto` varchar(36) NOT NULL,
			  `codigoTipoImpuesto` varchar(15) NOT NULL,
			  `nombreTipoImpuesto` varchar(20) NOT NULL,
			  `fechaInhabilitacionTI` varchar(10) NULL,
  
  			 PRIMARY KEY (`OIDTipoImpuesto`)
 			  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;


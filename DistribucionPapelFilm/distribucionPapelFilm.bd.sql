
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


DROP TABLE IF EXISTS `tipoarticulo`;
CREATE TABLE `tipoarticulo` (
  			`OIDTipoArticulo` varchar(36) NOT NULL,
  			`codigoTipoArticulo` int(10) NOT NULL,
  			`nombreTipoArticulo` varchar(36) NOT NULL,
  			
			PRIMARY KEY (`OIDTipoArticulo`)
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
  
  			PRIMARY KEY (`OIDArticulo`),
  			KEY `OIDProveedor` (`OIDProveedor`),
  			KEY `OIDTipoArticulo` (`OIDTipoArticulo`),
			KEY `idx` (`OIDArticulo`) USING BTREE,
      			CONSTRAINT `OIDProveedor` FOREIGN KEY (`OIDProveedor`) REFERENCES `proveedor` (`OIDProveedor`),
  			CONSTRAINT `OIDTipoArticulo` FOREIGN KEY (`OIDTipoArticulo`) REFERENCES `tipoarticulo` (`OIDTipoArticulo`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `estadoordenproduccion`;
CREATE TABLE `estadoordenproduccion` (
  			`OIDEstadoOrdenProduccion` varchar(36) NOT NULL,
  			`codigoEstadoOrdenProduccion` int(10) NOT NULL,
  			`nombreEstadoOrdenProduccion` varchar(36) NOT NULL,
  			
			PRIMARY KEY (`OIDEstadoOrdenProduccion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `produccionprocesoelaboracion`;
CREATE TABLE `produccionprocesoelaboracion` (
  			`OIDProduccionProcesoElaboracion` varchar(36) NOT NULL,
  			`codigoProduccionProcesoElaboracion` int(10) NOT NULL,
  			
			PRIMARY KEY (`OIDProduccionProcesoElaboracion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `centrotrabajo`;
CREATE TABLE `centrotrabajo` (
  			`OIDCentroTrabajo` varchar(36) NOT NULL,
			`codigoCentroTrabajo` int(10) NOT NULL,
			`nombreCentroTrabajo` varchar(36) NOT NULL,
			`tiempoPorUnidadCentroTrabajo` float NOT NULL,
			`tipoDeUnidadCentroTrabajo` varchar(36) NOT NULL,
  			
			PRIMARY KEY (`OIDCentroTrabajo`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `maquinaherramienta`;
CREATE TABLE `maquinaherramienta` (
  			`OIDMaquinaHerramienta` varchar(36) NOT NULL,
  			`codigoMaquinaHerramienta` int(10) NOT NULL,
			`descripcionMaquinaHerramienta` varchar(36) NOT NULL,
  			`nombreMaquinaHerramienta` varchar(36) NOT NULL,
			`numeroMaquinaHerramienta` int(10) NOT NULL,
			`OIDCentroTrabajo` varchar(36) DEFAULT NULL,
  			
			PRIMARY KEY (`OIDMaquinaHerramienta`)
			KEY `OIDCentroTrabajo` (`OIDCentroTrabajo`),
			CONSTRAINT `OIDCentroTrabajo` FOREIGN KEY (`OIDCentroTrabajo`) REFERENCES `centrotrabajo` (`OIDCentroTrabajo`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `rutafabricacion`;
CREATE TABLE `rutafabricacion` (
  			`OIDRutaFabricacion` varchar(36) NOT NULL,
  			`numeroRutaFabricacion` int(10) NOT NULL,
  			
			PRIMARY KEY (`OIDRutaFabricacion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `productoterminado`;
CREATE TABLE `productoterminado` (
  			`OIDProductoTerminado` varchar(36) NOT NULL,
  			`codigoProductoTerminado` int(10) NOT NULL,
			`costoProductoTerminado` float NOT NULL,
  			`nombreProductoTerminado` varchar(36) NOT NULL,
  			`stockProductoTerminado` int(10) NULL,
			`OIDRutaFabricacion` varchar(36) NOT NULL,
  			
			PRIMARY KEY (`OIDProductoTerminado`)
			CONSTRAINT `OIDRutaFabricacion` FOREIGN KEY (`OIDRutaFabricacion`) REFERENCES `rutafabricacion` (`OIDRutaFabricacion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `ordenproduccion`;
CREATE TABLE `ordenproduccion` (
  			`OIDOrdenProduccion` varchar(36) NOT NULL,
  			`fechaEntregaOrdenProduccion` date NOT NULL,
			`fechaRecepcionOrdenProduccion` date NOT NULL,
			`numeroOrdenProduccion` int NOT NULL,
  			
			PRIMARY KEY (`OIDOrdenProduccion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `ordenproduccionestado`;
CREATE TABLE `ordenproduccionestado` (
  			`OIDOrdenProduccionEstado` varchar(36) NOT NULL,
  			`fechaOrdenProduccionEstado` date NOT NULL,
  			`OIDEstadoOrdenProduccion` varchar(36) NOT NULL,
			`OIDProduccionProcesoElaboracion` varchar(36) NOT NULL,
			`OIDMaquinaHerramienta` varchar(36) NOT NULL,
			`OIDCentroTrabajo` varchar(36) NOT NULL,
			`OIDOrdenProduccion` varchar(36) DEFAULT NULL,
  
  			PRIMARY KEY (`OIDOrdenProduccionEstado`),
  			KEY `OIDEstadoOrdenProduccion` (`OIDEstadoOrdenProduccion`),
			KEY `OIDProduccionProcesoElaboracion` (`OIDProduccionProcesoElaboracion`),
			KEY `OIDMaquinaHerramienta` (`OIDMaquinaHerramienta`),
			KEY `OIDCentroTrabajo` (`OIDCentroTrabajo`),
			KEY `idx` (`OIDOrdenProduccionEstado`) USING BTREE,
			KEY `OIDOrdenProduccion` (`OIDOrdenProduccion`),
      			CONSTRAINT `OIDEstadoOrdenProduccion` FOREIGN KEY (`OIDEstadoOrdenProduccion`) REFERENCES `estadoordenproduccion` (`OIDEstadoOrdenProduccion`),
			CONSTRAINT `OIDProduccionProcesoElaboracion` FOREIGN KEY (`OIDProduccionProcesoElaboracion`) REFERENCES `produccionprocesoelaboracion` (`OIDProduccionProcesoElaboracion`),
			CONSTRAINT `OIDMaquinaHerramienta` FOREIGN KEY (`OIDMaquinaHerramienta`) REFERENCES `maquinaherramienta` (`OIDMaquinaHerramienta`),
			CONSTRAINT `OIDCentroTrabajo` FOREIGN KEY (`OIDCentroTrabajo`) REFERENCES `centrotrabajo` (`OIDCentroTrabajo`),
			CONSTRAINT `OIDOrdenProduccion` FOREIGN KEY (`OIDOrdenProduccion`) REFERENCES `ordenproduccion` (`OIDOrdenProduccion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `subarticulo`;
CREATE TABLE `subarticulo` (
  			`OIDSubArticulo` varchar(36) NOT NULL,
  			`codigoSubArticulo` int(10) NOT NULL,
			`costoSubArticulo` float NOT NULL,
			`descripcionSubArticulo` varchar(36) NOT NULL,
			`fechaInhabilitacionSubArticulo` date NULL,
  			`nombreSubArticulo` varchar(36) NOT NULL,
			`stockSubArticulo` int(10) NOT NULL,
  			`OIDArticulo` varchar(36) NOT NULL,
			`OIDOrdenProduccionEstado` varchar(36) DEFAULT NULL,

  			PRIMARY KEY (`OIDSubArticulo`),
  			KEY `OIDArticulo` (`OIDArticulo`),
			KEY `idx` (`OIDSubArticulo`) USING BTREE,
			KEY `OIDOrdenProduccionEstado` (`OIDOrdenProduccionEstado`),
      			CONSTRAINT `OIDArticulo` FOREIGN KEY (`OIDArticulo`) REFERENCES `articulo` (`OIDArticulo`),
			CONSTRAINT `OIDOrdenProduccionEstado` FOREIGN KEY (`OIDOrdenProduccionEstado`) REFERENCES `ordenproduccionestado` (`OIDOrdenProduccionEstado`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `articuloproducto`;
CREATE TABLE `articuloproducto` (
  			`OIDArticuloProducto` varchar(36) NOT NULL,
  			`cantidadArticuloProducto` int(10) NOT NULL,
  			`OIDSubArticulo` varchar(36) NOT NULL,
			`OIDProductoTerminado` varchar(36) DEFAULT NULL,
  
  			PRIMARY KEY (`OIDArticuloProducto`),
  			KEY `OIDSubArticulo` (`OIDSubArticulo`),
			KEY `idx` (`OIDArticuloProducto`) USING BTREE,
			KEY `OIDProductoTerminado` (`OIDProductoTerminado`),
      			CONSTRAINT `OIDSubArticulo` FOREIGN KEY (`OIDSubArticulo`) REFERENCES `subarticulo` (`OIDSubArticulo`),
			CONSTRAINT `OIDProductoTerminado` FOREIGN KEY (`OIDProductoTerminado`) REFERENCES `ordenproductoterminado` (`OIDProductoTerminado`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `detallerutafabricacion`;
CREATE TABLE `detallerutafabricacion` (
  			`OIDDetalleRutaFabricacion` varchar(36) NOT NULL,
  			`ordenDetalleRutaFabricacion` int(10) NOT NULL,
			`OIDCentroTrabajo` varchar(36) NOT NULL,
			`OIDRutaFabricacion` varchar(36) DEFAULT NULL,
  			
			PRIMARY KEY (`OIDDetalleRutaFabricacion`)
			KEY `OIDCentroTrabajo` (`OIDCentroTrabajo`),
			KEY `idx` (`OIDDetalleRutaFabricacion`) USING BTREE,
			KEY `OIDRutaFabricacion` (`OIDRutaFabricacion`),
			CONSTRAINT `OIDCentroTrabajo` FOREIGN KEY (`OIDCentroTrabajo`) REFERENCES `centrotrabajo` (`OIDCentroTrabajo`),
			CONSTRAINT `OIDRutaFabricacion` FOREIGN KEY (`OIDRutaFabricacion`) REFERENCES `rutafabricacion` (`OIDRutaFabricacion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;












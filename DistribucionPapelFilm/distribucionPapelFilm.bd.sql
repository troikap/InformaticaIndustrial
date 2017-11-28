
SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE `proveedor` (
  			`OIDProveedor` varchar(36) NOT NULL,
  			`codigoProveedor` int(10) NOT NULL,
  			`nombreProveedor` varchar(36) NOT NULL,
			`correoProveedor` varchar(36) NOT NULL,
			`direccionProveedor` varchar(36) NOT NULL,
  			`telefonoProveedor` int(10) NULL,
			`fechaInhabilitacionProveedor` varchar(10) NULL,
			UNIQUE (OIDProveedor),
			UNIQUE (codigoProveedor),
  			
			PRIMARY KEY (`OIDProveedor`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `proveedor` VALUES ('11111111-1111-1111-1111-111111111111', '1111', 'vea', 'correo', 'dire2', '444444', '2017-05-06');
INSERT INTO `proveedor` VALUES ('22222222-2222-2222-2222-222222222222', '2222', 'atomo', 'correo', 'direc2', '555555', '2017-05-07');
INSERT INTO `proveedor` VALUES ('44442222-2222-2222-2222-222222222222', '2322', 'carrefour', 'correo', 'direc2', '555555', NULL);

DROP TABLE IF EXISTS `tipoarticulo`;
CREATE TABLE `tipoarticulo` (
  			`OIDTipoArticulo` varchar(36) NOT NULL,
  			`codigoTipoArticulo` int(10) NOT NULL,
  			`nombreTipoArticulo` varchar(36) NOT NULL,
			`fechaInhabilitacionTipoArticulo` varchar(10) NULL,
			UNIQUE (OIDTipoArticulo),
			UNIQUE (codigoTipoArticulo),
  			
			PRIMARY KEY (`OIDTipoArticulo`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `tipoarticulo` VALUES ('11111111-1111-1111-1111-111222111111', '1234', 'tipo1', '2017-05-06');
INSERT INTO `tipoarticulo` VALUES ('22222222-2222-2222-2222-222333322222', '2591', 'tipo2', '2017-05-07');


DROP TABLE IF EXISTS `articulo`;
CREATE TABLE `articulo` (
  			`OIDArticulo` varchar(36) NOT NULL,
  			`codigoArticulo` int(10) NOT NULL,
			`nombreArticulo` varchar(36) NOT NULL,
  			`descripcionArticulo` varchar(36) NOT NULL,
			`fechaInhabilitacionArticulo` varchar(10) NULL,
			`OIDProveedor` varchar(36) NULL,
  			`OIDTipoArticulo` varchar(36) NULL,
			UNIQUE (OIDArticulo),
			UNIQUE (codigoArticulo),
  
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
			`fechaInhabilitacionEstadoOrdenProduccion` varchar(10) NULL,
			UNIQUE (OIDEstadoOrdenProduccion),
			UNIQUE (codigoEstadoOrdenProduccion),
  			
			PRIMARY KEY (`OIDEstadoOrdenProduccion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `produccionprocesoelaboracion`;
CREATE TABLE `produccionprocesoelaboracion` (
  			`OIDProduccionProcesoElaboracion` varchar(36) NOT NULL,
  			`codigoProduccionProcesoElaboracion` int(10) NOT NULL,
			UNIQUE (OIDProduccionProcesoElaboracion),
			UNIQUE (codigoProduccionProcesoElaboracion),
  			
			PRIMARY KEY (`OIDProduccionProcesoElaboracion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `centrotrabajo`;
CREATE TABLE `centrotrabajo` (
  			`OIDCentroTrabajo` varchar(36) NOT NULL,
			`codigoCentroTrabajo` int(10) NOT NULL,
			`nombreCentroTrabajo` varchar(36) NOT NULL,
			`tiempoPorUnidadCentroTrabajo` float NOT NULL,
			`tipoDeUnidadCentroTrabajo` varchar(36) NOT NULL,
			`fechaInhabilitacionCentroTrabajo` varchar(10) NULL,
			UNIQUE (OIDCentroTrabajo),
			UNIQUE (codigoCentroTrabajo),
  			
			PRIMARY KEY (`OIDCentroTrabajo`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `maquinaherramienta`;
CREATE TABLE `maquinaherramienta` (
  			`OIDMaquinaHerramienta` varchar(36) NOT NULL,
  			`codigoMaquinaHerramienta` int(10) NOT NULL,
			`descripcionMaquinaHerramienta` varchar(36) NOT NULL,
  			`nombreMaquinaHerramienta` varchar(36) NOT NULL,
			`numeroMaquinaHerramienta` int(10) NOT NULL,
			`fechaInhabilitacionMaquinaHerramienta` varchar(10) NULL,
			`OIDCentroTrabajo` varchar(36) DEFAULT NULL,
			UNIQUE (OIDMaquinaHerramienta),
			UNIQUE (codigoMaquinaHerramienta),
  			
			PRIMARY KEY (`OIDMaquinaHerramienta`),
			KEY `OIDCentroTrabajo` (`OIDCentroTrabajo`),
			CONSTRAINT `OIDCentroTrabajo` FOREIGN KEY (`OIDCentroTrabajo`) REFERENCES `centrotrabajo` (`OIDCentroTrabajo`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `rutafabricacion`;
CREATE TABLE `rutafabricacion` (
  			`OIDRutaFabricacion` varchar(36) NOT NULL,
  			`numeroRutaFabricacion` int(10) NOT NULL,
			`fechaInhabilitacionRutaFabricacion` varchar(10) NULL,
			UNIQUE (OIDRutaFabricacion),
  			
			PRIMARY KEY (`OIDRutaFabricacion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `productoterminado`;
CREATE TABLE `productoterminado` (
  			`OIDProductoTerminado` varchar(36) NOT NULL,
  			`codigoProductoTerminado` int(10) NOT NULL,
			`costoProductoTerminado` float NOT NULL,
  			`nombreProductoTerminado` varchar(36) NOT NULL,
  			`stockProductoTerminado` int(10) NULL,
			`fechaInhabilitacionProductoTerminado` varchar(10) NULL,
			`OIDRutaFabricacion` varchar(36) NOT NULL,
			UNIQUE (OIDProductoTerminado),
			UNIQUE (codigoProductoTerminado),
  			
			PRIMARY KEY (`OIDProductoTerminado`),
			CONSTRAINT `OIDRutaFabricacion` FOREIGN KEY (`OIDRutaFabricacion`) REFERENCES `rutafabricacion` (`OIDRutaFabricacion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `ordenproduccion`;
CREATE TABLE `ordenproduccion` (
  			`OIDOrdenProduccion` varchar(36) NOT NULL,
  			`fechaEntregaOrdenProduccion` date NOT NULL,
			`fechaRecepcionOrdenProduccion` varchar(10) NOT NULL,
			`numeroOrdenProduccion` int NOT NULL,
			UNIQUE (OIDOrdenProduccion),
  			
			PRIMARY KEY (`OIDOrdenProduccion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `ordenproduccionestado`;
CREATE TABLE `ordenproduccionestado` (
  			`OIDOrdenProduccionEstado` varchar(36) NOT NULL,
  			`fechaOrdenProduccionEstado` varchar(10) NOT NULL,
  			`OIDEstadoOrdenProduccion` varchar(36) NOT NULL,
			`OIDProduccionProcesoElaboracion` varchar(36) NOT NULL,
			`OIDMaquinaHerramienta` varchar(36) NOT NULL,
			`OIDCentroTrabajo` varchar(36) NOT NULL,
			`OIDOrdenProduccion` varchar(36) DEFAULT NULL,
			UNIQUE (OIDOrdenProduccionEstado),
  
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
			CONSTRAINT `OIDCentroTrabajo1` FOREIGN KEY (`OIDCentroTrabajo`) REFERENCES `centrotrabajo` (`OIDCentroTrabajo`),
			CONSTRAINT `OIDOrdenProduccion` FOREIGN KEY (`OIDOrdenProduccion`) REFERENCES `ordenproduccion` (`OIDOrdenProduccion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `subarticulo`;
CREATE TABLE `subarticulo` (
  			`OIDSubArticulo` varchar(36) NOT NULL,
  			`codigoSubArticulo` int(10) NOT NULL,
			`costoSubArticulo` float NOT NULL,
			`descripcionSubArticulo` varchar(36) NOT NULL,
			`fechaInhabilitacionSubArticulo` varchar(10) NULL,
  			`nombreSubArticulo` varchar(36) NOT NULL,
			`stockSubArticulo` int(10) NOT NULL,
  			`OIDArticulo` varchar(36) NOT NULL,
			`OIDOrdenProduccionEstado` varchar(36) DEFAULT NULL,
			UNIQUE (OIDSubArticulo),
			UNIQUE (codigoSubArticulo),

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
			UNIQUE (OIDArticuloProducto),
  
  			PRIMARY KEY (`OIDArticuloProducto`),
  			KEY `OIDSubArticulo` (`OIDSubArticulo`),
			KEY `idx` (`OIDArticuloProducto`) USING BTREE,
			KEY `OIDProductoTerminado` (`OIDProductoTerminado`),
      			CONSTRAINT `OIDSubArticulo` FOREIGN KEY (`OIDSubArticulo`) REFERENCES `subarticulo` (`OIDSubArticulo`),
			CONSTRAINT `OIDProductoTerminado` FOREIGN KEY (`OIDProductoTerminado`) REFERENCES `productoterminado` (`OIDProductoTerminado`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `detallerutafabricacion`;
CREATE TABLE `detallerutafabricacion` (
  			`OIDDetalleRutaFabricacion` varchar(36) NOT NULL,
  			`ordenDetalleRutaFabricacion` int(10) NOT NULL,
			`OIDCentroTrabajo` varchar(36) NOT NULL,
			`OIDRutaFabricacion` varchar(36) DEFAULT NULL,
			UNIQUE (OIDDetalleRutaFabricacion),
  			
			PRIMARY KEY (`OIDDetalleRutaFabricacion`),
			KEY `OIDCentroTrabajo` (`OIDCentroTrabajo`),
			KEY `idx` (`OIDDetalleRutaFabricacion`) USING BTREE,
			KEY `OIDRutaFabricacion` (`OIDRutaFabricacion`),
			CONSTRAINT `OIDCentroTrabajoc` FOREIGN KEY (`OIDCentroTrabajo`) REFERENCES `centrotrabajo` (`OIDCentroTrabajo`),
			CONSTRAINT `OIDRutaFabricacionc` FOREIGN KEY (`OIDRutaFabricacion`) REFERENCES `rutafabricacion` (`OIDRutaFabricacion`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;












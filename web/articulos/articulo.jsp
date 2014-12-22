<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome a Java Revolutions JSF + Hibernate + Spring</title>
</head>
<body>
<f:view>

<h:form id="formaArticulos">
<center>

<table>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Id articulo : </td>
<td><h:inputText value="#{articuloBean.idArticulo}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Nombre : </td>
<td><h:inputText value="#{articuloBean.nombre}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Drescripción : </td>
<td><h:inputText value="#{articuloBean.descripcion}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Costo : </td>
<td><h:inputText value="#{articuloBean.costo}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Precio : </td>
<td><h:inputText value="#{articuloBean.precio}"/></td>
</tr>

<tr>
<td colspan="2">
<h:commandButton value="Guardar" action="#{articuloBean.insert}"/>
<h:commandButton value="Actualizar" action="#{articuloBean.update}"/>
<h:commandButton value="Eliminar" action="#{articuloBean.delete}"/>
</td>

</tr>
</table>

<h:dataTable id="tablaArticulos" value="#{articuloBean.lista}" var="obj"
border="1">

<h:column>
<f:facet name="header"><h:outputText value="Id articulo"></h:outputText></f:facet>
<h:outputText value="#{obj.idArticulo}"></h:outputText>
</h:column>

<h:column>
<f:facet name="header"><h:outputText value="Nombre"></h:outputText></f:facet>
<h:outputText value="#{obj.nombre}"/>
</h:column>

</h:dataTable>

</center>

</h:form>

</f:view>
</body>
</html>

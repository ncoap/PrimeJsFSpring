<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Java Revolutions JSF + Hibernate + Spring</title>
    </head>
    <body>
        <f:view>
            <h:form id="formularioLogin">
                <table align="center">
                    <tr>
                        <td colspan="2" style="font-weight: bold; size: 20px;">Ingresa tu Usuario y tu Contraseña</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;" align="right">Usuario : </td>
                        <td><h:inputText value="#{loginBean.user}"/></td>
                    </tr>
                    <tr>
                        <td style="font-weight: bold; size: 12px; color: blue;" align="right">Password : </td>
                        <td><h:inputSecret value="#{loginBean.password}"/></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="Cancelar" style="font-size: 14px; color: blue;"></td>
                        <td><h:commandButton value="Aceptar" action="#{loginBean.validarLogin}"  style="font-size: 14px; color: blue;"/></td>
                    </tr>
                </table>
                <table align="center">
                    <tr>
                        <td style="color: red; font-weight: bold; text-align: justify; font-size: 16px;"
                            align="center" id="tdError">
                            <%= request.getAttribute("errorAccesos") == null ? "" : request.getAttribute("errorAccesos")%></td>
                    </tr>
                </table>
            </h:form>
        </f:view>
    </body>
</html>

<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>

<html>
<body bgcolor="#c5dec9">
<h2 align="center">Registrar Producto</h2>
<form method="post" action="ControladorProducto">
<table border="2" align="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precio</td>
<td><input type="text" name="precio"></td>
</tr>
<tr>
<tr>
<td>PrecioVenta</td>
<td><input type="text" name="precioven"></td>
</tr>
<tr>
<td colspan="2" align="center">
<select name="estado">
<option>Seleccione Estado</option>
<option>Vigente</option>
<option>Caducado</option>
</select>
</td>
</tr>
<tr>
<td>descripcion</td>
<td><input type="text" name="descrip"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>
</table>
</form>

<h1 align="center">
Listado de Empleados
</h1>
<table align="center" border="2">
<tr>
<th>codigo</th>
<th>nombre</th>
<th>precio</th>
<th>precioventa</th>
<th>estado</th>
<th>descripcion</th>
</tr>
<!-- escriptles -->
<%
List<TblProductocl2> listado=(List<TblProductocl2>)request.getAttribute("listado");
if(listado!=null){
	for(TblProductocl2 tblpro:listado){
%>
<tr>
<td><%=tblpro.getIdproductocl2()%></td>
<td><%=tblpro.getNombrecl2()%></td>
<td><%=tblpro.getPrecioventacl2()%></td>
<td><%=tblpro.getPreciocompcl2()%></td>
<td><%=tblpro.getEstadocl2()%></td>
<td><%=tblpro.getDescripcl2()%></td>
</tr>
<% 
	}
}
%>
</table>
</body>
</html>

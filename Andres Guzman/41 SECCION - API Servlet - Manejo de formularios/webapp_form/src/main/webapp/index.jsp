<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<% 
  List<String> errores = (List<String>) request.getAttribute("errores");
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Formularios de usuario</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <h3>Formularios de usuario</h3>
    <% if(errores != null && errores.size() > 0) { %>
      <ul>
        <% for(String error: errores) { %>
          <li><%= error %></li>
        <% } %>
      </ul>
    <% } %>
    <form action="/webapp-form/registro" method="post">
      <div>
        <label for="username">Usuario</label>
        <div>
          <input type="text" name="username" id="username">
        </div>
      </div>
      <div>
        <label for="password">Password</label>
        <div>
          <input type="password" name="password" id="password">
        </div>
      </div>
      <div>
        <label for="email">Email</label>
        <div>
          <input type="text" name="email" id="email">
        </div>
      </div>
      <div>
        <label for="pais">Pais</label>
        <div>
          <select name="pais" id="pais">
            <option value="">-- Seleccionar --</option>
            <option value="ES">Espania</option>
            <option value="ME">Mexico</option>
            <option value="CL" selected>Chile</option>
            <option value="AR">Argentina</option>
            <option value="PE">Peru</option>
            <option value="CO">Colombia</option>
            <option value="VE">Venezuela</option>
          </select>
        </div>
      </div>
      <div>
        <label for="lenguajes">Lenguajes de programacion</label>
        <div>
          <select name="lenguajes" id="lenguajes" multiple>
            <option value="java" selected>Java SE</option>
            <option value="jakartaee" selected>Jakarta EE</option>
            <option value="sprint">Sprint Boot</option>
            <option value="js">JavaScript</option>
            <option value="angular" selected>Angular</option>
            <option value="react">React</option>
          </select>
        </div>
      </div>
      <div>
        <label>Roles</label>
        <div>
          <input type="checkbox" name="roles" value="ROLE_ADMIN">
          <label>Administrador</label>
        </div>
        <div>
          <input type="checkbox" name="roles" value="ROLE_USER" checked>
          <label>Usuario</label>
        </div>
        <div>
          <input type="checkbox" name="roles" value="ROLE_MODERATOR">
          <label>Moderador</label>
        </div>
      </div>
      <div>
        <label>Idiomas</label>
        <div>
          <input type="radio" name="idioma" value="es" checked>
          <label>Espaniol</label>
        </div>
        <div>
          <input type="radio" name="idioma" value="en">
          <label>Ingles</label>
        </div>
        <div>
          <input type="radio" name="idioma" value="fr">
          <label>Frances</label>
        </div>
      </div>
      <div>
        <label for="habilitar">Habilitar</label>
        <div>
          <input type="checkbox" name="habilitar" id="habilitar" checked>
        </div>
      </div>
      <input type="hidden" name="secreto" value="12345">
      <div>
        <input type="submit" value="Enviar">
      </div>
    </form>
  </body>
</html>

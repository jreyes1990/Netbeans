<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<% 
  Map<String, String> errores = (Map<String, String>) request.getAttribute("errores");
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Formularios de usuario</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"> -->
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body>
    <div class="px-5">
      <h3>Formularios de usuario</h3>
      <form action="/webapp-form/registro" method="post" class="form-control">
        <div class="row mb-3">
          <div class="col-md-6">
            <% if(errores != null && errores.size() > 0) { %>
              <ul class="alert alert-danger">
                <% for(String error: errores.values()) { %>
                  <li class="mx-4"><%= error %></li>
                <% } %>
              </ul>
            <% } %>
          </div>
        </div>

        <div class="row mb-3">
          <label for="username" class="col-form-label col-sm-2">Usuario</label>
          <div class="col-md-4">
            <input type="text" name="username" id="username" class="form-control" value="${param.username}">
            <% 
              if(errores != null && errores.containsKey("username")) {
                out.println("<span class='badge bg-danger'><class='col-md-4' small style='color: white;'>"+ errores.get("username") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label for="password" class="col-form-label col-sm-2">Password</label>
          <div class="col-md-4">
            <input type="password" name="password" id="password" class="form-control">
            <% 
              if(errores != null && errores.containsKey("password")) {
                out.println("<span class='badge bg-danger'><small col-md-4 style='color: white;'>"+ errores.get("password") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label for="email" class="col-form-label col-sm-2">Email</label>
          <div class="col-md-4">
            <input type="text" name="email" id="email" class="form-control" value="${param.email}">
            <% 
              if(errores != null && errores.containsKey("email")) {
                out.println("<span class='badge bg-danger'><small col-md-4 style='color: white;'>"+ errores.get("email") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label for="pais" class="col-sm-2">Pais</label>
          <div class="col-md-4">
            <select name="pais" id="pais" class="form-select">
              <option value="">-- Seleccionar --</option>
              <option value="ES" ${param.pais.equals("ES") ? "selected" : ""}>Espania</option>
              <option value="ME" ${param.pais.equals("ME") ? "selected" : ""}>Mexico</option>
              <option value="CL" ${param.pais.equals("CL") ? "selected" : ""}>Chile</option>
              <option value="AR" ${param.pais.equals("AR") ? "selected" : ""}>Argentina</option>
              <option value="PE" ${param.pais.equals("PE") ? "selected" : ""}>Peru</option>
              <option value="CO" ${param.pais.equals("CO") ? "selected" : ""}>Colombia</option>
              <option value="VE" ${param.pais.equals("VE") ? "selected" : ""}>Venezuela</option>
            </select>
            <% 
              if(errores != null && errores.containsKey("pais")) {
                out.println("<span class='badge bg-danger'><small col-md-4 style='color: white;'>"+ errores.get("pais") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label for="lenguajes" class="col-sm-2">Lenguajes de programacion</label>
          <div class="col-md-4">
            <select name="lenguajes" id="lenguajes" multiple class="form-select">
              <option value="java" ${paramValues.lenguajes.stream().anyMatch(v -> v.equals("java")).get() ? "selected" : ""}>Java SE</option>
              <option value="jakartaee" ${paramValues.lenguajes.stream().anyMatch(v -> v.equals("jakartaee")).get() ? "selected" : ""}>Jakarta EE</option>
              <option value="sprint" ${paramValues.lenguajes.stream().anyMatch(v -> v.equals("sprint")).get() ? "selected" : ""}>Sprint Boot</option>
              <option value="js" ${paramValues.lenguajes.stream().anyMatch(v -> v.equals("js")).get() ? "selected" : ""}>JavaScript</option>
              <option value="angular" ${paramValues.lenguajes.stream().anyMatch(v -> v.equals("angular")).get() ? "selected" : ""}>Angular</option>
              <option value="react" ${paramValues.lenguajes.stream().anyMatch(v -> v.equals("react")).get() ? "selected" : ""}>React</option>
            </select>
            <% 
              if(errores != null && errores.containsKey("lenguajes")) {
                out.println("<span class='badge bg-danger'><small col-md-4 style='color: white;'>"+ errores.get("lenguajes") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label class="col-form-label col-sm-2">Roles</label>
          <div class="col-md-4">
            <div class="form-check col-sm-2">
              <input type="checkbox" name="roles" value="ROLE_ADMIN" class="form-check-input" ${paramValues.roles.stream().anyMatch(v -> v.equals("ROLE_ADMIN")).get() ? "checked" : ""}>
              <label class="form-check-label">Administrador</label>
            </div>
            <div class="form-check col-sm-2">
              <input type="checkbox" name="roles" value="ROLE_USER" class="form-check-input" ${paramValues.roles.stream().anyMatch(v -> v.equals("ROLE_USER")).get() ? "checked" : ""}>
              <label class="form-check-label">Usuario</label>
            </div>
            <div class="form-check col-sm-2">
              <input type="checkbox" name="roles" value="ROLE_MODERATOR" class="form-check-input" ${paramValues.roles.stream().anyMatch(v -> v.equals("ROLE_MODERATOR")).get() ? "checked" : ""}>
              <label class="form-check-label">Moderador</label>
            </div>
            <% 
              if(errores != null && errores.containsKey("roles")) {
                out.println("<span class='badge bg-danger'><small col-md-4 style='color: white;'>"+ errores.get("roles") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label class="col-form-label col-sm-2">Idiomas</label>
          <div class="col-md-4">
            <div class="form-check">
              <input type="radio" name="idioma" value="es" checked class="form-check-input" ${param.idioma.equals("es")? "checked" : ""}>
              <label class="form-check-label">Espaniol</label>
            </div>
            <div class="form-check">
              <input type="radio" name="idioma" value="en" class="form-check-input" ${param.idioma.equals("en")? "checked" : ""}>
              <label class="form-check-label">Ingles</label>
            </div>
            <div class="form-check">
              <input type="radio" name="idioma" value="fr" class="form-check-input" ${param.idioma.equals("fr")? "checked" : ""}>
              <label class="form-check-label">Frances</label>
            </div>
            <% 
              if(errores != null && errores.containsKey("idioma")) {
                out.println("<span class='badge bg-danger'><small col-md-4 style='color: white;'>"+ errores.get("idioma") + "</small></span>");
              } 
            %>
          </div>
        </div>
        <div class="row mb-3">
          <label for="habilitar" class="col-form-label col-sm-2">Habilitar</label>
          <div class="col-md-4">
            <div class="form-check">
              <input type="checkbox" name="habilitar" id="habilitar" checked class="form-check-input">
            </div>
          </div>
        </div>
        <input type="hidden" name="secreto" value="12345">
        <div class="row mb-3">
          <div class="col-md-4">
            <input type="submit" value="Enviar" class="btn btn-primary">
          </div>
        </div>
      </form>
    </div>  
  </body>
</html>

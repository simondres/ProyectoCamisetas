package arqSw.Servlet;

import arqSw.DAO.AdministradorDAO;
import arqSw.DAO.ArtistaDAO;
import arqSw.DAO.ClienteDAO;
import arqSw.Hibernate.Administrador;
import arqSw.Hibernate.Artista;
import arqSw.Hibernate.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Ingresar", urlPatterns = {"/Ingresar"})
public class Ingresar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String name = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        int tForm = Integer.parseInt(request.getParameter("tForm"));
        switch (tForm) {
            case 1: {
                ArtistaDAO admDAO = new ArtistaDAO();
                List<Artista> admP = admDAO.obtenListaArtistas();
                for (Artista a : admP) {
                    if (name.equals(a.getUsuario()) && clave.equals(a.getClave())) {
                        HttpSession session = request.getSession();
                        session.setAttribute("id", a.getIdArtista());
                        session.setAttribute("name", name);
                        session.setAttribute("type", "Artista");
                        request.getRequestDispatcher("Artista/indexArt.jsp").include(request, response);
                    } else {
                        request.getSession().setAttribute("stat", null);
                        request.getSession().setAttribute("stat", "Ingreso fallido");
                        request.getRequestDispatcher("Artista/IngresarArtista.jsp").include(request, response);
                    }
                }
            }
            case 2: {
                ClienteDAO cliDAO = new ClienteDAO();
                List<Cliente> cliP = cliDAO.obtenListaClientes();
                for (Cliente a : cliP) {
                    if (name.equals(a.getUsuario()) && clave.equals(a.getClave())) {
                        HttpSession session = request.getSession();
                        session.setAttribute("id", a.getIdCliente());
                        session.setAttribute("name", name);
                        session.setAttribute("type", "Cliente");
                        request.getRequestDispatcher("Cliente/indexCli.jsp").include(request, response);
                    } else {
                        request.getSession().setAttribute("stat2", null);
                        request.getSession().setAttribute("stat2", "Ingreso fallido");
                        response.sendRedirect("Cliente/IngresarCliente.jsp");
                    }
                }
            }
            case 3: {
                AdministradorDAO admDAO = new AdministradorDAO();
                List<Administrador> admP = admDAO.obtenListaAdministradores();
                for (Administrador a : admP) {
                    if (name.equals(a.getUsuario()) && clave.equals(a.getClave())) {
                        HttpSession session = request.getSession();
                        session.setAttribute("id", a.getIdAdministrador());
                        session.setAttribute("name", name);
                        session.setAttribute("type", "Administrador");
                        request.getRequestDispatcher("Administrador/indexAdm.jsp").include(request, response);
                    } else {
                        request.getSession().setAttribute("stat3", null);
                        request.getSession().setAttribute("stat3", "Ingreso fallido");
                        response.sendRedirect("Administrador/IngresarAdministrador.jsp");
                    }
                }
            }
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
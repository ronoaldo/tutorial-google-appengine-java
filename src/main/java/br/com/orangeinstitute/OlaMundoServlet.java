package br.com.orangeinstitute;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class OlaMundoServlet extends HttpServlet {

    private static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException {
        resp.getWriter().println("Olá, mundo!");
    }
}
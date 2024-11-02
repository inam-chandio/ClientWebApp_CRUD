package com.ProyectoFinal.controlador;

import com.ProyectoFinal.modelo.Formulario;
import com.ProyectoFinal.modeloDAO.FormularioDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/clients/*")
public class Controlador extends HttpServlet {
    private FormularioDAO formularioDAO = new FormularioDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        try {
            switch (action) {
                case "/add":
                    showAddForm(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/delete":
                    deleteClient(request, response);
                    break;
                case "/list":
                default:
                    listClients(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        try {
            switch (action) {
                case "/add":
                    addClient(request, response);
                    break;
                case "/update":
                    updateClient(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listClients(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Formulario> clients = formularioDAO.listAllClients();
        request.setAttribute("clients", clients);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/add.jsp").forward(request, response);
    }

    private void addClient(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        Formulario client = new Formulario();
        client.setClientName(request.getParameter("clientName"));
        client.setObservations(request.getParameter("observations"));
        client.setPageNumber(Integer.parseInt(request.getParameter("pageNumber")));
        client.setSocialName(request.getParameter("socialName"));
        client.setResponsiblePerson(request.getParameter("responsiblePerson"));
        client.setCommercialContact(request.getParameter("commercialContact"));
        client.setEmail(request.getParameter("email"));
        client.setPhone(request.getParameter("phone"));
        client.setFiscalAddress(request.getParameter("fiscalAddress"));
        client.setShippingAddress(request.getParameter("shippingAddress"));
        client.setAccountingLink(request.getParameter("accountingLink"));
        client.setInvoiceFormat(request.getParameter("invoiceFormat"));
        client.setPaymentMethod(request.getParameter("paymentMethod"));
        client.setRiskLevel(request.getParameter("riskLevel"));
        client.setMaxCredit(new BigDecimal(request.getParameter("maxCredit")));
        formularioDAO.addClient(client);
        response.sendRedirect(request.getContextPath() + "/clients/list");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Formulario existingClient = formularioDAO.getClientById(id);
        request.setAttribute("client", existingClient);
        request.getRequestDispatcher("/edit.jsp").forward(request, response);
    }

    private void updateClient(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        Formulario client = new Formulario();
        client.setId(Integer.parseInt(request.getParameter("id")));
        client.setClientName(request.getParameter("clientName"));
        client.setObservations(request.getParameter("observations"));
        client.setPageNumber(Integer.parseInt(request.getParameter("pageNumber")));
        client.setSocialName(request.getParameter("socialName"));
        client.setResponsiblePerson(request.getParameter("responsiblePerson"));
        client.setCommercialContact(request.getParameter("commercialContact"));
        client.setEmail(request.getParameter("email"));
        client.setPhone(request.getParameter("phone"));
        client.setFiscalAddress(request.getParameter("fiscalAddress"));
        client.setShippingAddress(request.getParameter("shippingAddress"));
        client.setAccountingLink(request.getParameter("accountingLink"));
        client.setInvoiceFormat(request.getParameter("invoiceFormat"));
        client.setPaymentMethod(request.getParameter("paymentMethod"));
        client.setRiskLevel(request.getParameter("riskLevel"));
        client.setMaxCredit(new BigDecimal(request.getParameter("maxCredit")));
        formularioDAO.updateClient(client);
        response.sendRedirect(request.getContextPath() + "/clients/list");
    }

    private void deleteClient(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        formularioDAO.deleteClient(id);
        response.sendRedirect(request.getContextPath() + "/clients/list");
    }
}
